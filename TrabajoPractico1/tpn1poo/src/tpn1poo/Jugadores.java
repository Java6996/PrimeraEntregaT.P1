package tpn1poo;


import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Jugadores {
	private String username;
	private boolean vivo;
	private boolean eliminado;
	public Jugadores(Jugadores zombies, boolean vivo, boolean eliminado, String username) {
		super();
		this.username = username;
		this.vivo = vivo;
		this.eliminado = eliminado;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	@Override
	public String toString() {
		return "Jugadores [username=" + username + ", vivo=" + vivo + ", eliminado=" + eliminado + "\n]";
	}
	public String JugadoresSupers (String username) {
		for (int i = 1; i <=4; i++) {
			username=JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador superviviente " + i);
		}
		return username;

	}
	public String JugadoresZombies (String username) {
		for (int i = 1; i <=4; i++) {
			username=JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador zombies " + i);
		}
		return username;

	}
	public boolean Vivo(boolean vivo) {
		return true;
	}
	public boolean Eliminado(boolean eliminado) {
		return false;
	}	
}