import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Movies;
import ru.netology.MoviesManager;

public class MoviesManagerTest {

    Movies movie1 = new Movies("Bloodshot");
    Movies movie2 = new Movies("Forward");
    Movies movie3 = new Movies("Hotel Belgrade");
    Movies movie4 = new Movies("Gentlemen");
    Movies movie5 = new Movies("The invisible man");
    Movies movie6 = new Movies("Trolls");


    @Test
    public void testFindZero() {

        MoviesManager manager = new MoviesManager();

        Movies[] expected = manager.findAll();
        Movies[] actual = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {

        MoviesManager manager = new MoviesManager();

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);

        Movies[] expected = {movie1, movie2, movie3};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll2() {

        MoviesManager manager = new MoviesManager(3);

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {

        MoviesManager manager = new MoviesManager();

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);

        Movies[] expected = {movie5, movie4, movie3, movie2, movie1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast2() {

        MoviesManager manager = new MoviesManager(3);

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);

        Movies[] expected = {movie5, movie4, movie3};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLengthBiggerThanMovies() {

        MoviesManager manager = new MoviesManager(5);

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);


        Movies[] expected = {movie3, movie2, movie1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
