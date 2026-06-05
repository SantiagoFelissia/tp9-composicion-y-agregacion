package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class empresa {
    private String nombre;
    private List<chofer> choferes;
    private List<colectivo> colectivos;
    private List<categoria> categorias;

    public empresa(String nombre) {
        this.nombre = nombre;
        this.choferes = new ArrayList<>();
        this.colectivos = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void agregarChofer(chofer c) {
        choferes.add(c);
    }

    public void agregarColectivo(colectivo c) {
        colectivos.add(c);
    }

    public void agregarCategoria(categoria c) {
        categorias.add(c);
    }

    public int cantidadChoferesSinColectivo() {
        int count = 0;
        for (chofer c : choferes) {
            if (c.getColectivo() == null) count++;
        }
        return count;
    }

    
    public int cantidadColectivos() {
        return colectivos.size();
    }

    public List<chofer> choferesPorCategoria(String nombreCategoria) {
        List<chofer> resultado = new ArrayList<>();
        for (chofer c : choferes) {
            if (c.getCategoria().getNombreCategoria().equalsIgnoreCase(nombreCategoria)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public List<categoria> categoriasSueldoSuperiorA(double monto) {
        List<categoria> resultado = new ArrayList<>();
        for (categoria cat : categorias) {
            if (cat.getSueldo() > monto) {
                resultado.add(cat);
            }
        }
        return resultado;
    }


    public List<chofer> choferesSueldoSuperiorA(double monto) {
        List<chofer> resultado = new ArrayList<>();
        for (chofer c : choferes) {
            if (c.getSueldo() > monto) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public String getNombre() {
    	return nombre;
    	}
    public List<chofer> getChoferes() { 
    	return choferes; 
    	}
    public List<colectivo> getColectivos() {
    	return colectivos; 
    	}
    public List<categoria> getCategorias() {
    	return categorias;
    	}

    @Override
    public String toString() {
        return "Empresa: " + nombre +
               "Cantidad Choferes: " + choferes.size() +
               "cantidad de Colectivos: " + colectivos.size();
    }
}