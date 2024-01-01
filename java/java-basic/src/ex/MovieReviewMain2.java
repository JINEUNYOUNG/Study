package ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "good";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "very good";

        MovieReview[] reviews = new MovieReview[2];
        reviews[0] = inception;
        reviews[1] = aboutTime;

        for (MovieReview review : reviews){
            System.out.println(review.review);
            System.out.println(review.title);
        }
    }
}
