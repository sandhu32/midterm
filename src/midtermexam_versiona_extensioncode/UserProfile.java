/*
 * this comment is done in git hub 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */


public class UserProfile 
{
    
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */

    public class rajpreet 
{
       /**
        * My name is Rajpreet singh sandhu 
        * this class is for 4 the question
        */

}
public class TestUserprofile {

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        List<String> genres = Arrays.asList("Action", "Romance", "Comedy", "Horror", "Sci-Fi", "Documentary");
        System.out.println("Choose your favorite genre from the following list:");
        for (int i = 0; i < genres.size(); i++) {
            System.out.println((i + 1) + ". " + genres.get(i));
        }

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();
        while (genreChoice < 1 || genreChoice > genres.size()) {
            System.out.print("Invalid choice. Please enter a number between 1 and " + genres.size() + ": ");
            genreChoice = scanner.nextInt();
        }

        String favoriteGenre = genres.get(genreChoice - 1);
        System.out.println("Profile created!\nName: " + name + "\nFavorite Genre: " + favoriteGenre);
        scanner.close();
    }
}
 
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    

   
    
}//end class
