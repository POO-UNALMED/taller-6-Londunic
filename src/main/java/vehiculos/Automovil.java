package vehiculos;

public class Automovil extends Vehiculo {
	private static int automoviles;
	int puestos;
	
	public Automovil(){
		puertas=4;
		velocidadMaxima=100;
		traccion="FWD";
		automoviles++;
	}
	
	public Automovil(String placa,String nombre, int precio, int peso,Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		automoviles++;
	}

	public static int cantidadAutomoviles() {
		return automoviles;
	}

	public static void setAutomoviles(int automoviles) {
		Automovil.automoviles = automoviles;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

}
