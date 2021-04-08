package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.Therapist;

public interface TherapistRepository extends JpaRepository<Therapist, Long> {

}
