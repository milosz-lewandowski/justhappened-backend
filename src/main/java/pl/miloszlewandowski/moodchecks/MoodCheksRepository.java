package pl.miloszlewandowski.moodchecks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoodCheksRepository extends JpaRepository<MoodCheck, Integer> {

}