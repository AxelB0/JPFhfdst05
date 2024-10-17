package be.vdab.jpfhfdst5;

public class SnoepAutomaat {
    public static void main(String[] args) {

        double prijsSnoep = 1.12;
        double muntstuk = 2;
        float wisselgeld = (float) (muntstuk -  prijsSnoep);

        System.out.println("Totaal wisselgeld: " + wisselgeld);


        while (wisselgeld >= 1) {
            System.out.println("Wisselgeld: €1");
            wisselgeld -= 1;
        }

//        System.out.println(wisselgeld);

        while (wisselgeld >= 0.5) {
            System.out.println("Wisselgeld: €0.50");
            wisselgeld -= 0.5F;
        }

//        System.out.println(wisselgeld);

        while (wisselgeld >= 0.2) {
            System.out.println("Wisselgeld: €0.20");
            wisselgeld -= 0.20F;
        }

//        System.out.println(wisselgeld);

        while (wisselgeld >= 0.1) {
            System.out.println("Wisselgeld: €0.10");
            wisselgeld -= 0.1F;
        }

        while (wisselgeld >= 0.05) {
            System.out.println("Wisselgeld: €0.05");
            wisselgeld -= 0.05F;
        }

        while (wisselgeld >= 0.02) {
            System.out.println("Wisselgeld: €0.02");
            wisselgeld -= 0.02F;
        }
//        System.out.println(wisselgeld);

        while (wisselgeld >0) {
            System.out.println("Wisselgeld: €0.01");
            wisselgeld -= 0.01F;
        }


    }
}
