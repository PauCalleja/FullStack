package MVC.view;

import MVC.model.Reservation;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        int op;

        System.out.println("-----Reserva de llibres-----");
        System.out.println("1. Nova Reserva");
        System.out.println("2. Llista de reserves");
        System.out.println("0. Sortir");
        System.out.println("----------------------------");

        while (true) {
            System.out.print("Escull una opció: ");
            try {
                op = Integer.parseInt(sc.nextLine());
                return op;
            } catch (Exception e) {
                System.out.println("Error: has d'introduir una opció vàlida.");
            }
        }
    }


    public String demanarNom() {
        String nom;

        do {
            System.out.print("Introdueix el teu nom: ");
            nom = sc.nextLine();

            if (nom.isEmpty()) {
                System.out.println("Error: el nom no pot estar buit.");
            }
        } while (nom.isEmpty());

        return nom;
    }

    public String demanarTitol() {
        String titol;

        do {
            System.out.print("Introdueix el títol del llibre: ");
            titol = sc.nextLine();

            if (titol.isEmpty()) {
                System.out.println("Error: el títol no pot estar buit.");
            }
        } while (titol.isEmpty());

        return titol;
    }

    public void mostrarReservas(List<Reservation> reservas) {
        if (reservas.isEmpty()) {
            System.out.println("No hi ha reserves.");
        } else {
            for (Reservation r : reservas) {
                System.out.println(r);
            }
        }
    }

    public void showConfirmation(String reserva){
        System.out.println(reserva);
    }

}
