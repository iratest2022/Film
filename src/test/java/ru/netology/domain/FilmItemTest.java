package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmItemTest {

    @Test
    void shouldSetId() {
        FilmItem film = new FilmItem();
        film.setId(1);
        int expected = 1;
        int actual = film.getId();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetFilmId() {
        FilmItem film = new FilmItem();
        film.setFilmId(5);
        int expected = 5;
        int actual = film.getFilmId();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPosterUrl() {
        FilmItem film = new FilmItem();
        film.setPosterUrl("https://test.com/some.jpg");
        String expected = "https://test.com/some.jpg";
        String actual = film.getPosterUrl();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetFilmName() {
        FilmItem film = new FilmItem();
        film.setFilmName("Вперед");
        String expected = "Вперед";
        String actual = film.getFilmName();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetFilmType() {
        FilmItem film = new FilmItem();
        film.setFilmType("мультфильм");
        String expected = "мультфильм";
        String actual = film.getFilmType();
        assertEquals(expected, actual);
    }
}