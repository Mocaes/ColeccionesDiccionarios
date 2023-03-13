package ejercicio3;
import java.util.Stack;

public class StackEjemplo {
	
	public static void main(String[] args) {
		
	Stack<String> pila = new Stack<>();
 
		pila.push("Portatil");
		pila.push("Impresora");
		pila.push("Tablet");
		pila.push("Móvil");
		
	String elementoSuperior = pila.peek();
	System.out.println("El elemento superior es(peek): " +elementoSuperior);
	String elementoEliminado = pila.pop();
	System.out.println("El elemento eliminado es: (pop)" +elementoEliminado);
 	
	while (pila.empty()==false) { 
	 String elemento = pila.pop();
	 System.out.println("Elemento: " + elemento);
 	}

 }
}