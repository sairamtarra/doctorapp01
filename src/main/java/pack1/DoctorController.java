package pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoctorController {

	@Autowired
	private DoctorDAO dao;

	// Show all doctors
	@RequestMapping(value = { "/", "/index" })
	public String home(Model model) {
		List<Doctor> list = dao.getListOfDoctors();
		model.addAttribute("list", list);
		return "index";
	}

	// Show Add Doctor Form
	@RequestMapping("/doctorform")
	public String showForm(Model model) {
		model.addAttribute("doctor", new Doctor());
		return "add_doctor";
	}

	// Insert Doctor
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDoctor(@ModelAttribute("doctor") Doctor d) {
		dao.insert(d);
		return "redirect:/index";
	}

	// Show Edit Doctor Form
	@RequestMapping("/editdoctorform/{id}")
	public String editDoctorForm(@PathVariable("id") int id, Model model) {
		Doctor doctor = dao.getDoctorById(id);
		model.addAttribute("doctor", doctor);
		return "update_doctor";
	}

	// Update Doctor
	@RequestMapping(value = "/updatedoctor", method = RequestMethod.POST)
	public String updateDoctor(@ModelAttribute("doctor") Doctor doctor) {
		dao.update(doctor);
		return "redirect:/index";
	}

	// Delete Doctor
	@RequestMapping("/deletedoctor/{id}")
	public String deleteDoctor(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/index";
	}
}
