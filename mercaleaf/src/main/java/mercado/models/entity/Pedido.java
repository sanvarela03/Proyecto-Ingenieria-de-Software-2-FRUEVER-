package mercado.models.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long id;

	@OneToMany(mappedBy = "pedido")
	List<PedidoUsuario> pedidoUsuario;
	
	@OneToMany(mappedBy = "pedido")
	List<DetallePedido> detallePedido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Estado estado; 

}
