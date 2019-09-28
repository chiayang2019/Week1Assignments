/**
 * 
 */
package com.ss.lms.models;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ss.lms.models.Author;
import com.ss.lms.models.Book;


/**
 * @author chiayang
 *
 */
public class AuthorDao{


	public List<Author> readAuthors() throws IOException {
		FileInputStream record = new FileInputStream("./data/authorlist");
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(record));
		
		Map<String, List<Book>> authorBookMap = new HashMap<String, List<Book>>();
		List<Author> authors = new ArrayList<Author>();
		String authorLine;
		
		while((authorLine = buffReader.readLine()) != null) {
			String[] splitArray = authorLine.split(",");
			
			Book b = new Book();
			b.setBookTitle(splitArray[1]);
			b.setBookIsbn(splitArray[2]);
			
			if(authorBookMap.containsKey(splitArray[0])){
				authorBookMap.get(splitArray[0]).add(b);
			}
			else {
				List<Book> books = new ArrayList<>();
				books.add(b);
				authorBookMap.put(splitArray[0], books);
			}
			
		}
		
		for( Entry<String, List<Book>> entry : authorBookMap.entrySet() ) {
			Author author = new Author();
			author.setAuthorId(entry.getValue());
			author.setAuthorName(entry.getKey());
			author.setBooks(entry.getValue());
			authors.add(author);
		}
		
		
		buffReader.close();
		return authors;
	}
	
}
