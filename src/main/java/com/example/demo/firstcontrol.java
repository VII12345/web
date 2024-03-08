package com.example.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

@RestController
public class firstcontrol {
    @GetMapping(value = "/api/first", produces = MediaType.TEXT_HTML_VALUE)
    public String getHtmlContent() throws IOException {
        Resource resource = new ClassPathResource("static/first.html");
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(resource.getInputStream(), StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
            }
        }
        return builder.toString();
    }

}
