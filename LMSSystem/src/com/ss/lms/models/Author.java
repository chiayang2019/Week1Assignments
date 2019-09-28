package com.ss.lms.models;

import java.util.ArrayList;
import java.util.List;
import com.ss.lms.models.Book;
import java.io.Serializable;

public class Author implements Serializable {
	
	private static final long serialVersionUID = 0;
	
	private Integer authorId;
	
	private String authorName;	
	
	private List<Book> books;

	public Author() {
		
	}
	
	public Author(Integer authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = new ArrayList<Book>();
	}	

	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId
	 * the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}		
}
