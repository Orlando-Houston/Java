package Cours.Aug26;
import java.util.HashMap;
import java.util.Map;

public class Movies {
    int id, year;
    String title, director;
    double rating;
    public Movies(int id, int year, String title, String director, double rating){
        this.id = id;
        this.year = year;
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Map<Integer,Movies> map = new HashMap<Integer, Movies>();
        Movies movie1 = new Movies(1,1994,"The Shawshank Redemption","Frank Darabont", 9.3);
        Movies movie2 = new Movies(2,1972,"The Godfather","Francis F Coppola", 9.1);
        Movies movie3 = new Movies(3,1974,"The Godfather II","Francis F Coppola", 9.0);
        Movies movie4 = new Movies(4,2008,"The Dark Knight","Christopher Nolan", 9.0);
        Movies movie5 = new Movies(5,1957,"12 Angry Men","Sidney Lumet", 8.9);

        map.put(1,movie1);
        map.put(2,movie2);
        map.put(3,movie3);
        map.put(4,movie4);


        System.out.println("List of top rated movies: ");
        for(Map.Entry<Integer,Movies> entry: map.entrySet()){
            Movies movie = entry.getValue();
            System.out.println(movie.id + " " + movie.year + " " + movie.title + " " + movie.director + " " + movie.rating);
        }

        map.replace(3,movie3,movie5);

        System.out.println("Updated list of movies: ");
        for(Map.Entry<Integer,Movies> entry: map.entrySet()){
            Movies movie = entry.getValue();
            System.out.println(movie.id + " " + movie.year + " " + movie.title + " " + movie.director + " " + movie.rating);
        }

        map.put(5, movie3);

        System.out.println("Updated list of movies: ");
        for(Map.Entry<Integer,Movies> entry: map.entrySet()){
            Movies movie = entry.getValue();
            System.out.println(movie.id + " " + movie.year + " " + movie.title + " " + movie.director + " " + movie.rating);        }

    }
}
