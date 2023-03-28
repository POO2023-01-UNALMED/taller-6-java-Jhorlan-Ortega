package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	int numVentas;
	
	public static ArrayList<Fabricante> listaFabri = new ArrayList<Fabricante>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		listaFabri.add(this);
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
	public static Fabricante fabricaMayorVentas(){
        int numMay = 0;
        Fabricante fabriMayVen = null;
        for (Fabricante fabricante : listaFabri) {
            if (fabricante.numVentas > numMay){
                numMay = fabricante.numVentas;
                fabriMayVen = fabricante;
            }
        }
        return fabriMayVen;
    }
}