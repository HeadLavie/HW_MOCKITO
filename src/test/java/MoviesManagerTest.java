import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Movies;
import ru.netology.MoviesManager;

public class MoviesManagerTest {

    Movies movie1 = new Movies("Bloodshot");
    Movies movie2 = new Movies("Forward");
    Movies movie3 = new Movies("Hotel Belgrade");


    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);

        Movies[] expected = {movie1, movie2, movie3};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
