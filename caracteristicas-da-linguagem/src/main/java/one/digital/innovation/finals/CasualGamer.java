package one.digital.innovation.finals;

public class CasualGamer extends Gamer{
    public String keyboard() {return "Simple keyboard...";}
    /*
    @Override
    public String mouse() {
        return super.mouse();
    }*/

    public String play(final String game) {
        return "Jogando " + game;
    }
}
