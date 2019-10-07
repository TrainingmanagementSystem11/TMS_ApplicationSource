package com.training.view;

import java.util.Scanner;

public class TrainerView {

	public void trainerMenu() {
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1. post Training ");
		System.out.println("=>2. View Feedback ");
		System.out.println("=>3. View History");
		try(Scanner scanner=new Scanner(System.in);){

			System.out.print("\nEnter Choice:"); 
			int option=scanner.nextInt(); 

			switch(option) {

			case 1:
			break;
			case 2:
			break;
			case 4:
			default:System.out.println("SELECT APPROPRIATE OPTION]");
			trainerMenu();

			}

		}catch(Exception e) {

			System.out.println("SELECT APPROPRIATE OPTION]");
		}

	}
}
