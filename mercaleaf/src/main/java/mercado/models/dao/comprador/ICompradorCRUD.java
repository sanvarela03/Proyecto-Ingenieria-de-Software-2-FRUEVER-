package mercado.models.dao.comprador;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Comprador;
import mercado.models.entity.Productor;

public interface ICompradorCRUD extends CrudRepository<Comprador, Long> {

}
