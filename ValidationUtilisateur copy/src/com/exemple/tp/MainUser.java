package com.exemple.tp;

public class MainUser {
	public static void main(String args[]) {
		User[] users = { new User("Meriem", 21), new User("", 27), new User("Ouadie", 15)

		};
		for (User u : users) {
			try {
				u.validate();
				System.out.println("Utilisateur validé : " + u);
			} catch (InvalidUserException error) {
				System.err.println("Validation échouée : " + error.getMessage());
			}
		}
	}
}
