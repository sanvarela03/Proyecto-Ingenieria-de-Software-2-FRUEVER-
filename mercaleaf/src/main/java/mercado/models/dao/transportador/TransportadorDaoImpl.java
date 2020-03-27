package mercado.models.dao.transportador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mercado.commons.GenericDAOImpl;
import mercado.models.entity.Productor;
import mercado.models.entity.Transportador;
import mercado.models.entity.Usuario;

@Repository("TransportadorDaoImpl-1")
public class TransportadorDaoImpl extends GenericDAOImpl<Transportador, Long> implements ITransportadorDAO {

	@Autowired
	private ITransportadorCRUD crud;

	@Override
	public CrudRepository<Transportador, Long> getDAO() {

		return crud;
	}

}
