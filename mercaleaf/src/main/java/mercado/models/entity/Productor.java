package mercado.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "productor")
public class Productor extends Usuario {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy =  "productor" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Producto> productos;

	public Productor() {
		productos = new ArrayList<>();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
