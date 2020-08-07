package model;



import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.struts.action.ActionForm;

@Entity
public class Register extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String email;
	private String fullName;
	private String password;
	private String role;
	private int empId;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Register [empId=" + empId + ", fullName=" + fullName
				+ ", email=" + email +  "]";
	}

	
	

	
}
