package pl.miloszlewandowski.records;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<TheRecord, Integer> {
//    Page<Record> getAllByPatient(Pageable pageable);
}