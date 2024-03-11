package esercizio2;

import esercizio2.exception1.InvalidLiterFuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litri;
        int km;
        System.out.println("inserisci il numero di litri consumati: ");
        litri = sc.nextInt();
        System.out.println("inserisci il numero di km percorsi: ");
        km = sc.nextInt();

        try {
            if (litri == 0) {
                throw new InvalidLiterFuel(litri);
            }

        } catch (
                InvalidLiterFuel ignored) {
        } finally {
            sc.close();
        }
        int litriXKm = litriXKm(litri, km);
        System.out.println("il numero di litri consumati per km è: " + litriXKm);
    }

    public static int litriXKm(int litri, int km) {
        return litri / km;
    }
}
