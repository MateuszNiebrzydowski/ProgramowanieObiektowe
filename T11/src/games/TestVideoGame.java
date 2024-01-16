package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVideoGame {
    public static void main(String[] args)
    {
        VideoGame game1 = new VideoGame("Grand Theft Auto V", "Rockstar Games", 9.0f);
        VideoGame game2 = new VideoGame("Cyberpunk 2077", "CD Projekt RED", 8.1f);
        VideoGame game3 = new VideoGame("Assassin's Creed Mirage", "Ubisoft", 7.9f);
        VideoGame game4 = new VideoGame("The Last Of Us", "Naughty Dog", 9.5f);

        List<VideoGame> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        Collections.sort(games);

        for (VideoGame g : games)
        {
            System.out.println(g);
        }
    }
}
