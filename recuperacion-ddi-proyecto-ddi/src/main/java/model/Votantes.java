package model;

public class Votantes{
	private int id;
	private String nombre;
	private int voto;
	private String email;
	private String code;
	
	public Votantes(int id, String nombre, int voto, String email, String code) {
	
		this.id = id;
		this.nombre = nombre;
		this.voto = voto;
		this.email = email;
		this.code = code;
		}

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVoto() {
        return voto;
    }
    public void setVoto(int voto) {
        this.voto = voto;
    }
}
