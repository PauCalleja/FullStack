package MVC.controller;

import MVC.model.Book;
import MVC.model.ReservationService;
import MVC.model.User;
import MVC.view.ConsoleView;

public class ReservationController {
    public ReservationService rs;
    public ConsoleView cv;

    public ReservationController(ReservationService rs, ConsoleView cv) {
        this.rs = rs;
        this.cv = cv;
    }

    public void crearMenu() {
        int op;
        do {
            op = cv.mostrarMenu();
            switch (op) {
                case 1:
                    User u = new User(cv.demanarNom());
                    Book b = new Book(cv.demanarTitol());
                    cv.showConfirmation(rs.reserve(u, b));
                    break;

                case 2:
                    cv.mostrarReservas(rs.getReservas());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (op != 0);
    }
}
