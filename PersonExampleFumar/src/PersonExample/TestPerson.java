package PersonExample;

public class TestPerson {
	
	public static void executePerson () {
		//creo un metodo que me permita crear objetos y ejecutarlos
		
		createAndTestObjectsPerson ();
			
		}
		
		public static void createAndTestObjectsPerson() {
			
			Person sergi = new Person ("Sergi", 24, 2000, 1);
			
				
		//de l'exemple de Fumar executo els mètodes:
			
			sergi.isAdult();
				
			sergi.tobaccoBuy(0);
		
			sergi.isAbleToSmoke();
			
			System.out.println(sergi.advice(sergi.isAbleToSmoke()));
			
	
		
			
			
			
		}
		

}
