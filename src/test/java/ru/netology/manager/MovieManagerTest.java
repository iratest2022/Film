package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldSetItemsNumber() {
        MovieManager manager = new MovieManager();
        manager.setItemsNumber(50);
        int expected = 50;
        int actual = manager.getItemsNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddFilm() {
        MovieManager manager = new MovieManager();
        FilmItem first = new FilmItem(1, 10, "https://test.com/some.jpg", "Джентельмены", "боевик");
        manager.addFilm(first);
        FilmItem[] actual = manager.getLastN();
        FilmItem[] expected = new FilmItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLast10ByDefault() {
        MovieManager manager = new MovieManager();
        FilmItem one = new FilmItem(1, 1, "url", "name", "film");
        FilmItem two = new FilmItem(2, 2, "url", "name", "film");
        FilmItem three = new FilmItem(3, 3, "url", "name", "film");
        FilmItem four = new FilmItem(4, 4, "url", "name", "film");
        FilmItem five = new FilmItem(5, 5, "url", "name", "film");
        FilmItem six = new FilmItem(6, 6, "url", "name", "film");
        FilmItem seven = new FilmItem(7, 7, "url", "name", "film");
        FilmItem eight = new FilmItem(8, 8, "url", "name", "film");
        FilmItem nine = new FilmItem(9, 9, "url", "name", "film");
        FilmItem ten = new FilmItem(10, 10, "url", "name", "film");
        FilmItem eleven = new FilmItem(11, 11, "url", "name", "film");
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        FilmItem[] actual = manager.getLastN();
        FilmItem[] expected = new FilmItem[]{eleven, ten, nine, eight, seven, six, five, four, three, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAnyItemsNumber() {
        MovieManager manager = new MovieManager(3);
        FilmItem one = new FilmItem(1, 1, "url", "name", "film");
        FilmItem two = new FilmItem(2, 2, "url", "name", "film");
        FilmItem three = new FilmItem(3, 3, "url", "name", "film");
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        FilmItem[] actual = manager.getLastN();
        FilmItem[] expected = new FilmItem[]{three, two, one};

        assertArrayEquals(expected, actual);
    }
}