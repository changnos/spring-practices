package hellospring.controller;

public class UserVo {
	private Long id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String join_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJoinDate() {
		return join_date;
	}
	public void setJoinDate(String join_date) {
		this.join_date = join_date;
	}
	
}