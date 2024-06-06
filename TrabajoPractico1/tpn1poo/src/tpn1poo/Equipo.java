package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo{
		// TODO Auto-generated constructor stub
	private LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
	private int capitulos;
	
	public Equipo(int capitulos) {
		super();
		this.capitulos = capitulos;
	}

	public LinkedList<Jugadores> getListaJugadores() {
		return ListaJugadores;
	}

	public void setListaJugadores(LinkedList<Jugadores> ListaJugadores) {
		this.ListaJugadores = ListaJugadores;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public int setCapitulos(int capitulos) {
		return this.capitulos = capitulos;
	}
	@Override
	public String toString() {
		return "Equipo [ListaJugadores=" + ListaJugadores + ", capitulos=" + capitulos + "\n]";
	}
	
	public static boolean ListaJugadores(String username, boolean supervivientes,boolean zombies){
		LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
		zombies=ListaJugadores.addAll(ListaJugadores);
		JOptionPane.showMessageDialog(null, zombies);
		return zombies;
			
	}
}	