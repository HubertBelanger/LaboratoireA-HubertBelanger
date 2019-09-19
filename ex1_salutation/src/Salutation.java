import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        //Variable
        String nom = "";
        Scanner sc = new Scanner(System.in);

        //Question et réponse
        System.out.print("Quel est votre nom? ");
        nom = sc.next();
        System.out.print("Bonjour " + nom);

        sc.close();

    }
}
