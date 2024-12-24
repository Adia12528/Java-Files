package Oops;

import java.util.Scanner;

public class movieMagic {
    int year;
    String title;
    float rating;

    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year: ");
            year = sc.nextInt();
            System.out.print("Enter the title of movie: ");
            title = sc.next();
            System.out.print("Enter the rating you want to give: ");
            rating = sc.nextFloat();
        }
    }
    void display(){
        System.out.println("The year was: "+year);
        System.out.println("The title was: "+title);
        System.out.println("The rating given was: "+rating+" therefore the movie was:- ");
        if (rating <= 2.0) {
            System.out.println("Flop");
        }
        else if (rating <= 3.4) {
            System.out.println("Semi-hit");
        }
        else if (rating <= 4.5) {
            System.out.println("Hit");
        }
        else if (rating <= 5.0) {
            System.out.println("Super hit");
        }
        else{
            System.out.println("Enter the correct rating!");
        }
    }
    public static void main(String[] args) {
        movieMagic obj = new movieMagic();
        obj.accept();
        obj.display();
    }
}
