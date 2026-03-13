package behavioral.iterator.problem;

import java.util.ArrayList;
import java.util.List;

public class YouTubePlaylistP {
    private List<VideoP> videos = new ArrayList<>();

    // Add a video to the playlist
    public void addVideo(VideoP video) {
        videos.add(video);
    }

    // Expose the video list
    public List<VideoP> getVideos() {
        return videos;
    }
}
