package MVC.model;

public class Reservation {
    private User usuario;
    private Book libro;

    public Reservation(User usuario, Book libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Reserva: " + usuario.getNom() + " ha reservat " + libro.getTitol();
    }
}
