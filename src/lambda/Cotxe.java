package lambda;

public class Cotxe {
    private String marca;
    public Cotxe(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "lambda.Cotxe{" +
                "marca='" + marca + '\'' +
                '}';
    }
}