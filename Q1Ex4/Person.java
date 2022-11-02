public class Person {
    private String name;
    private Song favoriteSong;
    private Singer favoriteSinger;

    public Person(String name, Song favoriteSong, Singer favoriteSinger){
        this.name = name;
        this.favoriteSong = favoriteSong;
        this.favoriteSinger = favoriteSinger;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("This person is named " + this.name + ".\n");
    }

    public Song getFavoriteSong(){
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong){
        this.favoriteSong = favoriteSong;
        System.out.println(this.name + "'s favorite song is " + this.favoriteSong.getTitle() + ".\n");
    }

    public Singer getFavoriteSinger(){
        return favoriteSinger;
    }

    public void setFavoriteSinger(Singer favoriteSinger){
        this.favoriteSinger = favoriteSinger;
        System.out.println(this.name + "'s favorite singer is " + this.favoriteSinger.getName() + ".\n");
    }
}