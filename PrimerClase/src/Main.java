
public class Main {
	
	public static void main (String[] string) {
		Persona p1 = new Persona();
		
		
		p1.setNombre("Mariano");
		p1.setApellido("Lopez");
		p1.setDni(29232230);
		
		Persona p2 = new Persona(p1);
		
		
		
		if (p1.equals(p2)) {
		System.out.println(p1.equals(p2));
		} else {
		
		System.out.println(p1.toString());
		}
			
		
		int a = 5;
		int b = 0;
		for (int i = 0; i <= 5; i++) {
			b += i*2;
		}
	}

}
