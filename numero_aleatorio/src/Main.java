import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Agent a= new Agent();
        Scanner s= new Scanner(System.in);
        String respuesta;

        System.out.println("el maximo es: "+a.getMax()+" el minimo es : "+a.getMin()
        +"esta corriendo por primera vez: "+a.isFirstRun()+" el ultimo número fue: "+a.getLastNumber());

        respuesta = a.program("primera vez");
        //System.out.println(respuesta);
        while(respuesta != "DEATH"){
            System.out.println(respuesta);
            respuesta= a.program(s.nextLine());


        }
    }
}
