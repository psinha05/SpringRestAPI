package com.ps.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.springrest.dao.AuthorDao;
import com.ps.springrest.entity.Author;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorDao authDAO;
	
	
	public List<Author> getAllAuthors() {
	     return authDAO.getAll();	 
	}


	public Author findById(int id) {
		return authDAO.findById(id);
	}


	public Author findById() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	

}
