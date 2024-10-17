package be.vdab.jpfhfdst5;

public class Bankrekeningnummer {
    public static void main(String[] args) {
        long bankrekeningnummer = 737524091952L;
        long eersteTienCijfers = bankrekeningnummer / 100;
//        System.out.println(eersteTienCijfers);

        if (eersteTienCijfers % 97 == bankrekeningnummer % 100) {
            System.out.println(bankrekeningnummer + " is geldig");

        } else {
            System.out.println(bankrekeningnummer + " is niet geldig");
        }
    }
}
