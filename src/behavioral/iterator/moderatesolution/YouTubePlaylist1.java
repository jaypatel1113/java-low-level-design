package behavioral.iterator.moderatesolution;

import java.util.ArrayList;
import java.util.List;

public class YouTubePlaylist1 {
    private List<Video1> videos = new ArrayList<>();

    // Add a video to the playlist
    public void addVideo(Video1 video) {
        videos.add(video);
    }

    // Expose the video list
    public List<Video1> getVideos() {
        return videos;
    }
}
