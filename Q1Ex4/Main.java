public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Oh Caroline", "Being Funny In A Foreign Language", "The 1975");
        Song s2 = new Song("You're On Your Own, Kid", "Midnights", "Taylor Swift");
        Song s3 = new Song("There'd Better Be A Mirrorball", "The Car", "Arctic Monkeys");
        Song s4 = new Song("Oceans & Engines", "Nicole", "NIKI");
        Song s5 = new Song("Robbers", "The 1975", "The 1975");
        Song s6 = new Song("About You", "Being Funny In A Foreign Language", "The 1975");

        Singer a1 = new Singer("The 1975", s5);
        Singer a2 = new Singer("Taylor Swift", s2);
        Singer a3 = new Singer("Arctic Monkeys", s3);
        Singer a4 = new Singer("NIKI", s4);

        Person p1 = new Person("Ally", s1, a1);   // me
        Person p2 = new Person("Claire", s2, a2); // my friend
        Person p3 = new Person("Vicky", s3, a3);  // my friend
        Person p4 = new Person("Julia", s4, a4);  // my sister

        // code testing
        a1.performForAudience(100);
        a1.performForAudience(100, a2);
        a3.performForAudience(100);
        a3.performForAudience(100, a4);
    }
}