package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipos{
		// TODO Auto-generated constructor stub
	private Equipo supervivientes;
    private Equipo zombies;

	public Equipo getZombies() {
		return zombies;
	}
	public void setZombies(Equipo zombies) {
		this.zombies = zombies;
	}
	public Equipo getSupervivientes() {
		return supervivientes;
	}
	public void setSupervivientes(Equipo supervivientes) {
		this.supervivientes = supervivientes;
	}
	@Override
	public String toString() {
		return "GestorEquipos [supervivientes=" + supervivientes + ", zombies=" + zombies + "]";
	}
	 public static void JugadorSuperviviente(Equipo equipo,Jugadores jugador) {
		 Equipo.ListaJugadoresSupervivientes(null, true);
	    }

	    public static void JugadorZombie(Equipo equipo,Jugadores jugador) {
	    	Equipo.ListaJugadoresSupervivientes(null, false);
			 
	    }
	    
	
	}