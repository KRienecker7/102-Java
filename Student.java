public class Student extends User {
    //public String name;
    //public int age;
    public int cohortNumber;

    //constructor
    public Student(String name, int age, int cohortNumber){
        super(name, age);
        this.cohortNumber=cohortNumber;
    }
    //method printStudent
    public void printStudent(){
        
        printUser();
        System.out.println("Cohort Number: "+this.cohortNumber);
    }
}