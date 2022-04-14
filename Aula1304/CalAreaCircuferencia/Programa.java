import java.util.Scanner;
class Programa{
    public static final double PI = 3.14159;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a medida do r : ");
        double r = sc.nextDouble();

        //circuferencia
        double c = circuferencia(r);
        //volume
        double v = volume(r);

        System.out.println("Circuferencia :  " + c);
        System.out.println("Volume :  " + v);
    }
    public static double circuferencia( double r) {
        return PI * r * r;
    }

    public static double volume( double r) {
        return (4 * PI * r * r * r)/3;
    }
    

    
}