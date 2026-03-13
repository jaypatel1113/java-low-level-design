package behavioral.observer.problem;

public class YouTubeChannelP {
    public void uploadNewVideo(String videoTitle) {
        // Upload the video
        System.out.println("Uploading: " + videoTitle + "\n");

        // Manually notify users (1M+ users)
        System.out.println("Sending email to user1@example.com");
        System.out.println("Pushing in-app notification to user3@example.com");
    }
}
