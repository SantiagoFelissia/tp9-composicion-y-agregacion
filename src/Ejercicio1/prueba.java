package Ejercicio1;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1=new Empleado("Santiago", 22, "santiago03@gmail.com");
		Productos p1=new Productos(5,"pequeño objeto negro", 25);
		lineaspedidos l1= new lineaspedidos(p1,25);
		ArrayList<lineaspedidos> lineas = new ArrayList<>();

		lineas.add(l1);

		Pedido pe1 = new Pedido(e1, 58,p1, lineas);
		System.out.println(pe1.toString());
	}

	
}
