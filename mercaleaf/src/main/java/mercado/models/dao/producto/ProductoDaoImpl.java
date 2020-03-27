package mercado.models.dao.producto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mercado.commons.GenericDAOImpl;
import mercado.models.entity.Comprador;
import mercado.models.entity.Producto;
import mercado.models.entity.Productor;
import mercado.models.entity.Usuario;

@Repository("ProductoDaoImpl-1")
public class ProductoDaoImpl extends GenericDAOImpl<Producto, Long> implements IProductoDAO {

	@Autowired
	private IProductoCRUD crud;

	@Override
	public CrudRepository<Producto, Long> getDAO() {

		return crud;
	}

}
