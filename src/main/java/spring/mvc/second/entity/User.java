package spring.mvc.second.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import spring.mvc.second.annotation.UniqueUsername;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min=4, message="Name must be atleast 4 characters!")
	@Column(unique= true)
	@UniqueUsername(message="Username already exist!")
	private String name;
	@Size(min=1, message="Invalid email address!")
	@Email(message="Invalid email address!")
	private String email;
	@Size(min=4, message="Name must be atleast 4 characters!")
	private String password;
	private boolean enabled;
	@ManyToMany
	@JoinTable
	private List<Role> roles;
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.REMOVE)
	private List<Blog> blogs;
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
