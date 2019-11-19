package test;

class Bike {
	int speed = 30;

	void run() {
		System.out.println("cycling");
	}
}

class aaa extends Bike {
	int speed = 60;

	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
	String a = "abraham";
	String b = "abraham";
	System.out.println(a.equals(b));
	System.out.println(a == b);
	}
}
