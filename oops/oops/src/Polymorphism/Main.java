package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("star wars");
        movie1.watchMovie();

        Movie movie2 = new Adventure("Star Wars");
        movie2.watchMovie();

        // this will return a ScienceFiction class movie from our factory method .getMovie()
        Movie movie3 = Movie.getMovie("Science", "Oblivion");
        movie3.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter type (A for Adventure, C for Comedy, S for Science Fiction, Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type))
                break;

            System.out.print("Enter Movie Title: ");
            Movie userMovie = Movie.getMovie(type, s.nextLine());
            userMovie.watchMovie();
        }

        // Casting with Classes

        Adventure jaws = (Adventure) Movie.getMovie("A", "jaws");  //this will work fine
        // Adventure jaws = (Adventure) Movie.getMovie("C", "jaws");           // this will give error
        jaws.watchMovie();

        // we can do this with every class but we can't be able to do much because now we can only call methods of Object class
        Object comedy = Movie.getMovie("C", "Airplane");
        // comedy.watchMoive()    // error
        // we can assing an instance to a variable of the same type, or a parent type, of parent's parent type including java.lang.Object, the ultimate base class

        // var keyword
        // special contextual keyword in java that lets our code take advantage of Local Variable Type Inference
        // by using var as the type, we're telling java to fiture out the compile-time type for us
        // intoduced in java10

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();


    }

}
