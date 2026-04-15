package org.vansh.service;

import org.vansh.repository.URLShortnerRepository;

public class URLShortnerService {
    private final URLShortnerRepository urlShortnerRepository;
    private final EncodingService encodingService;

    public URLShortnerService(URLShortnerRepository urlShortnerRepository, EncodingService encodingService) {
        this.urlShortnerRepository = urlShortnerRepository;
        this.encodingService = encodingService;
    }

    public String createShortURL(String longURL) {
        long id = this.urlShortnerRepository.getNextId();
        String shortURL = this.encodingService.encodeLongURL(id);
        this.urlShortnerRepository.save(shortURL, longURL);

        return shortURL;
    }

    public String getURL(String shortURL) {
        return this.urlShortnerRepository.find(shortURL);
    }
}
