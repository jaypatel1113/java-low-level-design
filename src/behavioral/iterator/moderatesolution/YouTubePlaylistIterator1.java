package behavioral.iterator.moderatesolution;

import java.util.List;

public class YouTubePlaylistIterator1 implements PlaylistIterator1 {
    private List<Video1> videos;
    private int position;

    public YouTubePlaylistIterator1(List<Video1> videos) {
        this.videos = videos;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < videos.size();
    }

    @Override
    public Video1 next() {
        return hasNext() ? videos.get(position++) : null;
    }
}

