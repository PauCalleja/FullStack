package MVC.model;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private List<Reservation> reservas = new ArrayList<>();

    public String reserve(User u, Book b){
        Reservation r = new Reservation(u,b);
        reservas.add(r);
        return r.toString();
    }

    public List<Reservation> getReservas() {
        return reservas;
    }
}
