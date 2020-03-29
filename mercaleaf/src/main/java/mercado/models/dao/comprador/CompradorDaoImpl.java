package mercado.models.dao.comprador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mercado.commons.GenericDAOImpl;
import mercado.models.entity.Comprador;
import mercado.models.entity.Productor;
import mercado.models.entity.Usuario;

@Repository("CompradorDaoImpl-1")
public class CompradorDaoImpl extends GenericDAOImpl<Comprador, Long> implements ICompradorDAO {

	@Autowired
	private ICompradorCRUD crud;

	@Override
	public CrudRepository<Comprador, Long> getDAO() {

		return crud;
	}

}
