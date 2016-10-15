package org.elevenfifty.java201;

public class ShowObject extends Object {
	
	public static final String I_AM_A_CONSTANT = "Boo!";

	private volatile int a = 3;

	public static void main(String[] args) {
		Object o = new Object();

		// Method Summary
		String s = o.toString();
		boolean b = o.equals(null);
		Class c = o.getClass();
		int h = o.hashCode();

		synchronized (o) {

			o.notify();
			o.notifyAll();
			try {
				//o.wait();
				o.wait(123L);
				o.wait(123L, 123);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("Boo");
			}
		}

		// Examples
		System.out.println(o.getClass().getSimpleName());
		System.out.println(o.getClass().getName());
		System.out.println(o.toString());

		Integer a = new Integer(2);

		System.out.println(a.toString());

		ShowObject show = new ShowObject();

		// show.finalize();
		// show.clone();
	}

	@Override
	protected void finalize() {
		System.out.println("Goodbye");
	}

	public synchronized void foo() {

	}

}
