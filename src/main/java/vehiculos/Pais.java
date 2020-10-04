package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private static List<Pais> listado= new ArrayList<Pais>();
	private List<Fabricante> fabricantes= new ArrayList<Fabricante>();
	
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	public Pais(){
		listado.add(this);
	}
	public void setFabricante(Fabricante f) {
		fabricantes.add(f);
	}
	public List<Fabricante> getFabricantes(){
		return fabricantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor(){
		int aux=0;
		Pais q = null;
		for (Pais p : listado) {
			if(p.getFabricantes().size()>aux) {	
				aux=p.getFabricantes().size();
				q=p;
			}
		}
		return q;
		
	}

}
