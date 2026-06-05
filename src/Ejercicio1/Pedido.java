package Ejercicio1;

import java.util.ArrayList;

/*Un Pedido involucra un empleado (al cual es el responsable del pedido), una fecha, y un
ArrayList de líneas de pedido cada línea de pedido consta de un producto específico, y de una
cantidad. Deberá poder informar el costo total del pedido.
*/
public class Pedido {
 private Empleado empleado;
 private int cantidad;
 private Productos producto;
 private ArrayList<lineaspedidos> lineas;
 public Pedido(Empleado empleado, int cantidad, Productos producto, ArrayList<lineaspedidos> lineas) {
	super();
	this.empleado = empleado;
	this.cantidad = cantidad;
	this.producto = producto;
	this.lineas = lineas;
 }
 public Empleado getEmpleado() {
	return empleado;
 }
 public void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
 }
 public int getCantidad() {
	return cantidad;
 }
 public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
 }
 public Productos getProducto() {
	return producto;
 }
 public void setProducto(Productos producto) {
	this.producto = producto;
 }
 public ArrayList<lineaspedidos> getLineas() {
	return lineas;
	
 }
 public void setLineas(ArrayList<lineaspedidos> lineas) {
	this.lineas = lineas;
 }
 @Override
 public String toString() {
	return "Pedido [empleado=" + empleado + ", cantidad=" + cantidad + ", producto=" + producto + ", lineas=" + lineas
			+ "]";
 }
 

 
}
