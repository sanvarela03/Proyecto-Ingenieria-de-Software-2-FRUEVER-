package mercado.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parametros")
public class EjemploParamsController {

	@GetMapping("/")
	public String index() {

		return "params/index";
	}

	@GetMapping("/string")
	public String param(
			@RequestParam(required = false, defaultValue = "No se ha especificado param en url") String texto,
			Model model) {

		model.addAttribute("resultado", "El texto enviado es: " + texto);

		return "params/ver";
	}

//	@GetMapping("/mix-params")
//	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model modelo) {
//
//		modelo.addAttribute("resultado", "El saludo es: '" + saludo + "' y el numero es '" + numero + "'");
//		return "params/ver";
//	}
	
	@GetMapping("/mix-params")
	public String param(HttpServletRequest request, Model modelo) {
		
		String saludo = request.getParameter("saludo");
		Integer numero = Integer.parseInt(request.getParameter("numero"));

		modelo.addAttribute("resultado", "El saludo es: '" + saludo + "' y el numero es '" + numero + "'");
		return "params/ver";
	}

}
