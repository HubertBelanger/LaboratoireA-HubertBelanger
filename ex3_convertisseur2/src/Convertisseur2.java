import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args){

        //Variables
        int angleDeg;
        double angleRad;
        Scanner sc = new Scanner(System.in);

        //Angle degré
        System.out.print("Quel est l'angle en degré ? ");
        angleDeg = sc.nextInt();

        //Angle radian
        angleRad = Math.toRadians(angleDeg);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.print("Valeur en radian : " + df.format(angleRad));

        sc.close();

    }
}
