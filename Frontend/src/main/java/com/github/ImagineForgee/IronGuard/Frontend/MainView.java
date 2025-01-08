package com.github.ImagineForgee.IronGuard.Frontend;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.notification.Notification;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button fetchDataButton = new Button("Fetch Data", event -> fetchDataFromBackend());
        add(fetchDataButton);
    }

    private void fetchDataFromBackend() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/api/data")) // Backend API URL
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Notification.show("Backend Response: " + response.body());
        } catch (Exception e) {
            Notification.show("Error fetching data: " + e.getMessage());
        }
    }
}