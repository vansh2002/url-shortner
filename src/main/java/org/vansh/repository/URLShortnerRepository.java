package org.vansh.repository;

import java.util.HashMap;
import java.util.Map;

public class URLShortnerRepository {
    private long ID = 1;
    private final Map<String, String> shortToLong = new HashMap<>();

    public synchronized long getNextId() {
        return ID++;
    }

    public void save(String shortURL, String longURL) {
        shortToLong.put(shortURL, longURL);
    }

    public String find(String shortURL) {
        return shortToLong.getOrDefault(shortURL, "");
    }
}
