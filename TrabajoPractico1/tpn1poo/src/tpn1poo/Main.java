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
								"Zombies","Supervivientes","Ver equipos","Salir"
								};
						do {
							opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
									opcion1, opcion1, null, Opciones1, Opciones1[0]);
							switch (opcion1) {
							case 0:
								String username=new Jugadores(null, false, false, capitulos).JugadoresZombies(null);
								Equipo.ListaJugadoresZombies(username, false);
								GestorEquipos.JugadorZombie(null, null);
								int puntos=0;
								if (Equipo.ListaJugadoresZombies(username, false)) {
								puntos=(int)(Math.random()*600);
								 if (puntos==500 || puntos>=500) {
									   JOptionPane.showMessageDialog(null, "El equipo zombie gano la partida con la cantidad de " + puntos + " puntos.");
								} else {
									JOptionPane.showMessageDialog(null, "El equipo zombie perdieron la partida.");
								}
								} else {
									JOptionPane.showMessageDialog(null, "No hay suficiente jugadores en el equipo zombie");
								}
								break;
								
							case 1:
								String username1=new Jugadores(null, true, false, capitulos).JugadoresSupers(null);
								Equipo.ListaJugadoresSupervivientes(username1, false);
								GestorEquipos.JugadorSuperviviente(null, null);
								if (Equipo.ListaJugadoresSupervivientes(username1, true)) {
									 puntos=(int)(Math.random()*600);
									 if (puntos==500 || puntos>=500) {
											JOptionPane.showMessageDialog(null, "El equipo superviviente gano la partida.");
									} else{
										   JOptionPane.showMessageDialog(null, "El equipo superviviente perdio la partida.");
									}
								} else {
									JOptionPane.showMessageDialog(null, "No hay suficiente jugadores en el equipo superviviente.");
								}
								break;
							case 2:
								int opcion2 =0;
								String[] Opciones2 = {
										"Zombies","Supervivientes","Salir"
										};
								do {
									opcion2= JOptionPane.showOptionDialog(null, "Elegí un equipo que quiere ver a sus jugadores", null, 
											opcion2, opcion2, null, Opciones2, Opciones2[0]);
								switch (opcion2) {
								case 0:
									JOptionPane.showMessageDialog(null, Equipo.ListaJugadoresZombies(null, true));
									break;
								case 1:
									JOptionPane.showMessageDialog(null, Equipo.ListaJugadoresSupervivientes(null, false));

									break;
								case 2:
									JOptionPane.showMessageDialog(null, "Saliendo del menu de ´Ver equipos´.");
									break;
								
								}
								} while (opcion2!=2);
								break;
							case 3:
								JOptionPane.showMessageDialog(null, "Saliendo de la partida.");
								break;
							} 
						}while (opcion1!=3);
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