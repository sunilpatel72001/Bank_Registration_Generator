package beans;

public class BankBeans {
	private String acno;
	private String name;
	private String email;
	private long phone;
	private int balance;
	
	public BankBeans() {
		// TODO Auto-generated constructor stub
	}

	public BankBeans(String acno, String name, String email, long phone, int balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
