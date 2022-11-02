public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;

    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = favoriteSong;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("This singer is named " + this.name + ".\n");
    }

    public int getnoOfPerformances(){
        return noOfPerformances;
    }

    public double getEarnings(){
        return earnings;
    }

    public Song getFavoriteSong(){
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong){
        this.favoriteSong = favoriteSong;
        System.out.println(this.name + "'s favorite song is " + this.favoriteSong.getTitle() + ".\n");
    }

    public int getTotalPerformances(){
        return totalPerformances;
    }

    public void performForAudience(int n){
        totalPerformances++;
        noOfPerformances++;
        earnings += n*100;
        System.out.println(this.name + " performed for " + n + " people and earned " + n*100 + " dollars.");
        System.out.println(this.name + " has performed a total of " + this.noOfPerformances + " time(s).");
        System.out.println(this.name + " has earned a total of " + this.earnings + " dollars.");
        System.out.println("There has been a total of " + totalPerformances + " performance(s).\n");
    }

    public void performForAudience(int n, Singer name){
        totalPerformances++;
        this.noOfPerformances++;
        name.noOfPerformances++;
        double collabEarnings = 0;
        collabEarnings += n*100;
        this.earnings += collabEarnings/2;
        name.earnings += collabEarnings/2;
        System.out.println(this.name + " performed with " + name.name + " for " + n + " people and split the "
                + collabEarnings + " dollar profit between the two of them, earning them " + collabEarnings/2
                + " dollars each.");
        System.out.println(this.name + " has performed a total of " + this.noOfPerformances + " time(s).");
        System.out.println(name.name + " has performed a total of " + name.noOfPerformances + " time(s).");
        System.out.println(this.name + " has earned a total of " + this.earnings + " dollars.");
        System.out.println(name.name + " has earned a total of " + name.earnings + " dollars.");
        System.out.println("There has been a total of " + totalPerformances + " performance(s).\n");
    }
}