public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        System.out.println(myPet.name);
        System.out.println(myPet.age);
        myPet.meow();
        System.out.println("My snowshoe has a " + myPet.eyeColor + " eyes");
        System.out.println("She is " + myPet.height + " tall.");
    }
}