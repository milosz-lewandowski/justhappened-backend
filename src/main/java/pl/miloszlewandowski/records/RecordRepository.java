package pl.miloszlewandowski.records;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordRepository extends JpaRepository<TheRecord, Integer> {
  List<TheRecord> findByPatient_Id(Integer id);
}