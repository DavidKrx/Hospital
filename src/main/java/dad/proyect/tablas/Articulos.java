package dad.proyect.tablas;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulos {

	@Id
	@Column(columnDefinition = "int(11)")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codArticulo;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="codArticuloXXX")
	private List<Lotes> lote = new ArrayList<Lotes>();
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "ubicacion")
	private String ubicacion;
	@Column(name = "cantidad")
	private int cantidad;
	
	public Articulos() {}
	
	public Articulos(String name, String descrip, String ubicac, int cantida) {
		this.nombre=name;
		this.descripcion=descrip;
		this.ubicacion=ubicac;
		this.cantidad=cantida;
	}

	public int getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(int codArticulo) {
		this.codArticulo = codArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
