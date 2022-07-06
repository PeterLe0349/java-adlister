import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private int date;
    private long sales;
    private String[] genres;

    public Album(){
    }

    public Album(long id, String artist, String name, int date, long sales, String[] genres) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.date = date;
        this.sales = sales;
        this.genres = genres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
