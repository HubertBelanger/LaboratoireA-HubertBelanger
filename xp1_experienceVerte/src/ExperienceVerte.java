import java.util.Scanner;

public class ExperienceVerte {

    public static void main(String[]args){

        //Variables
        int A,B,C,D,E,F;
        int CO2, K1, K2, K3;
        Scanner sc = new Scanner(System.in);

        //Valeur des variables
        System.out.println("Entree des quantites...");

        System.out.print("A > ");
        A = sc.nextInt();
        System.out.print("B > ");
        B = sc.nextInt();
        System.out.print("C > ");
        C = sc.nextInt();
        System.out.print("D > ");
        D = sc.nextInt();
        System.out.print("E > ");
        E = sc.nextInt();
        System.out.print("F > ");
        F = sc.nextInt();
        CO2 = 0;

        System.out.println("A_0{" + A + "} B_0{" + B + "} C_0{" + C + "} D_0{" + D + "} E_0{" + E + "} F_0{" + F +
                "} CO2_0{" + CO2 + "}");

        //Reaction 1
        System.out.println("R1 : 2A + 4C => 3D + CO2");
        K1 = Math.min(A/2, B/4);
        System.out.println("> K : " + K1);
        System.out.println("> R1 : "+(K1*2)+"A + "+(K1*4)+"C => "+(K1*3)+"D + "+(K1*1)+"CO2");

        A -= (K1*2);
        C -= (K1*4);
        D += (K1*3);
        CO2 = (K1);

        System.out.println("A_1{" + A + "} B_1{" + B + "} C_1{" + C + "} D_1{" + D + "} E_1{" + E + "} F_1{" + F +
                "} CO2_1{" + CO2 + "}");

        //Reaction 2
        System.out.println("R2 : B + 2C + E => 4F + 4 CO2");
        K2 = Math.min(B, Math.min(C/2,E ));
        System.out.println("> K : " + K2);
        System.out.println("> R2 : "+(K2)+"B + "+(K2*2)+"C +" +(K2)+ "E => " +(K2*4)+ "F + "+(K2*4)+"CO2");

        B -= (K2);
        C -= (K2*2);
        E -= (K2);
        F += (K2*4);
        CO2 += (K2*4);

        System.out.println("A_2{" + A + "} B_2{" + B + "} C_2{" + C + "} D_2{" + D + "} E_2{" + E + "} F_2{" + F +
                "} CO2_2{" + CO2 + "}");

        //Reaction 3
        System.out.println("R3 : A/2 + 4F => B + 4E + CO2");
        K3 = Math.min(F/4, A*2);
        System.out.println("> K : "+K3);
        System.out.println("> R3 : "+(K3/2)+"A + "+(K3*4)+"F => "+(K3)+"B + "+(K3*4)+"E + "+(K3)+"CO2");

        A -= (K3/2);
        F -= (K3*4);
        B += (K3);
        E += (K3*4);
        CO2 += (K3);

        System.out.println("A_3{" + A + "} B_3{" + B + "} C_3{" + C + "} D_3{" + D + "} E_3{" + E + "} F_3{" + F +
                "} CO2_3{" + CO2 + "}");

        sc.close();

    }
}
