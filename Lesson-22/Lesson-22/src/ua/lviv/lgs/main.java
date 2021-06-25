package ua.lviv.lgs;

public class main {
public static void main(String[] args) {
	
	Voises cow = () -> System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
	Voises cat = () -> System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
	Voises dog = () -> System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
	
	cow.voice();
	cat.voice();
	dog.voice();
	
	
}
}


interface Voises  {
	void  voice();
}