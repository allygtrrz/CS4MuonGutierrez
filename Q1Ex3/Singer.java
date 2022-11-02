public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;

    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;
    }

    public void performForAudience(int n){
        noOfPerformances += 1;
        earnings += n*100;
    }

    public void changeFavSong(Song favoriteSong){
        this.favoriteSong = favoriteSong;
    }
}