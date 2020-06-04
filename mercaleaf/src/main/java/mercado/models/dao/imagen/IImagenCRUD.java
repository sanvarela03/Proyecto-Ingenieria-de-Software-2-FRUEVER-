package mercado.models.dao.imagen;

import org.springframework.data.repository.CrudRepository;

import mercado.models.entity.ImageModel;

public interface IImagenCRUD extends CrudRepository<ImageModel, Long> {

}
