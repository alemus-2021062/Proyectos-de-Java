import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Inicio {
    public void reportes(){
		Leer dato=new Leer();
		
		String nombreReporte;
		
        try {
			System.out.println("------Escriba el nombre del reporte-----");
			nombreReporte=dato.ingresarTexto();
            String ruta = "/c:/programasjava/proyectofinal/"+nombreReporte+".txt";
			System.out.println("----------Escriba el reporte-------");
            String contenido = dato.ingresarTexto();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}