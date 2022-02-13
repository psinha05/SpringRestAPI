package com.ps.springrest.service;

import com.ps.springrest.entity.*;
import java.util.*;

public interface AuthorService {
	
	 public List<Author> getAllAuthors();
	 //public Author findByBookName(String bookrName);
	 public Author findById(int id);
	 
     
}
