package com.example.demo;
import java.util.*;

import org.springframework.http.MediaType;
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



}
