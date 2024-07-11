package class1.test;

public class MovieReviewMain {
    public static void main(String[] args) {
        
        
        MovieReview[] movieReviews = new MovieReview[]{new MovieReview("인셉션", "인생은 무한 루프"), new MovieReview("어바웃 타임", " 인생 시간 영화!")};
        
        for (MovieReview movieReview : movieReviews) {
            String format = String.format("영화제목: %s, 리뷰: %s", movieReview.title, movieReview.review);
            System.out.println(format);
        }
    }
}
