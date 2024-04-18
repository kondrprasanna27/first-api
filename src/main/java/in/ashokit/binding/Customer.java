package in.ashokit.binding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties()
public class Customer {
	
	private Integer id;
	private String name;
	private Long Phno;
	
	
	public Customer(int i, String string, long l) {
		
	}
	public Customer(Integer id, String name, Long Phon) {
		super();
		this.id = id;
		this.name = name;
		this.Phno= Phon;
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
	
	public Long getPhno() {
		return Phno;
	}
	public void setPhno(Long phno) {
		Phno = phno;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Phno=" + Phno + "]";
	}

}
