import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Movies;
import ru.netology.MoviesManager;

public class MoviesManagerTest {

    MoviesManager manager = new MoviesManager(3);

    Movies movie1 = new Movies("Bloodshot");
    Movies movie2 = new Movies("Forward");
    Movies movie3 = new Movies("Hotel Belgrade");
    Movies movie4 = new Movies("Gentlemen");
    Movies movie5 = new Movies("The invisible man");

    @Test
    public void testZero() {

        Movies[] expected = manager.findAll();
        Movies[] actual = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);

        Movies[] expected = {movie1, movie2, movie3};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);

        Movies[] expected = {movie5, movie4, movie3};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
