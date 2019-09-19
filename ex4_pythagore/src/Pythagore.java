import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args){

        //Variables
        int a;
        int b;
        float c;
        Scanner sc = new Scanner(System.in);

        //Valeurs
        System.out.print("Quel est la valeur A : ");
        a = sc.nextInt();
        System.out.print("Quel est la valeur B : ");
        b = sc.nextInt();

        //Calcul et réponse
        c = (float)Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("Quel est la valeur de C : " + c);

        sc.close();

    }
}
