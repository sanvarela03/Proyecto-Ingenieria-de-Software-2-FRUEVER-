package mercado.models.dao.productor;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Productor;

public interface IProductorCRUD extends CrudRepository<Productor, Long> {

}
