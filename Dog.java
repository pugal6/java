public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("barking");
    }
}

class TestDog{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", "Labrador");
        Dog dog2 = new Dog("butcher", "pitbull");

        dog1.bark();
        System.out.println("Dog1 is: " + dog1.getName());

        System.out.println("Dog2 is: " + dog2.getName());

        dog2.setName("billy");
        System.out.println("Dog2 now is: " +  dog2.getName());
    }
}
