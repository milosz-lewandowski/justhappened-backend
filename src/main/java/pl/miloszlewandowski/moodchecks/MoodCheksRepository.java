package pl.miloszlewandowski.moodchecks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodCheksRepository extends JpaRepository<MoodCheck, Integer> {
}