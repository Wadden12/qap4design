package com.qap.qap4design.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {

    private final TournamentRepository tournamentRepository;
@Autowired
    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    public List<Tournament> getTournaments(){
        return tournamentRepository.findAll();
    }

    public void addNewTournament(Tournament tournament) {
       Optional<Tournament> tournamentByName =  tournamentRepository
               .findTournamentByName(tournament.getName());
        if(tournamentByName.isPresent()){
            throw new IllegalArgumentException("Tournament Name already exists");
        }
        tournamentRepository.save(tournament);
    }


    public void deleteStudent(Long tournamentId) {
        boolean exist = tournamentRepository.existsById(tournamentId);
        if(!exist){
            throw new IllegalArgumentException("Tournament with id " + tournamentId + "does not exist");
        }
        tournamentRepository.deleteById(tournamentId);
    }
}
