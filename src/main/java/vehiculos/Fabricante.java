package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Fabricante {
	private static List<Fabricante> listado= new ArrayList<Fabricante>();
	private List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		listado.add(this);
		pais.setFabricante(this);
	}
	public Fabricante() {
		listado.add(this);
		pais.setFabricante(this);
	}
	public void setVehiculo(Vehiculo v) {
		vehiculos.add(v);
	}
	public List<Vehiculo> getVehiculos(){
		return vehiculos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Fabricante fabricaMayorVentas() {
		int aux=0;
		Fabricante p = null;
		for (Fabricante f : listado) {
			if(f.getVehiculos().size()>aux) {	
				aux=f.getVehiculos().size();
				p=f;
			}
		}
		return p;
	}
	

}
