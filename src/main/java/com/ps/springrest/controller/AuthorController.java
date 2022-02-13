package com.ps.springrest.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ps.springrest.entity.Author;
import com.ps.springrest.service.AuthorService;
import com.ps.springrest.service.AuthorServiceImpl;

@RestController
@RequestMapping("/ps")
public class AuthorController {

	@GetMapping("/test")
	public String test() {
		return "Hello Spring REST API";
	}

	@Autowired
	AuthorServiceImpl authImpl;
	
	//@Autowired
	//Author author;
	
	@GetMapping("/auth")
	public ModelAndView getData() {
		List<Author> author = this.authImpl.getAllAuthors();
		//List<Author> auth= (List<Author>)authImpl.getAllAuthors();
		System.out.println(author);
		
		ModelAndView model = new ModelAndView("home");
		model.addObject("authList", author);
		//m.addAttribute("auth", author);
		 return model;
	}
	
	
	@GetMapping("/author/{id}")
	public ResponseEntity<Author> getAuthor(@PathVariable int id) {
		Author author = authImpl.findById(id);
		if (author != null) {
			return ResponseEntity.ok(author); // return 200, with json body
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	  
	// http://localhost:8080/SpringRest/ps/auth
	 
}
