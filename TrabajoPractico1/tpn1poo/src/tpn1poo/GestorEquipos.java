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
	 public void JugadorSuperviviente(Equipo equipo,Jugadores jugador) {
		 int puntos=0;
		 Equipo.ListaJugadores(0, null, null);
		 if (Equipo.ListaJugadores(4, null, null).isEliminado()) {
				JOptionPane.showMessageDialog(null, "El equipo superviviente perdieron la partida.");
		} else if(Equipo.ListaJugadores(0, null, null).isVivo()){
			puntos += 500;
			   JOptionPane.showMessageDialog(null, "El equipo superviviente gano la partida con la cantidad de " + puntos + " puntos.");
		}
	    }

	    public void JugadorZombie(Equipo equipo,Jugadores jugador) {
			 Equipo.ListaJugadores(0,null, null);
	    }
	    
	
	}