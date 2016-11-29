/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;
import java.util.Observable;

public class Prof extends Observable {
	private String name;
	private Date midtermDate;

	public Prof(String aName) {
		this.name = aName;
	}

	public Date getMidterm() {
		return this.midtermDate;
	}

	public String getName() {
		return this.name;
	}

	public void setMidterm(Date date) {
		this.midtermDate = date;
/*		for(Student s: this.students){
			s.study(date);
		}
		ta.proctor(date);
*/		this.setChanged();
		this.notifyObservers(midtermDate);
	}
	
	public void postponeMidterm(Date date){
		this.midtermDate = date;
/*		for(Student s: this.students){
			s.party(date);
		}
		ta.postpone(date);
	*/
		this.setChanged();
		this.notifyObservers(midtermDate);
	}

}