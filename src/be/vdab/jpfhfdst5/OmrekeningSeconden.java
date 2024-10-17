package be.vdab.jpfhfdst5;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        int secondenBegin = 5924;
        int aantalUren;
        int aantalMinuten;
        int aantalSeconden;

        aantalUren = secondenBegin / 3600;
        System.out.println("U: " + aantalUren);
        aantalMinuten = (secondenBegin - (aantalUren * 3600)) / 60;
        System.out.println("M: " + aantalMinuten);
        aantalSeconden = (secondenBegin - (aantalUren * 3600 + aantalMinuten * 60));
        System.out.println("S: " + aantalSeconden);
    }
}
