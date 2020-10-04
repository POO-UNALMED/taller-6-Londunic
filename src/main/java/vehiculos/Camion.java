package vehiculos;


public class Camion extends Vehiculo {
	private static int camiones;
	int ejes;
	
	public Camion() {
		puertas=2;
		velocidadMaxima=80;
		traccion="4x2";
		camiones++;
	}
	public Camion(String placa,String nombre, int precio, int peso,Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso,"4x2", fabricante);
		this.ejes = ejes;
		camiones++;
	}
	
	public static int cantidadCamiones() {
		return camiones;
	}
	public static void setCamiones(int camiones) {
		Camion.camiones = camiones;
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
