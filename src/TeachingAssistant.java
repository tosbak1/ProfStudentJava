/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class TeachingAssistant implements Observer{
	private String name;
	private Date midterm;
	private Observable obs;

	public TeachingAssistant(String aName, Observable p) {
		this.name = aName;
		this.obs = p;
		this.obs.addObserver(this);
	}

	public String getName() {
		return this.name;
	}

	public void proctor(Date date){
		this.midterm = date;
		System.out.println(name + " : I have to proctor a midterm on " + this.midterm);
	}
	
	public void postpone(Date date){
		this.midterm = date;
		System.out.println(name + " : Now the midterm is on " + this.midterm);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(this.midterm != null){
			this.postpone((Date) arg1);
		}
		else{
			this.proctor((Date) arg1);
		}
		
	}
}