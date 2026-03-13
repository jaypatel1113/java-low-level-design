package behavioral.iterator.solution.contract;

import behavioral.iterator.solution.impl.Video;

public interface PlaylistIterator {
    boolean hasNext();
    Video next();
}