package mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mercado.models.dao.comprador.ICompradorCRUD;
import mercado.models.dao.comprador.ICompradorDAO;
import mercado.models.dao.rol.IRolDAO;
import mercado.models.dao.rol.RolDaoImpl;
import mercado.models.entity.Comprador;
import mercado.models.entity.Usuario;

@Controller
@RequestMapping("/crud")
public class UsuarioController {

	@Autowired
	@Qualifier("CompradorDaoImpl-1")
	private ICompradorDAO compradorDao;
	
	@Autowired
	private IRolDAO rolDao;
;
	@GetMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("titulo", "Listado de Usuarios");
		model.addAttribute("usuarios", compradorDao.getAll());

		return "crud/listar";
	}

	@GetMapping("/form")
	public String crear(Model model) {

		Usuario usuario = new Usuario();

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Formulario de cliente");
		model.addAttribute("roles", rolDao.getAll());

		return "crud/form";
	}

	@PostMapping("/form")
	public String guardar(Comprador usuario) {
		compradorDao.save(usuario);
		return "redirect:/crud/listar";
	}

}
