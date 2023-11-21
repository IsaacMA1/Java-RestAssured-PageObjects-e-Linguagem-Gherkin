package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Metodos {

	  private static List<String> usedNames = new ArrayList<>();

	    public static class FullName {
	        private String firstName;
	        private String lastName;

	        public FullName(String firstName, String lastName) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	        }

	        public String getFirstName() {
	            return firstName;
	        }

	        public String getLastName() {
	            return lastName;
	        }

	        public String getFullName() {
	            return firstName + " " + lastName;
	        }
	    }

	    public static FullName generateRandomName() {
	        String[] firstNames = {"John", "Alice", "David", "Emma", "Michael", "Olivia", "Robert", "Sophia", "William", "Isabella"};
	        String[] lastNames = {"Smith", "Johnson", "Brown", "Wilson", "Taylor", "Clark", "Harris", "Thomas", "Lewis", "Walker"};

	        Random random = new Random();
	        int firstNameIndex = random.nextInt(firstNames.length);
	        int lastNameIndex = random.nextInt(lastNames.length);

	        String randomFirstName = firstNames[firstNameIndex];
	        String randomLastName = lastNames[lastNameIndex];

	        while (usedNames.contains(randomFirstName + " " + randomLastName)) {
	            firstNameIndex = random.nextInt(firstNames.length);
	            lastNameIndex = random.nextInt(lastNames.length);

	            randomFirstName = firstNames[firstNameIndex];
	            randomLastName = lastNames[lastNameIndex];
	        }

	        usedNames.add(randomFirstName + " " + randomLastName);

	        return new FullName(randomFirstName, randomLastName);
	    }
	}

