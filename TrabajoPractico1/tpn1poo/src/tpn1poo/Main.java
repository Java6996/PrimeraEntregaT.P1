package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Opciones = {
				"Jugar partida","Salir"
				};
		int opcion =0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elegí una opcion", null, 
					opcion, opcion, null, Opciones, Opciones[0]);
			switch (opcion) {
			case 0:
				int capitulos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos capitulos tiene la campaña"));
					if (capitulos<=5) {
						JOptionPane.showMessageDialog(null, "Se puede jugar la partida.");
						int opcion1 =0;
						String[] Opciones1 = {
								"Zombies","Supervivientes","Salir"
								};
						do {
							opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
									opcion1, opcion1, null, Opciones1, Opciones1[0]);
							switch (opcion1) {
							case 0:
								String username=new Jugadores(null, false, false, capitulos).JugadoresZombies(null);
								Equipo.ListaJugadores(username, false, false);
								
								break;
								
							case 1:
								String username1=new Jugadores(null, false, false, capitulos).JugadoresSupers(username1);
								Equipo.ListaJugadores(username1, true, false);
								//supervivientes=Equipo.ListaJugadores(opcion, null);
								//JOptionPane.showMessageDialog(null, supervivientes);
								break;
							case 2:
								JOptionPane.showMessageDialog(null, "Saliendo de la partida.");
								break;
							} 
						}while (opcion1!=2);
				} else {
					JOptionPane.showMessageDialog(null, "No se puede jugar la partida, hay más de 5 capitulos.");
				}	
				
				case 1:
					JOptionPane.showMessageDialog(null, "Saliendo del menu principal.");
				break;
				}
		} while (opcion!=1);
	}
}