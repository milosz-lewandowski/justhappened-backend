package pl.miloszlewandowski.records;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.patients.PatientRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecordService {

  private final RecordRepository recordRepository;
  private final PatientRepository patientRepository;

  public RecordService(RecordRepository recordRepository,
                       PatientRepository patientRepository) {
    this.recordRepository = recordRepository;
    this.patientRepository = patientRepository;
  }

  public List<TheRecord> findAllRecordByPatientId(Integer id) {
    return recordRepository.findByPatient_Id(id);
  }

  public TheRecord findById(Integer recordId) {
    return recordRepository.getById(recordId);
  }

  public void saveRecord(RecordSaveR recordSaveR) {
    TheRecord theRecord = new TheRecord();
    theRecord.setDateTime(LocalDateTime.now());
    theRecord.setPatient(patientRepository.getById(recordSaveR.patientId()));
    recordRepository.save(theRecord);
  }
}
