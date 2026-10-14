package MVC;

import MVC.controller.ReservationController;
import MVC.model.ReservationService;
import MVC.view.ConsoleView;

public class MainMVC {
    public static void main(String[] args) {
        ReservationService rs = new ReservationService();
        ConsoleView cv = new ConsoleView();
        ReservationController rc = new ReservationController(rs,cv);

        rc.crearMenu();
    }
}
