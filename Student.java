package student;

import javax.persistence.Entity;
import javax.persistence.Id;
 

@Entity
public class Student {

  @Id 
  int id;
  int accno;
  String acctype;
  String name;
  
  public Student ()
  {
	  System.out.println("constructor");
  }
public Student(int id, int accno, String acctype, String name) {
	// TODO Auto-generated constructor stub
	this.id=id;
	this.accno=accno;
	this.acctype=acctype;
	this.name=name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", accno=" + accno + ", acctype=" + acctype + ", name=" + name + "]";
}

 
}// End class
