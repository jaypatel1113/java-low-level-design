package structural.proxy;

import structural.proxy.problem.RealVideoDownloaderP;
import structural.proxy.solution.CachedVideoDownloader;
import structural.proxy.solution.contract.VideoDownloader;

public class Main {
    public static void main(String[] args) {
        System.out.println("User 1 tries to download the video.");
        RealVideoDownloaderP downloader1 = new RealVideoDownloaderP();
        downloader1.downloadVideo("https://video.com/proxy-pattern");

        System.out.println();

        System.out.println("User 2 tries to download the same video again.");
        RealVideoDownloaderP downloader2 = new RealVideoDownloaderP();
        downloader2.downloadVideo("https://video.com/proxy-pattern");


        System.out.println("\n\n===============\n\n");


        VideoDownloader cacheVideoDownloader = new CachedVideoDownloader();
        System.out.println("User 1 tries to download the video.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");

        System.out.println();

        System.out.println("User 2 tries to download the same video again.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
    }
}
