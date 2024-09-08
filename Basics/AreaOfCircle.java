/*
 Assingment question : Write a Java program to find the area of a circle.
 */
class AreaOfCircle {

	public static void main(String args[]) {
		final float PI = 3.14f;
		float radius = 5.5f;

		System.out.println("Start @Cyber Success");

		float result = areaOfCircle(PI, radius);
		System.out.println("Area circle :- " + result);

		System.out.println("Stop @Cyber Success");
	}

	static float areaOfCircle(float pi, float r) {

		float area = pi * r * r;
		return area;
	}

}