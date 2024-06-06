package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo{
		// TODO Auto-generated constructor stub
	private LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();

	public LinkedList<Jugadores> getListaJugadores() {
		return ListaJugadores;
	}

	public void setListaJugadores(LinkedList<Jugadores> ListaJugadores) {
		this.ListaJugadores = ListaJugadores;
	}
	@Override
	public String toString() {
		return "Equipo [ListaJugadores=" + ListaJugadores + "\n]";
	}
	
	public static boolean ListaJugadoresZombies(String username, boolean zombies){
		LinkedList<Jugadores> ListaSupers=new LinkedList<Jugadores>();
		zombies=ListaSupers.addAll(ListaSupers);
		JOptionPane.showMessageDialog(null, zombies);
		return zombies;
			
	}
	public static boolean ListaJugadoresSupervivientes(String username, boolean supervivientes){
		LinkedList<Jugadores> ListaZombies=new LinkedList<Jugadores>();
		supervivientes=ListaZombies.add(null);
		JOptionPane.showMessageDialog(null, supervivientes);
		return supervivientes;
		
			
	}
}	