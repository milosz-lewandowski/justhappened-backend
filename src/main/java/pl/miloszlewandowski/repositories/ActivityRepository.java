package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
