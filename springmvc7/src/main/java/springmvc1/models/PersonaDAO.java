package springmvc1.models;

public class PersonaDAO {
	String id, nombre, apellidos;
	
	public PersonaDAO() {
		
	}

	public PersonaDAO(String id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
}
