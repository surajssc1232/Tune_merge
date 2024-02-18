package com.example.demo;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String body){
        return body;
    }

    @PostMapping("/submitSpotifyAccount")
    public String submitSpotifyAccount(@RequestParam String spotifyAccount){
        // Here you should implement the logic to authenticate and authorize the user with Spotify's Web API
        // Then, fetch the user's playlists
        // This is a placeholder and needs to be replaced with actual implementation
        return "Received Spotify Account: " + spotifyAccount;
    }
    @GetMapping("/spotify/playlists")
    public String getPlaylists(@RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        // Use the access token to make requests to the Spotify Web API
        // This is a placeholder and needs to be replaced with actual implementation
        return "Access token: " + accessToken;
    }



}
