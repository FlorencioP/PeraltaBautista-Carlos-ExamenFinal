package ec.edu.ups.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Restaurante implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
    private String direccion;
    private String telefono;
    private String aforo;
    
    
    public Restaurante(int id,String nombre,String direccion, String telefono, String aforo) {
		this.setId(id);
    	this.setNombre(nombre);
    	this.setDireccion(direccion);
    	this.setTelefono(telefono);
    	this.setAforo(aforo);
    }
	

    public Restaurante() {
    	super();
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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getAforo() {
		return aforo;
	}


	public void setAforo(String aforo) {
		this.aforo = aforo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
