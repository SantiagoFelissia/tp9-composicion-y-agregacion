package ejercicio2;

public class colectivo {
	    private static int contadorInterno = 1;

	    private String modelo;
	    private int numeroInterno;

	    public colectivo(String modelo) {
	        this.modelo = modelo;
	        this.numeroInterno = contadorInterno++;
	    }

	    public String getModelo() { return modelo; }
	    public int getNumeroInterno() { return numeroInterno; }

		@Override
		public String toString() {
			return "colectivo [modelo=" + modelo + ", numeroInterno=" + numeroInterno + "]";
		}

	    
	}

