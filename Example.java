public class Example {
    public static void main(String args[]){

        User kenny = new User("Kenny",33);
        kenny.printUser();

        // add another user

        User rosalina = new User("Rosalina",28);
        rosalina.printUser();

        User deborah = new User("Deborah", 62);
        deborah.printUser();

        Student charles = new Student("Charles", 28, 10);
        charles.printStudent();

        //add another object of the type of Student

        Student luis = new Student("Luis", 30, 10);
        luis.printStudent();

        Student desir = new Student("Desir", 25, 10);
        desir.printStudent();

        Animal dog = new Animal("Dog", "Canine Family");
        dog.printAnimal();

        //add another object of the type of animal

        Animal cat = new Animal("Cat", "Feline Family");
        cat.printAnimal();

        Animal rat = new Animal("Rat", "Rodent Family");
        rat.printAnimal();
        
        
        dog.attacks(kenny);
        dog.attacks(charles);

        cat.attacks(rosalina);
        cat.attacks(deborah);

        rat.attacks(luis);
        rat.attacks(desir);
    }  
}