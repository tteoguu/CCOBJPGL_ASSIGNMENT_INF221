public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        GoldenDoodle myPet = new GoldenDoodle();

        System.out.println(myPet.name);
        System.out.println(myPet.Aqui);
        myPet.bark();
        System.out.println("She has a " + myPet.eyeColor + " eyes");
        System.out.println("She is " + myPet.height + " tall.");
    }
}
