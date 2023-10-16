package devapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/get")
	public String getit() {
		return "This is Dhananjeyan";
	}

}
