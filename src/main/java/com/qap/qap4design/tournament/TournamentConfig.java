package com.qap.qap4design.tournament;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TournamentConfig {
    @Bean
    CommandLineRunner commandLineRunner(TournamentRepository tournamentRepository){
        return args ->{

         Tournament t1 =   new Tournament(
                    "Mike's Open",
                    LocalDate.of(2022, Month.JULY, 23),
                    LocalDate.of(2022, Month.JULY, 24),
                 "The Wilds",
                 1_000.00,
                 25_000.00);

            Tournament t2 =   new Tournament(
                    "Club Open",
                    LocalDate.of(2022, Month.JULY, 1),
                    LocalDate.of(2022, Month.JULY, 2),
                    "Clovalley",
                    100.00,
                    5_000.00
                    );

//            Tournament t3 =   new Tournament(
//                    "Fail Test Open",
//                    LocalDate.of(2022, Month.JULY, 1),
//                    LocalDate.of(2022, Month.MAY, 2),
//                    "Fail Course",
//                    250.00,
//                    10_000.00
//            );

            tournamentRepository.saveAll(List.of(t1,t2));
        };
    }
}
