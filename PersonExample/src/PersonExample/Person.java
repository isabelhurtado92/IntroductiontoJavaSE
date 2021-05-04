package PersonExample;

public class Person {
	
	
	//fields from Person Class (creo atributos)
	public String name;
	public int age;
	public int weight;
	public int height;
	public double basicSalary;
	
	
	//Constructor from Person Class
	public Person(String name, int age, int weight, int height, double basicSalary) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.basicSalary = basicSalary;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	
	//methods from Person Class
	public void becomeOlder () {
		
	this.age = age + 1;	
	
	}
	
	public double yearNetSalary() {
		
		double yearNetSalary = 0.0;
		
		
		if (basicSalary > 0) {
			
			if (age <= 30) {
				
				double taxToDeduct6 = (basicSalary * 0.06) ;
				yearNetSalary = ((basicSalary - taxToDeduct6) * 14);
				
				
			}
			else {
				
				double taxToDeduct12 = (basicSalary * 0.12) ;
				yearNetSalary = ((basicSalary - taxToDeduct12) * 14);
				
			}
			
		} else System.out.println("No es pot.");
			
		
		return yearNetSalary;
		
	}
	

	
	//Getters and Setters and toString (metodos ya predefinidos en el sistema)
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//toString
	public String toString() {
		return "Person fields: (name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", basicSalary="
				+ basicSalary + ")";
	}
	
	
}
