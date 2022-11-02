public class Fan {
    String name;
    Song favoriteSong;
    Singer favoriteSinger;

    public Fan(String name, Song favoriteSong, Singer favoriteSinger){
        this.name = name;
        this.favoriteSong = favoriteSong;
        this.favoriteSinger = favoriteSinger;
    }

    public void changeFavSong(Song favoriteSong){
        this.favoriteSong = favoriteSong;
    }

    public void changeFavSinger(Singer favoriteSinger){
        this.favoriteSinger = favoriteSinger;
    }
}