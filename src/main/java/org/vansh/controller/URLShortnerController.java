package org.vansh.controller;

import org.vansh.service.URLShortnerService;

public class URLShortnerController {
    private final URLShortnerService urlShortnerService;

    public URLShortnerController(URLShortnerService urlShortnerService) {
        this.urlShortnerService = urlShortnerService;
    }

    public String createShortURL(String longURL) {
        String shortURL = this.urlShortnerService.createShortURL(longURL);
        return "https://url-shortner/" + shortURL;
    }

    public String getShortURL(String shortURL) {
        return this.urlShortnerService.getURL(shortURL);
    }
}
