import java.util.Scanner;

public class Resolution{

    public static void main(String[]args){

        //Variables
        float a, b, c, x1, x2, discriminant;
        Scanner sc = new Scanner(System.in);

        //Valeur des variables
        System.out.println("Entree des valeurs...");
        System.out.print("a > ");
        a = sc.nextFloat();
        System.out.print("b > ");
        b = sc.nextFloat();
        System.out.print("c > ");
        c = sc.nextFloat();
        System.out.println("Equation :  "+a+"x2+"+b+"x+"+c+"=0");

        //Discriminant
        discriminant = (float)Math.pow(b,2)-(4*a*c);
        System.out.println("discriminant : "+discriminant);

        //Operation x1
        x1 = (float)(-b + Math.sqrt(discriminant))/(2*a);
        System.out.println("x1 : " + x1);

        //Operation x2
        x2 = (float)(-b - Math.sqrt(discriminant))/(2*a);
        System.out.println("x2 : " + x2);

        sc.close();;

    }
}
