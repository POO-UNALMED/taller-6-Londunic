package vehiculos;

public class Camioneta extends Vehiculo {
	private static int camionetas;
	boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso,"4x4", fabricante);
		this.volco = volco;
		camionetas++;
	}
	
	public Camioneta(){
		velocidadMaxima=90;
		traccion="4x4";
		camionetas++;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int cantidadCamionetas() {
		return camionetas;
	}

	public static void setCamionetas(int camionetas) {
		Camioneta.camionetas = camionetas;
	}
	

}
