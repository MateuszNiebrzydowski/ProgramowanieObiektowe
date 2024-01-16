package games;

public class VideoGame implements Comparable<VideoGame> {
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating)
    {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(VideoGame obj)
    {
        return Integer.compare(obj.name.length(), this.name.length());
    }

    @Override
    public String toString()
    {
        return "Video Game: Name: " + name + ", Developer: " + developer + ", Rating: " + rating;
    }

}
