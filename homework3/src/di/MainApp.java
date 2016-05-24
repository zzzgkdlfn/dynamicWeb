package di;


public class MainApp {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setMyName("poodle");
		
		Cat cat = new Cat();
		cat.setMyName("bella");
		
		//생성자 DI 
		PetOwner person = new PetOwner(dog);
		person.play();
		
		//세터 DI
		person.setAnimal(cat);
		person.play();

	}

}
