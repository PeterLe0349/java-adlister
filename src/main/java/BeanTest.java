import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        Author a = new Author();
        a.setId(3);
        a.setFirstName("Peter");
        a.setLastName("Le");
        System.out.println(a.getFirstName() + "" + a.getLastName() + " " + a.getId());
        Album al = new Album();
        al.setArtist("Nirvana");
        al.setDate(2001);
        al.setGenres(new String[]{"Rock", "Metal"});
        al.setSales(1231232);
        al.setId(4);
        al.setName("Epiphany");
        System.out.printf("%s played %s with genres %s in the year %d and sold %d and is ranked %d %n", al.getArtist(), al.getName(), Arrays.toString(al.getGenres()), al.getDate(), al.getSales(), al.getId());
        Quote q = new Quote(1, "To Be or Not to Be", new Author(1,"William", "Shakespeare"));
        System.out.printf("%s said by %s %s", q.getContent(), q.getAuthor().getFirstName(), q.getAuthor().getLastName());



    }
}
