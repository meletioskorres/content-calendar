package dev.melkor.contentcalendar;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.melkor.contentcalendar.config.ContentCalendarProperties;
import dev.melkor.contentcalendar.config.DataLoader;
import dev.melkor.contentcalendar.model.Content;
import dev.melkor.contentcalendar.model.Status;
import dev.melkor.contentcalendar.model.Type;
import dev.melkor.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}

