package com.guess.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.guess.song.mapper")
@SpringBootApplication
public class GuessSongServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuessSongServerApplication.class, args);
    }

}
