public class Geometrie {

    public static void main(String[]args){

        //variables
        float rayon, longueur, surface, volume, hauteur, apotheme;


        //Le cercle
        rayon = 10;
        surface = (float) (Math.PI*Math.pow(rayon, 2));

        System.out.println("Le cercle");
        System.out.println(" - Rayon     : " + rayon);
        System.out.println(" - Surface   : " + surface);


        //Le cube
        longueur = 7;
        surface = (float) (6*Math.pow(longueur, 2));
        volume = (float) (Math.pow(longueur, 3));

        System.out.println("Le cube");
        System.out.println(" - Longueur  :" + longueur);
        System.out.println(" - Surface   :" + surface);
        System.out.println(" - Volume    :" + volume);


        //Le cylindre
        rayon = 10;
        hauteur = 5;
        surface = (float) ((2*Math.PI*rayon*hauteur)+2*Math.PI*Math.pow(rayon, 2));
        volume = (float) (Math.PI*Math.pow(rayon, 2)*hauteur);

        System.out.println("Le cylindre");
        System.out.println(" - Rayon     :" + rayon);
        System.out.println(" - Hauteur   :" + hauteur);
        System.out.println(" - Surface   :" + surface);
        System.out.println(" - Volume    :" + volume);


        //Le cone
        rayon = 3;
        hauteur = 7;
        apotheme = (float) (Math.sqrt(Math.pow(hauteur, 2)+Math.pow(rayon, 2)));
        surface = (float) (Math.PI*rayon*apotheme + Math.PI*Math.pow(rayon, 2));
        volume = (float) (Math.PI*Math.pow(rayon, 2)*hauteur/3);

        System.out.println("Le cone");
        System.out.println(" - Rayon     :" + rayon);
        System.out.println(" - Hauteur   :" + hauteur);
        System.out.println(" - Apotheme  :" + apotheme);
        System.out.println(" - Surface   :" + surface);
        System.out.println(" - Volume    :" + volume);

    }
}
