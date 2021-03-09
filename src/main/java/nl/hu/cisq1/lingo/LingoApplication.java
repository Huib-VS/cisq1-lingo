package nl.hu.cisq1.lingo;

import nl.hu.cisq1.lingo.domain.Game;
import nl.hu.cisq1.lingo.words.application.WordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LingoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LingoApplication.class, args);
    }
}
