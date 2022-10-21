public class Movie {
    private String title;
    private int year;
    private double score;

    public static int movieCount = 0; // Így hogy static csak 1x fog teruletet foglalni 

    public Movie(String title, int year, double score){
        this.title = title;
        this.year = year;
        this.setScore(score);

        ++Movie.movieCount;
    }

    @Override
    public String toString(){
        //return string.format(...);
    return title + ", " + year + ", " + score;
    }

    public String getTitle() {  
        return this.title; 
    }

    public void getScore()
    {

    }
    
    public void setScore(double newScore)
    {
        this.score = newScore;
        if (newScore > 10.0){
            this.score = 10.0;
        }
        else if (newScore < 0.0){
            this.score = 0.0;
        }

    }
}
