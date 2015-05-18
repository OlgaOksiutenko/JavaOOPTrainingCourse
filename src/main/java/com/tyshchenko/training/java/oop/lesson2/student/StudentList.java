package com.tyshchenko.training.java.oop.lesson2.student;

import java.time.LocalDate;

/**
 * @author Alexander Tyshchenko.
 */
public class StudentList {
	private Student[] list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		if (p + 1 == list.length) {
			Student[] t = new Student[list.length* 2];
			System.arraycopy(list, 0, t, 0, list.length);
			/* for (int i = 0; i < list.length; i++)
			t[i] = list[i]; */
			list = t;
		}

		list[p++] = s;
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}

	public int findBySurname(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}

		return -1;
	}

	public int findByBirthDate(LocalDate birthDate){
		for (int i = 0; i < p ; i++) {
			if(list[i].getBirth().equals(birthDate))
				return i;
		}
		return -1;
	}


	public void delete(int n) {
		if (n < 0 || n >= list.length) return; // index out of bounds
		Student[] t = new Student[list.length-1];
		System.arraycopy(list, 0, t, 0, n);
		System.arraycopy(list, n + 1, t, n, t.length-n);
		/* int k = 0;
		for (int i = 0; i < n; i++) t[k++] = list[i];
		for (int i = n + 1; i < list.length; i++)
		t[k++] = list[i]; */
		list = t;
	}
}


