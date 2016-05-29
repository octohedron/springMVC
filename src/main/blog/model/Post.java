package blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created on 5/25/16.
 */
@Entity
@Table(name = "POST")
public class Post {
	
	public static final String GET_ALL = "post.getAll";
	
	private Long id;
	private String title;
	private String description;

	public Post() {
	}

	public Post(String title, String description) {
		this.title = title;
		this.description = description;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
