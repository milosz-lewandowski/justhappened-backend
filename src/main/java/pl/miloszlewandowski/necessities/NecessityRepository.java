package pl.miloszlewandowski.necessities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NecessityRepository extends JpaRepository<Necessity, Integer> {
  List<Necessity> findByPatient_Id(Integer id);

}
