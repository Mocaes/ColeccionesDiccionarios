package ejercicio1;
import java.util.HashMap;

public class HashMapEjemplo {
	public static void main(String[] args) {
		HashMap<String,String> emails=new HashMap<>();
		
	emails.put("Alberto Ruiz", "albertoruizprofesor@gmail.com");
	emails.put("Alberto digitechfp", "aruiz@digitechfp.com");
	emails.put("Alberto Cobarde pecador","superalbertron@gmail.com");
		
	String email = emails.get("Alberto Ruiz");
	System.out.println("El correo electrónico de Alberto Ruiz es "+ email);
	
	for (String key : emails.keySet()) {
	String value = emails.get(key);
	System.out.println(key + " -> " + value);
	}
	}
}
