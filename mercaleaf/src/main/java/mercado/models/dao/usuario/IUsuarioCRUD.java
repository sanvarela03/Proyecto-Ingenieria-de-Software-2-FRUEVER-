package mercado.models.dao.usuario;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.Productor;
import mercado.models.entity.Transportador;
import mercado.models.entity.Usuario;

public interface IUsuarioCRUD extends CrudRepository<Usuario, Long> {

}
