package org.vansh.service;

public class EncodingService {
    private final String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String encodeLongURL(long num) {
        StringBuilder encodedURL = new StringBuilder();

        while (num > 0) {
            encodedURL.append(str.charAt((int)(num % 62)));
            num /= 62;
        }

        return encodedURL.reverse().toString();
    }
}