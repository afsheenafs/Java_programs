import java.io.*;
import java.util.*;
class Movie {
     String title;
     String director;
     String producer;
     String[] actors;
     int[] starrate;

    public Movie(String title, String director, String producer)
 {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.actors = actors;
        System.out.println("\nTITLE: "+title+"\nDIRECTOR: "+director+"\nPRODUCER: "+producer); 
    }

   static int setRatings() {
      int act,diag,cine,edit,sound,ratings;
Scanner s=new Scanner(System.in);
System.out.println("Give Ratings:");
System.out.println("For acting:");
act=s.nextInt();
System.out.println("For dialogue:");
diag =s.nextInt();
System.out.println("For cinematography :");
cine=s.nextInt();
System.out.println("For Editing:");
edit=s.nextInt();
System.out.println("For Soundtrack:");
sound=s.nextInt();
ratings=(act+diag+cine+edit+sound);

return ratings;

    }


    public void recommendMovie(int star) {
      int starrate=star;
        if (starrate < 10) 
System.out.println( "Not recommended, worst!!!");
       else if((starrate>=10)&& (starrate<25))
System.out.println( "Average");
       else if((starrate>=25)&& (starrate<35))
 System.out.println("Watchable");
       else if((starrate>=35)&& (starrate<45))
System.out.println("Recommended");

        else 
 System.out.println("Highly Recommended");
    }

   
}

public class Mov {
    public static void main(String[] args) {
        String[] actors = {"vijay", "asin", "Prakash Raj"};
   for(int i=0;i<actors.length;i++)
{
System.out.println(actors[i]);
}
        Movie movie = new Movie("pokkiri", "prabhu deva", "mani sharma");
        
       int r1= movie.setRatings();
        movie.recommendMovie(r1);
System.out.println("\n");
        String[] actor = {"Surya", "Anushka", "Hansika"};
   for(int j=0;j<actor.length;j++){
System.out.println(actor[j]);
}
        Movie m1 = new Movie("mersal", "Atlee", "mehendran");
        
       int r2= movie.setRatings();
        m1.recommendMovie(r2);
    }

}