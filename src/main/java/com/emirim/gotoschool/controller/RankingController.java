package com.emirim.gotoschool.controller;

import com.emirim.gotoschool.domain.Ranking;
import com.emirim.gotoschool.dto.AddRankingRequest;
import com.emirim.gotoschool.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ranking")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RankingController {

    private final RankingService rankingService;

    @Autowired
    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @GetMapping
    public ResponseEntity<List<Ranking>> findAll() {
        return ResponseEntity.status(200)
                .body(rankingService.findAllRanking());
    }

    @PostMapping
    public ResponseEntity<Ranking> createRanking(@RequestBody AddRankingRequest addRankingRequest) {
        return ResponseEntity.status(201)
                .body(rankingService.createRanking(addRankingRequest));
    }

}
