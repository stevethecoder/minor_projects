package org.elevenfifty.java201;

import org.elevenfifty.java201.test1.TimeMachine;
import org.elevenfifty.java201.test2.AccessExample3Public;
import org.elevenfifty.java201.test2.Timer;

public class RunAccessExample {

	public static void main(String[] args) {
		new AccessExample3Public().run();
		
		
		TimeMachine tm = new TimeMachine();
		tm.print();
		tm.goBack();
		tm.print();
		tm.goBack();
		tm.print();
		
		Timer t = new Timer();
		t.print();
		t.update();
		t.print();
		t.update();
		t.print();
		t.getCurrentHour();
		
	}

}
