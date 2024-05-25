package s5_oop_2_polymorphism;

import java.util.Scanner;

public class Polymorphism {
	public static void main(String[] args) {
		//		Movie movie = new Movie("The Matrix");
		//		movie.watchMovie();

		//		System.out.println();

		//		Adventure adventure = new Adventure("Indiana Jones");
		//		adventure.watchMovie();

		//		System.out.println();

		//		Comedy comedy = new Comedy("Irene");
		//		comedy.watchMovie();
		//
		//		System.out.println();
		//
		//		Scifi scifi = new Scifi("Star Wars");
		//		scifi.watchMovie();
		//
		//		System.out.println();
		//
		//		Movie movie2 = Movie.getMovie("Adventure", "Formicas");
		//		movie2.watchMovie();
		//
		//		System.out.println();

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the type of movie you want to watch: A C or S (Q to quit): ");
			String type = s.nextLine();

			if ("Qq".contains(type)) {
				break;
			}

			System.out.println("Enter the title of the movie: ");
			String title = s.nextLine();

			Movie movie3 = Movie.getMovie(type, title);
			movie3.watchMovie();
		}

		//? to assign as Adventure should cast
		Adventure jaws = (Adventure) Movie.getMovie("Adventure", "Jaws");
		jaws.watchMovie();

		//? as Object should cast to Movie to access the watchMovie method
		Object comedy = Movie.getMovie("Comedy", "The Hangover");
		((Movie) comedy).watchMovie();

		//? local variable inferred type
		var airplane = Movie.getMovie("Comedy", "Airplane");
		airplane.watchMovie();

		System.out.println();

		Object unknown = Movie.getMovie("SciFi", "Unknown");
		if (unknown.getClass().getSimpleName().equals("Comedy")) { //? getClass().getSimpleName() is a type check
			Comedy c = (Comedy) unknown;
			c.watchComedy();
		} else if (unknown instanceof Adventure) { //? instanceof is a type check
			((Adventure) unknown).watchAdventure();
		} else if (unknown instanceof Scifi syfy) { //? we can assign the instance to a variable
			syfy.watchScifi();
		}
	}
}

class Movie {
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName();
		System.out.println(title + " is a " + instanceType + " film");
	}

	public static Movie getMovie(String type, String title) {
		char firstChar = type.toUpperCase().charAt(0);

		return switch (firstChar) {
			case 'A' -> new Adventure(title);
			case 'C' -> new Comedy(title);
			case 'S' -> new Scifi(title);
			default -> new Movie(title);
		};
	}
}

class Adventure extends Movie {
	public Adventure(String title) {
		super(title);


	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Exciting Scene");
	}

	public void watchAdventure() {
		System.out.println("Watching an adventure");
	}
}

class Comedy extends Movie {
	public Comedy(String title) {
		super(title);


	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Something funny happens", "More fun", "happy ending");
	}

	public void watchComedy() {
		System.out.println("Watching a comedy");
	}
}

class Scifi extends Movie {
	public Scifi(String title) {
		super(title);


	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Science", "Fiction", "explosions");
	}

	public void watchScifi() {
		System.out.println("Watching a scifi");
	}
}