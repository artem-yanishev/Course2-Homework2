package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] items;
    private int count;

    public SearchEngine(int size) {
        this.items = new Searchable[size];
        this.count = 0;
    }

    public void add(Searchable item) {
        if (count >= items.length) {
            System.out.println("Массив поиска заполнен, нельзя добавить больше элементов!");
            return;
        }
        items[count++] = item;
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        for (int i = 0; i < count; i++) {
            Searchable current = items[i];
            if (current == null) {
                continue;
            }

            String term = current.getSearchTerm();
            if (term != null && term.toLowerCase().contains(query.toLowerCase())) {
                results[foundCount++] = current;
            }

            if (foundCount == results.length) {
                break;
            }
        }

        return results;
    }
}
