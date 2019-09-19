public class Typage {

    public static void main(String[]args) {

        //Variables
        int var1 = 10;
        float var2 = 6/5;
        char var3 = 5;

        //Premiere conversion int en String
        String var1String = Integer.toString(var1);
        System.out.println("Conversion #1 : " + var1String);

        //Deuxieme conversion int en boolean
        boolean var1Bool = (var1 == 10);
        System.out.println("Conversion #2 : " + var1Bool+ " *Conversion impossible");
        //Conversion impossible

        //Troisieme conversion float en int
        int var2Int = (int)var2;
        System.out.println("Conversion #3 : "+ var2Int);

        //Quatrieme conversion float en String
        String var2IntString = Integer.toString(var2Int);
        System.out.println("Conversion #4 : "+var2IntString);

        //Cinquieme conversion boolean en int
        int var3Int = (int)var3;
        System.out.println("Conversion #5 : " +var3Int);

    }
}
