package ac.simons.keycloakdemo;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Just a demo.
 */
@Controller
class DemoController {

	// See, I am a fan of method level security
	@PreAuthorize("isAuthenticated()")
	@GetMapping(path = "/protected")
	public ModelAndView protectedPage(final Principal principal) {
		return new ModelAndView("index", Map.of("principal", principal));
	}

	@GetMapping(path = "/unprotected")
	public String unprotectedPage() {
		return "index";
	}

}
