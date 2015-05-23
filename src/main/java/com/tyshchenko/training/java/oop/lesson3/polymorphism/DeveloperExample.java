package com.tyshchenko.training.java.oop.lesson3.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Tyshchenko.
 */
public class DeveloperExample {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7)
		};

		Developer[] list2 = {
				new MidleDeveloper("Mike", 500, 2),
				new SeniorDeveloper("Dima", 500, 5),
				new JuniorDeveloper("Vova", 500, 1),
				new SeniorDeveloper("Jack", 700, 7),
				new TeamLeadDeveloper("Robby", 500, 7)
		};

		StringBuilder sb;
		
		for (Developer d : list) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
         // Filtering SeniorDevelopers with Salary > 1500

		for (Developer d : list2) {
			if (d instanceof SeniorDeveloper) {
				if (d.getSalary() > 1500) {
					sb = new StringBuilder() // !!!
							.append(d.getName())
							.append(": ")
							.append(d.getBasicSalary())
							.append(" -> ")
							.append(d.getSalary());

					System.out.println(sb.toString());
				}
			}

		}
		System.out.println("----------------------------------");
		//Filtering list2 into 3 new lists

		ArrayList<Developer> listOfJuniorDev = new ArrayList();
		ArrayList<Developer> listOfSeniorDev = new ArrayList();
		ArrayList<Developer> listOfTeamLeader = new ArrayList();

		for (Developer d: list2){
			if (d instanceof JuniorDeveloper){
				listOfJuniorDev.add(d);
			}
			if (d instanceof SeniorDeveloper){
				listOfSeniorDev.add(d);
			}
			if (d instanceof TeamLeadDeveloper){
				listOfTeamLeader.add(d);
			}
		}
		listElementInfo(listOfJuniorDev);
		System.out.println();
		listElementInfo(listOfSeniorDev);
		System.out.println();
		listElementInfo(listOfTeamLeader);

	}

	public static void listElementInfo(ArrayList<Developer> list){
			StringBuilder sb;
			for (Developer d : list) {
				sb = new StringBuilder() // !!!
						.append(d.getName())
						.append(": ")
						.append(d.getBasicSalary())
						.append(" -> ")
						.append(d.getSalary());

				System.out.println(sb.toString());
			}

		}
	}

