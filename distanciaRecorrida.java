import java.util.Scanner;
public class distanciaRecorrida{//Velocidad en metros por segundo
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);



        sc.close();
    }
    public static int Tiempo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores para la ecuación t = (a + b) * c / d:");

        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();

        System.out.print("Introduce el valor de d: ");
        double d = sc.nextDouble();

        double resultado = ((a + b) * c) / d;

        int tiempoS = (int) resultado;
        return tiempoS;
    }

    //la aceleracion en metros por segundo cuadrado
    public static int Aceleracion( double vel,double fuerza,double dist){}


    public static int VelInicial()



    //Posicón inicial en metros
    public static int PosInicial()

}
