package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.MoodCheck;

public interface MoodCheksRepository extends JpaRepository<MoodCheck, Long> {
}