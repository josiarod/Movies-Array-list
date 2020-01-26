import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args){
        ArrayList<String> movies = new ArrayList<String>();





        Scanner sc = new Scanner(System.in);
        String userMovie = "yes";
        while(!userMovie.equalsIgnoreCase("q")){
            System.out.println("Please enter a movie name: ");
            userMovie = sc.next();
            if(userMovie.equalsIgnoreCase("q")){
                break;
            }
           movies.add(userMovie);
        }

        for (String movie : movies) {
            System.out.println(movie);
        }

      Collections.sort(movies);
        System.out.println("Sorted list of movies: " + movies);
    }
}
