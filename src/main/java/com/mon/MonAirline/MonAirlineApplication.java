package com.mon.MonAirline;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.EnableAsync;

import java.nio.charset.StandardCharsets;

@SpringBootApplication
@EnableAsync
public class MonAirlineApplication {

//    @Autowired
//    private JavaMailSender javaMailSender;


    public static void main(String[] args) {
		SpringApplication.run(MonAirlineApplication.class, args);

        System.out.println("\n\n 🚀 Application started...\n\n");
	}

//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//            try {
//                MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//                MimeMessageHelper helper = new MimeMessageHelper(
//                        mimeMessage,
//                        MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                        StandardCharsets.UTF_8.name()
//                );
//                helper.setTo("mon.messaging@gmail.com");
//                helper.setSubject("Mon Airline Testing");
//                helper.setText("Testing email 123");
//
//                System.out.println("\nAbout to send the email: ");
//                javaMailSender.send(mimeMessage);
//            } catch(Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        };
//    }

}
