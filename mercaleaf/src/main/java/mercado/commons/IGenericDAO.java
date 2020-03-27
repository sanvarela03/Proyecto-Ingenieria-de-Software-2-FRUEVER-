package mercado.commons;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Santiago Varela
 *
 * @param <T>
 * @param <ID>
 */
public interface IGenericDAO<T, ID extends Serializable> {
	
	/**
	 * 
	 * @param objeto
	 * @return
	 */
	public T save(T objeto);
	/**
	 * 
	 * @param id
	 */
	public void delete(ID id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public T get(ID id);
	
	/**
	 * 
	 * @return
	 */
	public List<T> getAll();
	
}
