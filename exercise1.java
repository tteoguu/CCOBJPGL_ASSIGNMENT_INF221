public class Activity {

    static boolean IwillNotCheat = true;
    static boolean iwillWin= true;
    public static void main(String[] args) throws Exception {
        
        // precondition
        assert IwillNotCheat == true: "EDI WOW NING";

        enterCompetition();

        System.out.println(IwillNotCheat);

        // postcondition
        assert iwillWin == true: "STAN NMIXX!";


    }

    static void enterCompetition(){
        iwillWin = false;
        // iwillPlayRoblox = false;

    }

    }
