import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args){

        //Variables
        float angleRad;
        int angleDeg;
        Scanner sc = new Scanner(System.in);

        //Angle radian
        System.out.print("Quel est l'angle en radian ? ");
        angleRad = sc.nextFloat();

        //Angle degré
        angleDeg = (int) (180 * (angleRad/Math.PI));
        System.out.print("Valeur en degré : " + angleDeg);

        sc.close();

    }
}
