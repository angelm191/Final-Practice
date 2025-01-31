
public class FinalPerson implements FinalPracticeInterface {
	private int number;
	private int age;
	private String info;
	
	//constructor
	public FinalPerson(int number, int age, String info) {
		this.number = number;
		this.age = age;
		this.info = info;
		
	}
	
	//getters and setters
	//getters
	public int getNumber() {
		return this.number;
	}
	public double getAge() {
		return this.age;
	}
	public String getInfo() {
		return this.info;
	}
	//setters
	public void setNumber(int number) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public void wave() {
		System.out.println("*Waves*");
		
	}
	
	@Override
	public String toString() {
		return "Number: " + this.number + "\nAge: " + this.age +
				"\nInfo: " + this.info;
	}
	
}
