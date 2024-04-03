package com.emirim.gotoschool.service;

import com.emirim.gotoschool.domain.Ranking;
import com.emirim.gotoschool.dto.AddRankingRequest;
import com.emirim.gotoschool.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RankingService {
    private final RankingRepository rankingRepository;

    @Autowired
    public RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    public List<Ranking> findAllRanking() {
        return rankingRepository.findAll();
    }

    public Ranking createRanking(AddRankingRequest addRankingRequest) {
        Ranking ranking = new Ranking();
        ranking.setName(addRankingRequest.getName());
        ranking.setScore(addRankingRequest.getScore());

        return  rankingRepository.save(ranking);
    }
}
