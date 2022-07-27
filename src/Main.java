
public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setNombre("Manuel");
		System.out.println("NOMBRE: " + persona.getNombre());
		
		persona.setEdad(28);
		System.out.println("EDAD: " + persona.getEdad());
		
		persona.setTelefono(1234567);
		System.out.println("TELEFONO: " + persona.getTelefono());
			
		}	
	}

class Persona {
	private String nombre;
	private int edad;
	private int telefono;
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setTelefono (int telefono) {
		this.telefono = telefono;
	}
	
	public int getTelefono () {
		return telefono;
	}
	
}