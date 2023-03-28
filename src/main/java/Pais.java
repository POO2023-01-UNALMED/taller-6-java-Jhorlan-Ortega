package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor(){
		ArrayList<Pais> paisFabri = new ArrayList<>();
		
		for(Fabricante fabricante : Fabricante.listaFabri) {
			paisFabri.add(fabricante.getPais());
		}
		int cont = 0;
		Pais paisCont = null;
		for(Pais pais : paisFabri){
			int cantPais = 0;
			for(int i = 0;i < paisFabri.size();i++) {
				if(paisFabri.get(i)==pais) {
					cantPais++;
				}
			}
			if(cantPais > cont) {
				cont = cantPais;
				paisCont = pais;
			}
		}
		return paisCont;
	}
}