package com.niit.crud.bean;

public class Employee {
    private Integer empId;

    private String epmName;

    private String gender;

    private String email;

    private Integer dId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEpmName() {
        return epmName;
    }

    public void setEpmName(String epmName) {
        this.epmName = epmName == null ? null : epmName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

	public Employee(Integer empId, String epmName, String gender, String email, Integer dId) {
		super();
		this.empId = empId;
		this.epmName = epmName;
		this.gender = gender;
		this.email = email;
		this.dId = dId;
	}
    
}