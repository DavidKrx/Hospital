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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="entradas")
public class Entradas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int(11)")
	private int codEntrada;
	
	@ManyToOne(cascade= {CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="codProveedor")
	private String codProveedorXXX;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="codEntradaXXX")
	private List<Lotes> lote = new ArrayList<Lotes>();
	
	public Entradas() {}
	
	public Entradas(String codProve) {
		this.codProveedorXXX=codProve;
	}

	public int getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		this.codEntrada = codEntrada;
	}

	public String getCodProveedor() {
		return codProveedorXXX;
	}

	public void setCodProveedor(String codProveedor) {
		this.codProveedorXXX = codProveedor;
	}

	public List<Lotes> getLote() {
		return lote;
	}

	public void setLote(List<Lotes> lote) {
		this.lote = lote;
	}
	
}
