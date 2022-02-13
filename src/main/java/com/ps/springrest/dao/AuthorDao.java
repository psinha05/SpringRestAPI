package com.ps.springrest.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ps.springrest.entity.Author;

@Component
public class AuthorDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	 public List<Author> getAll() {
		 List<Author> auth=this.hibernateTemplate.loadAll(Author.class);
		 return auth;
	 }
	
	public Author findById(int id) {
		String q="select * from Author where id=?";
		return (Author) this.hibernateTemplate.find(q, Author.class);
	}
}
