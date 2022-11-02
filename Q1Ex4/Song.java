public class Song {
    private String title, album, artist;

    public Song(String title, String album, String artist){
        this.title = title;
        this.album = album;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
        System.out.println("This song is titled " + this.title + ".\n");
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
        System.out.println(this.title + " is from the album " + this.album + ".\n");
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
        System.out.println(this.title + " was produced by " + this.artist + ".\n");
    }
}