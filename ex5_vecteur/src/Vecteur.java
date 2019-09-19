import java.util.Scanner;

public class Vecteur{

    public static void main(String[]args){

        //Variables
        float xa, ya, za, xb, yb, zb;
        float distance;
        Scanner sc = new Scanner(System.in);

        //Point A
        System.out.println("Quel sont les coordonnées du point A ? ");
        System.out.print("xa : ");
        xa = sc.nextFloat();
        System.out.print("ya : ");
        ya = sc.nextFloat();
        System.out.print("za : ");
        za = sc.nextFloat();
        System.out.println("Le point A (" + xa + "," + ya + "," + za + ")");

        //Point B
        System.out.println("Quel sont le coordonnées du point B ? ");
        System.out.print("xb : ");
        xb = sc.nextFloat();
        System.out.print("yb : ");
        yb = sc.nextFloat();
        System.out.print("zb : ");
        zb = sc.nextFloat();
        System.out.println("Le point B (" + xb + "," + yb + "," + zb + ")");

        //Calcul
        distance = (float) (Math.sqrt(Math.pow((xb-xa), 2)+ Math.pow((yb-ya), 2)+ Math.pow((zb-za), 2)));
        System.out.println("La distance est : " + distance);

        sc.close();

    }
}

