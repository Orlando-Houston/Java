package Cours.Aug26;
import java.util.ArrayList;



public class BookList extends Books {
    ArrayList<String> list;

    public BookList(String title, String author, String id,ArrayList<String> list) {
        super(title,author,id);
        this.list = list;
    }

    public void addBook(String title,String author,String id){
        String book = title + "," + author + "," +  id;
        this.list.add(book);
    }
    public void removeBook(String id){
        String[] bookExtract = new String[3];
        for(String book : this.list){
            bookExtract = book.split(",");
            if (bookExtract[2].equals(id)){
                this.list.remove(book);
            }
        }
    }
}
