package Cours.Aug26;
import java.util.ArrayList;
import java.util.LinkedList;

public class Requests extends BookList {
    LinkedList<String> requestList;

    public Requests(String title, String author, String id, ArrayList<String> list, LinkedList<String> requestList) {
        super(title, author, id, list);
        this.requestList = requestList;
    }

    public void requestBook(String id){
        for(String book :super.list){

        }
    }
    public void requestBook(String author,String title){

    }
}
