package mercado.models.dao.rol;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Rol;
import mercado.models.entity.Usuario;

public interface IRolCRUD extends CrudRepository<Rol, Long> {

}
