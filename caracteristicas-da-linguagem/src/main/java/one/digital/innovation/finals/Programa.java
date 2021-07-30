package one.digital.innovation.finals;

public class Programa {
    public static void main(String[] args) {
        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        var game = "Wow";

        System.out.println(casualGamer.play(game));
    }
}
