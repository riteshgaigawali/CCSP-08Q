/*
- A Double variable can store floating point data which is decimal numbers.
- In Double variable we cannot store characters, or boolean values.
- Double will consume 8byte (eg. 64-bits ) and stores Approximately ±1.7976931348623157E+308.
- Optional [To represent the litral in double type we need to suffix the letter 'd/D'.]
*/
class DataTypesEx10 {

	public static void main(String atgs[]) {

		double d1 = 100.5;
		System.out.println(d1);
		double d2 = 200.5d;
		System.out.println(d2);
		double d3 = 300.5D;
		System.out.println(d3);
	}

}