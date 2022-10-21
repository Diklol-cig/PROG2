public class Main{
    public static void main(String[] args){
        
    System.out.println(Movie.movieCount);

    Movie m1 = new Movie("The Terminator", 1984, 8.1);

    Movie m2 = new Movie("Star Wars", 1980, 8.8);

    Movie m3 = new Movie("ASD", 1980, 8.9);  
    System.out.println(m1);

    m1.setScore(10.1);
    
    System.out.println(Movie.movieCount);

    }
}