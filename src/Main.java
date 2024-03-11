import exception.InvalidIndex;
import exception.InvalidNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] casualNumbers = new int[5];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < casualNumbers.length; i++) {
            casualNumbers[i] = random.nextInt(1, 10) + 1;
            System.out.println(casualNumbers[i]);
        }

        int inputNumber = -1;
        do {
            try {
                System.out.println("Inserisci l'indice dove vuoi aggiungere il numero nell'array");
                int index = scanner.nextInt();


                if (index < 0 || index >= casualNumbers.length) {
                    throw new InvalidIndex(index);
                }

                System.out.println("Inserisci il numero da inserire (non superiore a 10):");
                inputNumber = scanner.nextInt();

                if (inputNumber == 0 && index == 0) {
                    break;
                }

                if (inputNumber < 1 || inputNumber > 10) {
                    throw new InvalidNumber(inputNumber);
                }

                casualNumbers[index] = inputNumber;
                System.out.println("Nuovo stato dell'array:");
                for (int num : casualNumbers) {
                    System.out.println(num);
                }

            } catch (InvalidIndex e) {
                System.out.println("Errore nell'indice:");
            } catch (InvalidNumber e) {
                System.out.println("Errore nel numero:");
            }


        } while (true);

        scanner.close(); // Chiudi lo scanner per evitare leak di risorse
        System.out.println("Programma terminato.");
    }
}
