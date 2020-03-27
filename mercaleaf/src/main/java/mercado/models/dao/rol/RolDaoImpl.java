package mercado.models.dao.rol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mercado.commons.GenericDAOImpl;
import mercado.models.entity.Rol;
import mercado.models.entity.Usuario;

@Repository("RolDaoImpl")
public class RolDaoImpl extends GenericDAOImpl<Rol, Long> implements IRolDAO {
	
	@Autowired
	private IRolCRUD crud;

	@Override
	public CrudRepository<Rol, Long> getDAO() {
		
		return crud;
	}
}
