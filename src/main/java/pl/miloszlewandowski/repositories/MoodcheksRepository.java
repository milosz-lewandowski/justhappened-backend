package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.Moodcheck;

public interface MoodcheksRepository extends JpaRepository<Moodcheck, Long> {
}
