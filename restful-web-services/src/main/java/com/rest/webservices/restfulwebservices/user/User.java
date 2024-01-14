package com.rest.webservices.restfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.rest.webservices.restfulwebservices.user.post.Post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "`user`")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 2, message = "Name shoud have atleast 2 characters")
	private String name;
	
	@Past
	private Date birthDate;
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	
	public User() {
		super();
	}
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
