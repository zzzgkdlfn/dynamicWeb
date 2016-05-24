package di;


public class MainApp {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setMyName("poodle");
		
		Cat cat = new Cat();
		cat.setMyName("bella");
		
		//������ DI 
		PetOwner person = new PetOwner(dog);
		person.play();
		
		//���� DI
		person.setAnimal(cat);
		person.play();

	}

}
