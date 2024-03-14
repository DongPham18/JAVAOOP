package JAVA;

public class dogClass {
    public static void main(String[] args) {
        Dog new_Dog = new Dog();
        new_Dog.setName("Micky");
        new_Dog.setBreed("Husky");
        new_Dog.setAge(12);
        new_Dog.printDogDetail();
    }
}
class Dog{
    private String name ;
    private String breed;
    private int age;
    public void setName(String name ){
        this.name  = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void printDogDetail(){
        System.out.println("Name:"+name+"--"+"Breed:"+breed+"--"+"Age:"+age);
    }
}