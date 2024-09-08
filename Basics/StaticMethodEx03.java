/*
 - Where in real-time exactly are methods are executed in the memory ?
 --> The methods are executed in Stack within the memory and are stored inside the static-pool which resides in Heap.
 */
class StaticMethodEx03 {

	public static void main(String args[]) {
		System.out.println("Start @CyberSuccess ");
		method3();
		System.out.println("End @CyberSuccess ");

	}

	static void method3() {

		System.out.println("Inside method3... ");

	}
}