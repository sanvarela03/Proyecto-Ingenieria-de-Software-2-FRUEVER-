package mercado.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
/**
 * 
 * @author Santiago Varela
 *
 * @param <T>
 * @param <ID>
 */
public abstract class GenericDAOImpl<T, ID extends Serializable> implements IGenericDAO<T, ID> {

	@Override
	public T save(T objeto) {

		return getDAO().save(objeto);
	}

	@Override
	public void delete(ID id) {
		getDAO().deleteById(id);
	}

	@Override
	public T get(ID id) {

		Optional<T> objeto = getDAO().findById(id);

		return objeto.get();
	}

	@Override
	public List<T> getAll() {

		List<T> contenidoDevuelto = new ArrayList<>();

		getDAO().findAll().forEach(objeto -> contenidoDevuelto.add(objeto));

		return contenidoDevuelto;
	}

	public abstract CrudRepository<T, ID> getDAO();

}
