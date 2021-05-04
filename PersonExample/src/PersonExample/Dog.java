package PersonExample;

public class Dog {
	
	//fields from Dog Class (creo atributos)
	
	public String name;
	public int age;
	public String breed;
	public int weight;

		
	//Constructor from Dog Class
	
		public Dog(String name, int age, String breed, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.weight = weight;
	}


	//Methods
		
		public void getBigger () {
			
		this.weight = weight + 5;
			
		}
		
	//Getters and Setters
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		
	//toString
		
		public String toString() { 
			return "Our dog's name is " + name + ", age is " + age + ", breed is " + breed + ", weight is " + weight + "";
		}
		
	
}

