import java.util.Date;

public class Run {
	public static void main(String[] args) {

		Prof p = new Prof("Babak");
		Student s = new Student("Homer");
		Student s2 = new Student("Bart");
		TeachingAssistant ta = new TeachingAssistant("Michael");
	
		p.addObserver(s);
		p.addObserver(s2);
		p.addObserver(ta);
		
		Date midterm = new Date();
		p.setMidterm(midterm);
		
		System.out.println();
	
		p.postponeMidterm(new Date(midterm.getTime() + 1000000000));

	}
}
