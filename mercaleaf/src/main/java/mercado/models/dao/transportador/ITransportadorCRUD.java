package mercado.models.dao.transportador;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Productor;
import mercado.models.entity.Transportador;

public interface ITransportadorCRUD extends CrudRepository<Transportador, Long> {

}
