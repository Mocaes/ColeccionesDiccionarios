package ejercicio6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEjemplo {
	
 public static void main(String[] args) {	 
	 Queue<String> cola = new LinkedList<>();

	 	cola.add("Blanco");
	 	cola.add("Verde");
	 	cola.add("Azul");
	 	cola.add("Amarillo");
 
	 System.out.println("los colores son "+cola);
	 String primerElemento = cola.peek();
	 System.out.println("El primer color es: " + primerElemento);
	 String elementoEliminado = cola.remove();
	 System.out.println("El color eliminado es: " + elementoEliminado);
	 System.out.println("los colores ahora son "+cola);
 }
}