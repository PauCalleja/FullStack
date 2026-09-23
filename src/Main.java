import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> usuaris = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            op = mostrarMenu(sc);
            if (op == 1) {
                obrirSubmenu(sc,usuaris);
            } else if (op == 2) {
                System.out.println("Estat del sistema correcte");
            }
        } while (op != 0);
    }

    public static int mostrarMenu(Scanner sc){
        System.out.println("Menú Principal");
        System.out.println("1. Gestió d'Usuaris");
        System.out.println("2. Veure estat del sistema");
        System.out.println("0. Sortir");
        return escolliropcio(sc);
    }

    public static void obrirSubmenu(Scanner sc, ArrayList<String> usuaris){
        int opcion;
        do {
            System.out.println("Submenú d'usuaris");
            System.out.println("1. Llistar usuaris");
            System.out.println("2. Afegir nou usuari");
            System.out.println("0. Tornar al menú principal");

            opcion = escolliropcio(sc);
            if (opcion == 1) {
                llistarUsuaris(usuaris);
            } else if (opcion == 2) {
                afegirUsuari(sc, usuaris);
            }
        } while (opcion != 0);
    }

    public static void afegirUsuari(Scanner sc, ArrayList<String> usuaris){
        System.out.print("Escriu el nom de l'usuari: ");
        String nom = sc.nextLine();
        usuaris.add(nom);
        System.out.println("Usuari Creat amb éxit");
    }

    public static void llistarUsuaris(ArrayList<String> usuaris){
        if (usuaris.isEmpty()) {
            System.out.println("No hi ha cap usuari registrat.");
        } else {
            System.out.println("Llista d'usuaris:");
            for (int i = 0; i < usuaris.size(); i++) {
                System.out.println((i + 1) + ". " + usuaris.get(i));
            }
        }
    }

    public static int escolliropcio(Scanner sc){
        System.out.print("Escull una opció: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }
}