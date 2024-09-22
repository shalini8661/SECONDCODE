package org.tcs.test.login;

public class CourseDetails {
//methodname-->crl+space->enter
	private void javaCourse() {
		System.out.println("java course started");

	}
	private void pythonCourse() {
		System.out.println("python course not started");
	}
	public static void main(String[] args) {
		CourseDetails c =new CourseDetails();
		c.javaCourse();
		c.pythonCourse();
	}
}
