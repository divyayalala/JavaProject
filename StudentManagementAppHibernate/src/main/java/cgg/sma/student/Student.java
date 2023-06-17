package cgg.sma.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name = "sid")
	private int studentId;
	private String sName;
	private String sCity;
	private String sPhone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String sName, String sCity, String sPhone) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.sCity = sCity;
		this.sPhone = sPhone;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", sCity=" + sCity + ", sPhone=" + sPhone + "]";
	}
}
