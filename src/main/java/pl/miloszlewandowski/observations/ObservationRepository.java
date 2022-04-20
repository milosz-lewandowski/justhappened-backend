package pl.miloszlewandowski.observations;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservationRepository extends JpaRepository<Observation, Integer> {
}
