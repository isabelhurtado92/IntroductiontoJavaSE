package PersonExample;

public class TestPerson {
	
	public static void executePerson () {
		//creo un metodo que me permita crear objetos y ejecutarlos
		
		createAndTestObjectsPerson ();
			
		}
		
		public static void createAndTestObjectsPerson() {
			
			Person sergi = new Person ();
			
			//Person isabel = new Person ("Isabel", 28);
			
			Person anna = new Person ("Anna", 32, 60, 165, 2005);
			
			//anna object calling toString method.
			anna.toString();
			
			//voy a imprimir el resultado para ver si funciona.
			System.out.println(anna.toString());
			
			
			sergi.setName("Sergi");
			sergi.setAge(20);
			sergi.setHeight(180);
			sergi.setBasicSalary(20000);
			
		}
		

}
