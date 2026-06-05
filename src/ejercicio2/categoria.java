package ejercicio2;

public class categoria {
    private String nombreCategoria;
    private double sueldo;

    public categoria(String nombreCategoria, double sueldo) {
        this.nombreCategoria = nombreCategoria;
        this.sueldo = sueldo;
    }

    public String getNombreCategoria() { return nombreCategoria; }
    public double getSueldo() { return sueldo; }

	@Override
	public String toString() {
		return "categoria [nombreCategoria=" + nombreCategoria + ", sueldo=" + sueldo + "]";
	}

    
}