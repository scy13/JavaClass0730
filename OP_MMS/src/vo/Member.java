/**
	Date : 2021.07.12
	Author : chayeon
	Description : 필드 선언
	Version : 1.0
 */
package vo;
// Value Object 약자

public class Member {
	// 필드
	private int id;			// 식별 id
	private String name;	// 이름
	private String phone;	// 핸드폰번호
	private int age;		// 나이
	private String addr;	// 주소
	private String email;	// 이메일
	private String hobby;	// 취미
	
	
	
	// 메소드
	// (1) getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;		// this.id는 메소드가 아닌 클래스의 id
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	// (2) toSting()
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", addr=" + addr
				+ ", email=" + email + ", hobby=" + hobby + "]";
	}
	
	
	// 생성자
	// (1) 기본생성자
	public Member() {
		super();
	}
	// (2) 매개변수생성자
	public Member(int id, String name, String phone, int age, String addr, String email, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.addr = addr;
		this.email = email;
		this.hobby = hobby;
	}
	
}
