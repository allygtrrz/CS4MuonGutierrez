public class Song {
    String title, album, artist;

    public Song(String title, String album, String artist){
        this.title = title;
        this.album = album;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public String getArtist(){
        return artist;
    }
}