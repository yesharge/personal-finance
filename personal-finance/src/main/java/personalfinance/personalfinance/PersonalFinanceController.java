package personalfinance.personalfinance;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalFinanceController {

	

	@RequestMapping("/home")
	public String showHome() {

		return "home";
	}

	}