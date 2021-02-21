package me.averywald.minehook;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * Send a GET request to google.com
 *
 */
public class App {
    public static void main( String[] args ) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://www.google.com"))
              .build();

            HttpResponse<String> response =
              client.send(request, BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
