package com.he.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.he.app.model.Student;

@Controller
@RequestMapping(value = "/json")
public class JsonController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Student home(@PathVariable String name, Model model) {
		Student student = new Student();
		student.setName(name);
		return student;
	}
}
