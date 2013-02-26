package ie.cit.adf.demo.web;

import ie.cit.adf.demo.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeController {
	@Autowired
	private TimeService timeService;

	@RequestMapping("time")
	public ModelAndView time() {
		ModelAndView model = new ModelAndView("index.jsp");
		model.addObject("time", timeService.getCurrentDate());
		return model;
	}
}
