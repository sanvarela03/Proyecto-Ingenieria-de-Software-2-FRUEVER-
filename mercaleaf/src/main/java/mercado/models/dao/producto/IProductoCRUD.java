package mercado.models.dao.producto;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Comprador;
import mercado.models.entity.Producto;
import mercado.models.entity.Productor;

public interface IProductoCRUD extends CrudRepository<Producto, Long> {

}
