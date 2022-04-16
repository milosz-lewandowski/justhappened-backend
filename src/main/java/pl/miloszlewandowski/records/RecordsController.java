package pl.miloszlewandowski.records;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/records")
public class RecordsController {

  private final RecordService recordService;

  public RecordsController(RecordService recordService) {
    this.recordService = recordService;
  }

  @GetMapping(value = "/{id}")
  public TheRecord getRecordById(@PathVariable(value = "id") Integer recordId) {
    return recordService.findById(recordId);
  }

  @GetMapping(path = "/patient/{id}")
  public List<TheRecord> getAllRecordByPatientId(
      @PathVariable(value = "id") Integer id) {
    return recordService.findAllRecordByPatientId(id);
  }

  @PostMapping(path = "/")
  public void saveRecord(@RequestBody RecordSaveR recordSaveR){
    recordService.saveRecord(recordSaveR);
  }

}
