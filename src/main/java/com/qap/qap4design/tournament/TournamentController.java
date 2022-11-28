package com.qap.qap4design.tournament;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/tournament")
public class TournamentController {

    @GetMapping()
    public List<Tournament> getTournaments(){
        return List.of(
                new Tournament(1L,
                        LocalDate.of(2022, Month.JULY,23),
                        LocalDate.of(2022,Month.JULY,24),
                        "The Wilds",
                        1_000.00,
                        25_000.00)
        );
    }



}
