package ejercicio2;
public class domicilio {
    private String calle;
    private int numero;

    public domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() { return calle; }
    public int getNumero() { return numero; }

    @Override
    public String toString() {
        return calle + " " + numero;
    }
}