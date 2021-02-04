package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ec.edu.ups.ejb.PersonaFacade;
import ec.edu.ups.entidades.Persona;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class PersonaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PersonaFacade ejbPersonaFacade;
	
	public static Persona persona;
	
	public static List<Persona> personas;
	
	private String nombre;
	private String apellido;
    private String direccion;
    private String telefono;
    private String cedula;
    
    
    
    public String agregar() {
    	persona = null;
    	

    		Persona persona2= new Persona(0, nombre, apellido, cedula, direccion, telefono);
        	ejbPersonaFacade.create(persona2);
        	nombre="";
        	apellido="";
        	direccion="";
        	telefono="";
        	cedula="";
    	
    	return "Bolas";
    }
    
    @PostConstruct
    public void init() {
    	Persona persona2= new Persona(0, "nombre", "apellido", "cedula", "direccion", "telefono");
    	ejbPersonaFacade.create(persona2);
    	
    }

	public PersonaFacade getEjbPersonaFacade() {
		return ejbPersonaFacade;
	}

	public void setEjbPersonaFacade(PersonaFacade ejbPersonaFacade) {
		this.ejbPersonaFacade = ejbPersonaFacade;
	}

	public static Persona getPersona() {
		return persona;
	}

	public static void setPersona(Persona persona) {
		PersonaBean.persona = persona;
	}

	public static List<Persona> getPersonas() {
		return personas;
	}

	public static void setPersonas(List<Persona> personas) {
		PersonaBean.personas = personas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
    
    
    
   




	
    
}
