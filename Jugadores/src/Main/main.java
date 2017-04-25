package Main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Models.jugador;

public class main {

	public static void main(String[] args) {

		jugador c1 = new jugador("Messi", 10, 29, 1.70f, 2345);
		jugador c2 = new jugador("Pique", 3, 30, 1.94f, 2230);
		jugador c3 = new jugador("Iniesta", 8, 32, 1.71f, 2800);
		jugador c4 = new jugador("Neymar", 11, 25, 1.75f, 1400);
		jugador c5 = new jugador("Suarez", 9, 30, 1.82f, 2023);
		
		Set<jugador> equipo=new HashSet<jugador>(); //HashSet no agrega elementos duplicados.
		
		equipo.add(c1);
		equipo.add(c2);
		equipo.add(c3);
		equipo.add(c4);
		equipo.add(c5);
		//*********************************************************************************************
		// FOR EACH
		
		// foreach para recorrer colecion y imprimir Nombre, dorsal y n. partidas jugadas
		/*for (jugador prueba:equipo){
			System.out.println(prueba.getNombre()+" "
		+ prueba.getDorsal()+" "+prueba.getPartidasJugadas());
		}
 */
				
		
		// Este bucle va recorriendo la coleccion uno a uno, y el getNombre es igual a Messi, en teoria lo borrara
	       
		
		/*
		    for(jugador prueba:equipo){
			if(prueba.getNombre().equals("Messi")){
				equipo.remove(prueba);
			}
		}
		
		// si intentamos eliminar un elemento de una coleccion a la vez que la recorremos, nos saltara una excepcion
		// ConcurrentModificationExeption
		
		*/
					
		//********************************************************************************************************	
				//ITERATOR
		// la interfaz iterator es generica(<t>), 
		//hereda de collection,y el metodo iterator() devuelve un objeto de tipo iterator 
		
		//Iterator<jugador> it=equipo.iterator();
		//Imprimira el nombre, para imprimir varios elementos es mas complejo
		//Se suele utilizar el bucle while, que quiere decir, que mientras haya elementos que recorrer, 
		//imprimira la variable 'nombre_jugador', que la hemos asignado a next().getNombre
		//el metodo next() es lo que nos permite ir pasando de elemento a elemento
		
		/*while(it.hasNext()){
			String nombre_jugador=it.next().getNombre();
			
			System.out.println(nombre_jugador);
			*/
		  // int n_dorsal=it.next().getDorsal();
		   
		  // System.out.println(n_dorsal);
		   // si vuelves a utilizar el metodo next , va a saltar una posicion, por lo que no funciona
		// Para eliminar un elemento es muy util el iterator, con este bucle while recorremos la coleccion uno a uno
		// y si encuentra un getNombre que sea igual a 'Neymar', lo eliminara de la coleccion, cosa que con el foreach 
		// saltaba una excepcion
				Iterator <jugador> it=equipo.iterator();
				while(it.hasNext()){
					String nombre_jugador=it.next().getNombre();
					
					if(nombre_jugador.equals("Neymar")){
						it.remove();
					}
				}
				
				for (jugador prueba:equipo){
					System.out.println(prueba.getNombre()+" "
				+ prueba.getDorsal()+" "+prueba.getPartidasJugadas());
				}
		 
		   
		}
		// RESUMEN: el Iterator es mucho mas sencillo y eficaz para eliminar elementos de una colección, pero a su vez 
	    // mas complejo para imprimir varios datos de un objeto, como puede ser querer imprimir el nombre, dorsal y numero
	    // de partidos jugados de un jugador a la vez
		
	

	}


