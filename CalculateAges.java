public class CalculateAges {
	public static void main (String args[]){
		int currentYear = 2020;
		int myAge = 33;
		int myBirthYear = currentYear - myAge;
		int oneAge = 15;
		int oneBirthYear = currentYear - oneAge;
		int twoAge = 85;
		int twoBirthYear = currentYear - twoAge;
		int threeAge = 95;
		int threeBirthYear = currentYear - threeAge;
		System.out.println ("I was born in " + (currentYear - myAge) + ". In 2040 I will be " + (2040 - myBirthYear) + ".");
		System.out.println ("Person number 1 was born in " + (currentYear - oneAge) + ". In 2040 person1 will be " + (2040 - oneBirthYear) + ".");
		System.out.println ("Person number 2 was born in " + (currentYear - twoAge) + ". In 2040 person2 will be " + (2040 - twoBirthYear) + ".");
		System.out.println ("Person number 3 was born in " + (currentYear - threeAge) + ". In 2040 person3 will be " + (2040 - threeBirthYear) + ".");
		Integer [] birthYears = new Integer[4];
		birthYears[0] = myBirthYear;
		birthYears[1] = oneBirthYear;
		birthYears[2] = twoBirthYear;
		birthYears[3] = threeBirthYear;
		if (birthYears[0] > 1960) {
			System.out.println ("How old was I in 1960? I was not yet born");
		}else {
			System.out.println ("How old was I in 1960? I was " + (1960 - myBirthYear));
			}
		if (birthYears[1] > 1960) {
			System.out.println ("How old was person1 in 1960? person1 was not yet born");
		}else {
			System.out.println ("How old was person1 in 1960? person1 was " + (1960 - oneBirthYear) + " years old.");
			}
		if (birthYears[2] > 1960) {
			System.out.println ("How old was person2 in 1960? person2 was not yet born");
		}else {
			System.out.println ("How old was person2 in 1960? person2 was " + (1960 - twoBirthYear) + " years old.");
			}
		if (birthYears[3] > 1960) {
			System.out.println ("How old was person3 in 1960? person3 was not yet born");
		}else {
			System.out.println ("How old was person3 in 1960? person3 was " + (1960 - threeBirthYear) + " years old.");
			}
	}
}