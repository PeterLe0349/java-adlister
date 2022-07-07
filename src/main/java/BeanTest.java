import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        Author a = new Author();
        a.setId(3);
        a.setFirstName("Peter");
        a.setLastName("Le");
        System.out.println(a.getFirstName() + "" + a.getLastName() + " " + a.getId());
        Author a2 = new Author(2, "Mary", "Shelley");
        System.out.printf("%s %s is ranked %d %n", a2.getFirstName(),a2.getLastName(),a2.getId());
        Album al = new Album();
        al.setArtist("Nirvana");
        al.setDate(2001);
        al.setGenres(new String[]{"Rock", "Metal"});
        al.setSales(1231232);
        al.setId(4);
        al.setName("Epiphany");
        System.out.printf("%s played %s with genres %s in the year %d and sold %d and is ranked %d %n", al.getArtist(), al.getName(), Arrays.toString(al.getGenres()), al.getDate(), al.getSales(), al.getId());
        Album al2 = new Album(5, "Bon Jovi", "Journey", 2002, 200000, new String[]{"classic"});
        System.out.printf("%s played %s with genres %s in the year %d and sold %d and is ranked %d %n", al2.getArtist(), al2.getName(), Arrays.toString(al2.getGenres()), al2.getDate(), al2.getSales(), al2.getId());
        Quote q = new Quote(1, "To Be or Not to Be", new Author(1,"William", "Shakespeare"));
        System.out.printf("%s said by %s %s", q.getContent(), q.getAuthor().getFirstName(), q.getAuthor().getLastName());
        ArrayList<Album> albums = new ArrayList<>();
        String stuff = "Something ";
        for(int i = 0; i< 5; i++){
            albums.add(new Album(i, "Artist#" + i, "Name#" + i, 2000+i, 1000+i, new String[]{"rock n roll"}));
        }
        for(Album aa: albums){
            System.out.printf("%s played %s with genres %s in the year %d and sold %d and is ranked %d %n", aa.getArtist(), aa.getName(), Arrays.toString(aa.getGenres()), aa.getDate(), aa.getSales(), aa.getId());
        }
        ArrayList<Quote> quotes = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            quotes.add(new Quote(i, "something " + i + " something", new Author(i, "first" +i,  "last" + i)));
        }
        for(Quote qq: quotes){
            System.out.printf("%s said by %s %s %n", qq.getContent(), qq.getAuthor().getFirstName(), qq.getAuthor().getLastName());
        }




    }
}
