public class Player {
    int number = 0; // variable used to store the guess

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I’m guessing " + number);
    }
}