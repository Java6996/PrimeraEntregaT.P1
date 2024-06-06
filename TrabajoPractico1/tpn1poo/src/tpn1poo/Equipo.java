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
	
	public static boolean ListaJugadoresZombies(String username, boolean zombies){
		LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
		zombies=ListaJugadores.addAll(ListaJugadores);
		JOptionPane.showMessageDialog(null, zombies);
		return zombies;
			
	}
	public static boolean ListaJugadoresSupervivientes(String username, boolean supervivientes){
		LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
		supervivientes=ListaJugadores.addAll(ListaJugadores);
		JOptionPane.showMessageDialog(null, supervivientes);
		return supervivientes;
			
	}
}	