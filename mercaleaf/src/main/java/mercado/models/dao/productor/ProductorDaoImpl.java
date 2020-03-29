package mercado.models.dao.productor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mercado.commons.GenericDAOImpl;
import mercado.models.entity.Productor;
import mercado.models.entity.Usuario;

@Repository("ProductorDaoImpl-1")
public class ProductorDaoImpl extends GenericDAOImpl<Productor, Long> implements IProductorDAO {

	@Autowired
	private IProductorCRUD crud;

	@Override
	public CrudRepository<Productor, Long> getDAO() {

		return crud;
	}

}
