package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


@RestController
@RequestMapping("/api")
public class Cotrol {

    @RequestMapping("/hello/data")
    public int[] getData() {
        // 返回一个整数数组
        return new int[]{120, 60, 90, 30,100};
    }







    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    public String getHtmlContent() throws IOException {
        Resource resource = new ClassPathResource("static/123.html");
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(resource.getInputStream(), StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
            }
        }
        return builder.toString();
    }
    }


