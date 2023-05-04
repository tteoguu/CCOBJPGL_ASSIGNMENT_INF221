import Explorers.*;
import Planets.*;


public class App {
    public static void main(String[] args) throws Exception {

        Planet mercury = new Mercury();
        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet neptune = new Neptune();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mercury.accept(astronaut);
        mars.accept(astronaut);
        saturn.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        mercury.accept(rover);
        mars.accept(rover);
        saturn.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        neptune.accept(rover);
        uranus.accept(rover);
        venus.accept(rover);

        
    }
}