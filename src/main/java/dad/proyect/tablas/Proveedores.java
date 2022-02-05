package dad.proyect.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {

	@Id
	@Column(columnDefinition = "char(5)")
	private String codProveedor;

	@Column(columnDefinition = "varchar(20)")
	private String nombre;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="codProveedorXXX")
	private List<Entradas> entrada = new ArrayList<Entradas>();
	
	public Proveedores() {}
	public Proveedores(String codProvee, String nomb) {
		this.codProveedor=codProvee;
		this.nombre=nomb;
	}
	public String getCodProveedor() {
		return codProveedor;
	}
	public void setCodProveedor(String codProveedor) {
		this.codProveedor = codProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Entradas> getEntradas() {
		return entrada;
	}
	public void setEntradas(List<Entradas> entradas) {
		this.entrada = entradas;
	}
	@Override
	public String toString() {
		return getCodProveedor() + " | " + getNombre();
	}
}
