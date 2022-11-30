public class Main {
    public static void main(String[] args){
        FireType sancho = new FireType("Sancho", 100, 20);
        Trainer ally = new Trainer("Ally");
        NPC sophie = new NPC("Sophie");
        Location pisay = new Location("Pisay", "Science");

        ally.inspect(sancho);
        ally.inspect(sophie);
        ally.inspect(pisay);
    }
}