package behavioral.iterator.solution.impl;

import behavioral.iterator.solution.contract.Playlist;
import behavioral.iterator.solution.contract.PlaylistIterator;

import java.util.ArrayList;
import java.util.List;

public class YouTubePlaylist implements Playlist {
    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video video) {
        videos.add(video);
    }

    @Override
    public PlaylistIterator createIterator() {
        return new YouTubePlaylistIterator(videos);
    }
}
