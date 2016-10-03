import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;

/**
 * Clase Main
 * @author Jonnathan Juarez, 15377
 * @author Julio Barahona, 141206
 * @since 02/10/2016
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ingreso = new Scanner(System.in);
        VectorHeap<Paciente> vector = new VectorHeap<>();
        System.out.println("Bienvenido!\nSeleccione el archivo .TXT que contiene a los pacientes\n(presiona ENTER para continuar)");
        ingreso.nextLine();
        /*
         codigo tomado de :
         http://stackoverflow.com/questions/7494478/jfilechooser-from-a-command-line-program-and-popping-up-underneath-all-windows
         */
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("./src"));
        chooser.setDialogTitle("Seleccione su archivo");
        chooser.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "txt"));
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            try {
						/*Lee el archivo y obtiene la cadena*/
                FileInputStream directorio = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
                BufferedReader file = new BufferedReader(new InputStreamReader(directorio));

                String strLine;
                while ((strLine = file.readLine()) != null) {
                    String[] temp = strLine.split(", ");
                    String nombre = temp[0];
                    String descrip = temp[1];
                    String code = temp[2];
                    vector.add(new Paciente(nombre, descrip, code));
                }
                file.close();
            } catch (FileNotFoundException e) {
                System.out.println("Archivo Incorrecto!!");
            }
        }
        System.out.println("El orden para atender a los pacientes es:");
        System.out.println("NOMBRE        DESCRIPCION       ERcode");
        while (!vector.isEmpty()) {
            System.out.println(vector.remove().toString());
        }
    }
}