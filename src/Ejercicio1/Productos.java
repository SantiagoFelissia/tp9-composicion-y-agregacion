package Ejercicio1;
/*
 * Un Producto, tendrá un número de código, una descripción, y un precio unitario.
 * 
 **/
public class Productos {
	private int numero_de_codigo;
	private String descripcion;
	private int precio;
	public Productos(int numero_de_codigo, String descripcion, int precio) {
		super();
		this.numero_de_codigo = numero_de_codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getNumero_de_codigo() {
		return numero_de_codigo;
	}
	public void setNumero_de_codigo(int numero_de_codigo) {
		this.numero_de_codigo = numero_de_codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
