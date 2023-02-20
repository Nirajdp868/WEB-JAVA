package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="myTable")
public class User {
	
	/*
	 * id int (Primary Key : Auto Increment) desc varchar(200) postedDate date
	 * answer varchar(400) status boolean
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment id..
    @Column(name = "id")
    private Integer Id;    
    @Column(length=200)
	private String desc;
    @Column(name=" postedDate")
	private LocalDate regDate;
    @Column(length=400)
	private String   answer;
    @Column(name = "status")
	private boolean status;
	
	
	public User() {
		System.out.println("in thge default constructor..");
	}
	
	
	public User(String desc, LocalDate regDate, String answer, boolean status) {
	
		
		this.desc = desc;
		this.regDate = regDate;
		this.answer = answer;
		this.status = status;
	}
	


	public User( String desc, LocalDate regDate, String answer) {
		super();
		
		this.desc = desc;
		this.regDate = regDate;
		this.answer = answer;
	}
	





	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", desc=" + desc + ", regDate=" + regDate + ", answer=" + answer + ", status="
				+ status + "]";
	}  
	
	 
}
