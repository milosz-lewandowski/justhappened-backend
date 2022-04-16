package pl.miloszlewandowski.activities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
  List<Activity> findByPatient_Id(Integer id);

}
