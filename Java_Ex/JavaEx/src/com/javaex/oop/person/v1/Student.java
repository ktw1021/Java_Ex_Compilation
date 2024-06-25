package com.javaex.oop.person.v1;

public class Student extends Person {
		
		static int counts;
		protected String schoolName;
		
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName=schoolName;
			counts++;
		}
		
		public Student(String schoolName) {
			super("unknown",0);
			this.schoolName=schoolName;
			counts++;
		}
		public Student(String name, int age, String schoolName) {
			super(name,age);
			this.schoolName=schoolName;
			counts++;
		}
		
		public void showInfo() {
			System.out.printf("%s은(는) %d살의 %s 학생입니다.%n", name, age, schoolName);
			System.out.println("Student는 " + counts + "명입니다.");
		}
		
}
