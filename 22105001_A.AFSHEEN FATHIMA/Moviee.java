import java.util.Arrays;

class Moviee {
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

    public void setReviews(int[] reviews) {
        if (reviews.length == 5) {
            this.reviews = reviews;
        } else {
            System.out.println("Please provide exactly 5 reviews.");
        }
    }

    public int calculateRating() {
        int sum = 0;
        for (int rating : reviews) {
            sum += rating;
        }
        return sum;
    }

    public void recommendMovie() {
        int totalRating = calculateRating();
        if (totalRating < 10) {
            System.out.println("Movie: " + title + " - Not recommended, Worst!!!");
        } else if (totalRating >= 10 && totalRating < 25) {
            System.out.println("Movie: " + title + " - Average");
        } else if (totalRating >= 25 && totalRating < 35) {
            System.out.println("Movie: " + title + " - Watchable");
        } else if (totalRating >= 35 && totalRating < 45) {
            System.out.println("Movie: " + title + " - Recommended");
        } else {
            System.out.println("Movie: " + title + " - Highly Recommended");
        }
    }

    public static void main(String[] args) {
        String[] actors = {"Vijay", "Ajith", "Surya"};
        Movie movie = new Movie("Leo", "Lokesh Kanakaraj", "Aishwarya", actors);
        int[] reviews = {8, 9, 7, 8, 6}; // Sample reviews for the movie
        movie.setReviews(reviews);
        movie.notrecommendMovie();
    }
}