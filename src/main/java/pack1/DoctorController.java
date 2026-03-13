package pack1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {

	@Autowired
	private DoctorDAO dao;

	@RequestMapping(value = { "/", "/index" })
	public String home(Model model) {
		List<Doctor> list = dao.getListOfDoctors();
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/doctorform")
	public String showForm(Model model) {
		model.addAttribute("doctor", new Doctor());
		return "add_doctor";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDoctor(@ModelAttribute("doctor") Doctor d) {
		dao.insert(d);
		return "redirect:/index";
	}
}