package pl.miloszlewandowski.therapists;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TherapistRepository extends JpaRepository<Therapist, Integer> {

  @Query("select t from Therapist t where upper(t.name) like upper(concat('%', ?1, '%'))")
  List<Therapist> findByNameContainsIgnoreCase(String name);

  TherapistDetailsProjection getTherapistDetailsProjectionById(Integer id);
}
