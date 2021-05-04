package PersonExample;

public class TestingDog {
	
	//creo un metodo que llamara a otros submetodos
	public static void executeDog () {
		
		generatingDogs(); //para crear objetos
	}
	
	private static void generatingDogs() {
		
		Dog mike = new Dog ("Mike", 5, "pug", 10);
		Dog bob = new Dog ("Bob", 2, "americanstanford", 40);

		
		System.out.println("¿ Who's Mike? " + mike);
		
		System.out.println(bob);
		
		
	}
	
	

}
