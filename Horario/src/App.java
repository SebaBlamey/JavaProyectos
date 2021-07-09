
import java.io.*;
import java.util.Scanner;

public class App {

    //COLORES
    private static final String Black = "\u001B[30m";
    private static final String Red = "\u001B[31m";
    private static final String Green = "\u001B[32m";
    private static final String Yellow = "\u001B[33m";
    private static final String Blue = "\u001B[34m";
    private static final String Purple = "\u001B[35m";
    private static final String Cyan = "\u001B[36m";
    private static final String White = "\u001B[37m";
    private static final String Restorer = "\u001B[00m";

    public static String[] array = new String[2];

    private static void lecturaUsuario(SistemaHorario sistema) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String programVer = "V1.0";
        try{
            File f = new File("Usuario.txt");
            if(f.exists()){
                // leer archivos
                BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String linea;
                while ((linea = bf.readLine()) != null){
                    String[] partes = linea.split(",");
                    String nombre = partes[0];
                    String apellido = partes[1];
                    array[0] = nombre;
                    array[1] = apellido;
                }
            }else{
                f.createNewFile();
                String texto = "\nHola! Bienvenido(a) al SistemaHorario " + programVer + ". Este programa esta siendo" +
                        " desarrollado por SebaBlamey.Espero sea de tu agrado.";
                System.out.println("+---------------------------------------------------------+");
                StringAlignUtils util = new StringAlignUtils(59, StringAlignUtils.Alignment.LEFT);
                System.out.println(util.format(texto));
                System.out.println("+---------------------------------------------------------+");
                System.out.print("Por favor, ingresa tu " + Cyan + "Nombre " + Restorer + "y " + Cyan + "Apellido" +
                        Restorer + "->");
                String nombreCompleto = entrada.nextLine();
                String[] partes = nombreCompleto.split(" ");
                String nombre = partes[0];
                String apellido = partes[1];
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(nombre+","+apellido);
                bw.close();
                System.out.println("Perfecto " + Cyan + nombreCompleto + Restorer + " Por favor, reinicia el programa" +
                        " para continuar.");

            }
            System.out.println(Black + "[" + Green + "✓" + Black + "]" + Restorer + " Usuario Leido.");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public static void lecturaRamos(SistemaHorario sistema){
        try{
            File f = new File("Ramos");
            if(f.exists()){
                // leer Ramos
            }else{
                f.createNewFile();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }







    public static void main(String[] args) throws IOException, InterruptedException {
        SistemaHorario sistema = new SistemaHorarioImpl();
        lecturaUsuario(sistema);
        Thread.sleep(500);
        lecturaRamos(sistema);

    }


}
