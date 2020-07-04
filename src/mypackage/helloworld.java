package mypackage;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class helloworld {
    public static void main(String[] args) 
    {
        System.out.println("Example 3 through ANT!!");
        SendRequest();
    }  

    public static void SendRequest()
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("http://localhost:3000"))
              .build();
        
        
        client.sendAsync(request, BodyHandlers.ofString())
              .thenApply(HttpResponse::body)
              .thenAccept(System.out::println)
              .join();
    
    };
}