package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.Record;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Long> {
}