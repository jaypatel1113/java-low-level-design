package behavioral.iterator;

import behavioral.iterator.moderatesolution.PlaylistIterator1;
import behavioral.iterator.moderatesolution.Video1;
import behavioral.iterator.moderatesolution.YouTubePlaylist1;
import behavioral.iterator.moderatesolution.YouTubePlaylistIterator1;
import behavioral.iterator.problem.YouTubePlaylistP;
import behavioral.iterator.problem.VideoP;
import behavioral.iterator.solution.contract.PlaylistIterator;
import behavioral.iterator.solution.impl.Video;
import behavioral.iterator.solution.impl.YouTubePlaylist;

public class Main {
    public static void main(String[] args) {
        YouTubePlaylistP playlistP = new YouTubePlaylistP();
        playlistP.addVideo(new VideoP("LLD Tutorial"));
        playlistP.addVideo(new VideoP("System Design Basics"));

        // client knows types n all stuff
        for (VideoP v : playlistP.getVideos()) {
            System.out.println(v.getTitle());
        }













        YouTubePlaylist1 playlist1 = new YouTubePlaylist1();
        playlist1.addVideo(new Video1("LLD Tutorial"));
        playlist1.addVideo(new Video1("System Design Basics"));

        // Client directly creates the iterator using internal list (not ideal)
        PlaylistIterator1 iterator1 = new YouTubePlaylistIterator1(playlist1.getVideos());

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().getTitle());
        }











        YouTubePlaylist playlist = new YouTubePlaylist();
        playlist.addVideo(new Video("LLD Tutorial"));
        playlist.addVideo(new Video("System Design Basics"));

        PlaylistIterator iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
