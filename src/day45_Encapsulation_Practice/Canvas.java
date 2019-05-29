package day45_Encapsulation_Practice;

import java.util.*;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course();
		course1.setName("Java Programming");
		
		List <String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Urma");
		javaStudents.add("Bratan");
		javaStudents.add("Natasha");
		javaStudents.add("Murat");
		javaStudents.add("Sung");
		
		course1.setStudents(javaStudents);
		System.out.println(javaStudents.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Aigul Ezhe");
		
		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if (course1.getStudents().contains("Aigul Ezhe")) {
			System.out.println("Aigul Ezhe is a student");
		}else {
			System.out.println("Aigul Ezhe is not a student");
		}
		
		
		course1.removeTeacher("Murodil");
		course1.removeStudent("Natasha");
		
		if (!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed");
		}else {
			System.out.println("Murodil is still there");
		}
		
		
		if (!course1.getStudents().contains("Natasha")) {
			System.out.println("Natasha is removed");
		}else {
			System.out.println("Natasha is still there");
		}
		
		
	}

}
