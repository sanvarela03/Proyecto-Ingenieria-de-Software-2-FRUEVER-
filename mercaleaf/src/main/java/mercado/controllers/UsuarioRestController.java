package mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mercado.models.dao.usuario.IUsuarioDAO;
import mercado.models.entity.Usuario;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioDAO.getAll();
	}
}
