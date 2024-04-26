import java.util.Scanner;
public class distanciaRecorrida{//Velocidad en metros por segundo
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);



        System.out.println("Bienvenido este Software le permitira calcular la Distancia recorrida: ");


        System.out.println("El tiempo recorrido es de + "+ Tiempo()+" s");//Hay que darle los parametros de VelInicial y VelConstante
        System.out.println("Tiene una aceleracion de "+ Aceleracion()+" (M/s)^2");

        sc.close();
    }
    public static double Tiempo(double VelInicial,double VelConstante){
        return Math.round(Math.pow(5,VelInicial)*((VelConstante+VelInicial)/0.5));
    }

    //la aceleracion en metros por segundo cuadrado
    public static double Aceleracion(double VelInicial,double Fuerza){
        return Math.round((VelInicial*Fuerza)*Math.pow(2,Fuerza));
    }

    //la velocidad inicial en metros por segundo
    public static int VelInicial(int velocidadFinal, int variacionDeLaVelocidad){
        return velocidadFinal-variacionDeLaVelocidad;
    }



    //Posicón inicial en metros
    public static int PosInicial()

}
