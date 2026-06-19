class SocialMediaUploader {
    void uploadContent() {
        System.out.println("Uploading content...");
    }
}

class InstagramUploader extends SocialMediaUploader {
    void uploadContent() {
        System.out.println("Uploading photo/reel to Instagram");
    }
}

class YouTubeUploader extends SocialMediaUploader {
    void uploadContent() {
        System.out.println("Uploading video to YouTube");
    }
}

public class SocialMediaUploaderTest {
    public static void main(String[] args) {
        InstagramUploader i = new InstagramUploader();
        YouTubeUploader y = new YouTubeUploader();

        i.uploadContent();
        y.uploadContent();
    }
}
