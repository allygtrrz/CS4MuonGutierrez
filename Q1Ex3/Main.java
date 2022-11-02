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

        Person f1 = new Person("Ally", s1, a1);   // me
        Person f2 = new Person("Claire", s2, a2); // my friend
        Person f3 = new Person("Vicky", s3, a3);  // my friend
        Person f4 = new Person("Julia", s4, a4);  // my sister

        a1.performForAudience(12);
        System.out.println(a1.name + " has performed " + a1.noOfPerformances + " time(s).");
        System.out.println(a1.name + " has earned " + a1.earnings + " euros.");

        System.out.println(a1.name + "'s favorite song is " + a1.favoriteSong.title + ".");
        a1.changeFavSong(s6);
        System.out.println(a1.name + "'s favorite song is " + a1.favoriteSong.title + ".");
    }
}
