package org.jsp.springApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	public DemoController() {
		System.out.println("DemoController Object has created!");
	}

	@RequestMapping(value = "/btm", method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute Demo demo) {

		System.out.println("Inside display()");
		String message = "Message is " + demo.getNm();

		return new ModelAndView("Success", "uday", message);
	}

	@RequestMapping(value = "/btm1", method = RequestMethod.POST)
	public String displayNew(@ModelAttribute Demo demo, ModelMap map) {

		System.out.println("Inside displayNew()");
		String message = "New Message is " + demo.getNm();
		map.addAttribute("uday", message);
		return "Success";
	}

}
