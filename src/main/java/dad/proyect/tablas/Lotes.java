package dad.proyect.tablas;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lotes")
public class Lotes {
	
	@Id
	@Column(columnDefinition = "char(5)")
	private String codLote;

	@ManyToOne(cascade= {CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="codArticulo")
	private String codArticuloXXX;
	
	@ManyToOne(cascade= {CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="codEntrada")
	private String codEntradaXXX;
	
	@Column(name= "cantidad", columnDefinition= "integer")
	private int cantidad;
	@Column(name= "fechaEntrada")
	private Date fechaEntrada ;
	@Column(name= "caducidad")
	private Date caducidad;
	
	public Lotes(){}
	public Lotes(String id, String codArticulo,String codEntrada, int cantida, Date fechaEntra, Date caducida){
		this.codLote=id;
		this.codArticuloXXX=codArticulo;
		this.codEntradaXXX=codEntrada;
		this.cantidad=cantida;
		this.caducidad=caducida;
	}
	public String getCodLote() {
		return codLote;
	}
	public void setCodLote(String codLote) {
		this.codLote = codLote;
	}
	public String getCodArticuloXXX() {
		return codArticuloXXX;
	}
	public void setCodArticuloXXX(String codArticuloXXX) {
		this.codArticuloXXX = codArticuloXXX;
	}
	public String getCodEntradaXXX() {
		return codEntradaXXX;
	}
	public void setCodEntradaXXX(String codEntradaXXX) {
		this.codEntradaXXX = codEntradaXXX;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	
}
