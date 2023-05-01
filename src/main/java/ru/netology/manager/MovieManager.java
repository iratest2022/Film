package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class MovieManager {
    private int itemsNumber = 7;
    // Сделайте так, чтобы по умолчанию выводилось последние 5 добавленных фильма,
    // но при создании менеджера можно было указать другое число, чтобы, например,
    // выдавать 7 или 3, а не 5. То есть у менеджера должно быть два конструктора:
    // один без параметров, выставляющий лимит менеджера в 5, а другой с параметром,
    // берущий значение лимита для менеджера из параметра конструктора.

    public int getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }

    public MovieManager() {
    }

    public MovieManager(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }

    private FilmItem[] items = new FilmItem[0];

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getLastN() {
        int listLength;
        if (items.length < itemsNumber) {
            listLength = items.length;
        } else {
            listLength = itemsNumber;
        }
        FilmItem[] result = new FilmItem[listLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}