package org.vansh.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class URLShortnerRepository {
    private long ID = 1;
    private final Map<String, String> shortToLong = new ConcurrentHashMap<>();
    private final Map<String, String> longToShort = new ConcurrentHashMap<>();

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
