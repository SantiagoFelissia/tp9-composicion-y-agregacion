package ejercicio2;

public class chofer {
    private String nombre;
    private categoria categoria;
    private domicilio domicilio;
    private colectivo colectivo; 

    public chofer(String nombre, categoria categoria, domicilio domicilio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.domicilio = domicilio;
        this.colectivo = null;
    }

    public void asignarColectivo(colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public void desvincularColectivo() {
        this.colectivo = null;
    }

    public String getNombre() { return nombre; }
    public categoria getCategoria() { return categoria; }
    public domicilio getDomicilio() { return domicilio; }
    public colectivo getColectivo() { return colectivo; }
    public double getSueldo() { return categoria.getSueldo(); }

	@Override
	public String toString() {
		return "chofer [nombre=" + nombre + ", categoria=" + categoria + ", domicilio=" + domicilio + ", colectivo="
				+ colectivo + "]";
	}

   
}
