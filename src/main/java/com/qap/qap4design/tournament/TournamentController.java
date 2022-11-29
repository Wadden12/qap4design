package com.qap.qap4design.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/tournament")
public class TournamentController {

    private final TournamentService tournamentService;
    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping()
    public List<Tournament> getTournaments(){
    return tournamentService.getTournaments();
    }

    @PostMapping()
    public void registerNewTournament(@RequestBody Tournament tournament){
        tournamentService.addNewTournament(tournament);
    }

    @DeleteMapping(path ="{tournamentId}")
    public void deleteTournament(@PathVariable("tournamentId") Long tournamentId){
        tournamentService.deleteStudent(tournamentId);
    }



}
