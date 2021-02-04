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
import ec.edu.ups.ejb.RestauranteFacade;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Restaurante;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class RestauranteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private RestauranteFacade ejbRestauranteFacade;
	
	public static Restaurante restaurante;
	
	
	private String nombre;
    private String direccion;
    private String telefono;
    private String aforo;
    
   
    
    public void agregar() {
    	restaurante = null;
    	

    	Restaurante rest= new Restaurante(0,nombre, direccion, telefono, aforo);
    	ejbRestauranteFacade.create(rest);
        	nombre="";
        	direccion="";
        	telefono="";
        	aforo="";
    	;
    		
    }
    
    @PostConstruct
    public void init() {
    	
    }

	public RestauranteFacade getEjbRestauranteFacade() {
		return ejbRestauranteFacade;
	}

	public void setEjbRestauranteFacade(RestauranteFacade ejbRestauranteFacade) {
		this.ejbRestauranteFacade = ejbRestauranteFacade;
	}

	public static Restaurante getRestaurante() {
		return restaurante;
	}

	public static void setRestaurante(Restaurante restaurante) {
		RestauranteBean.restaurante = restaurante;
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
