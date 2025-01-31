
public class FinalChild extends FinalPerson {

	String school;
	
	public FinalChild(int number, int age, String info, String school) {
		super(number, age, info);
		this.school = school;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nSchool: " + this.school;
		return result;
	}

	
	
}
