import java.util.Arrays;

class Movie {
    private String title;
    private String director;
    private String producer;
    private String[] actors;
    private int[] reviews = new int[5];

    public Movie(String title, String director, String producer, String[] actors) {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.actors = actors;
    }

    public void setReviews(int acting, int dialogue, int cinematography, int editing, int soundtrack) {
        reviews[0] = acting;
        reviews[1] = dialogue;
        reviews[2] = cinematography;
        reviews[3] = editing;
        reviews[4] = soundtrack;
    }

    public int calculateTotalRating() {
        int totalRating = 0;
        for (int review : reviews) {
            totalRating += review;
        }
        return totalRating;
    }

    public String recommendMovie() {
        int totalRating = calculateTotalRating();
        if (totalRating < 10) {
            return "Not recommended, Worst!!!";
        } else if (totalRating >= 10 && totalRating < 25) {
            return "Average";
        } else if (totalRating >= 25 && totalRating < 35) {
            return "Watchable";
        } else if (totalRating >= 35 && totalRating < 45) {
            return "Recommended";
        } else {
            return "Highly Recommended";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] actors = {"Actor 1", "Actor 2", "Actor 3"};
        Movie movie = new Movie("Example Movie", "Director 1", "Producer 1", actors);
        movie.setReviews(8, 7, 9, 8, 9); // Sample review ratings

        System.out.println("Movie recommendation: " + movie.recommendMovie());
    }
}
