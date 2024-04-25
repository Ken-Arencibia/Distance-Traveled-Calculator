import java.util.Scanner;
public class distanciaRecorrida{
//el tiempo está definido en segundos
    public static int tiempo(int a){
        return  a;
    }
//la aceleracion en metros por segundo cuadrado
    public static int aceleracion(){
        return;
    }
//Velocidad en metros por segundo
    public static int velocidadInicial(){
        return;
    }
//Posicón inicial en metros
    public static int posicionInicial(){
        return;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el tiempo: ");
        int time= sc.nextInt();
        System.out.println(1/2*aceleracion()*(tiempo(time)*tiempo(time))+(velocidadInicial()*tiempo(time)) + posicionInicial());
        sc.close();
    }
}
