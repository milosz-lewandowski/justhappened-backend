package pl.miloszlewandowski.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.miloszlewandowski.entities.Record;
import pl.miloszlewandowski.repositories.RecordRepository;

@RestController
@RequestMapping(
    consumes = {
      MediaType.APPLICATION_JSON_VALUE,
      MediaType.APPLICATION_FORM_URLENCODED_VALUE,
      MediaType.ALL_VALUE
    })
public class RecordsController {
  final RecordRepository recordRepository;

  public RecordsController(RecordRepository recordRepository) {
    this.recordRepository = recordRepository;
  }

  //    @GetMapping(value = "/records")
  //    Page<Record> getAllRecords(){
  //        return recordRepository.getAll();
  //    }

//  @GetMapping("/records")
//  Page<Record> getPaginatedRecords(
//      @RequestParam("pageNr") int pageNr, @RequestParam("size") int size) {
//    Pageable pageable = PageRequest.of(pageNr, size);
//    Page<Record> page = recordRepository.findAll(pageable);
//    return page;
//  }

  @GetMapping(value = "/records/{id}")
  ResponseEntity getRecordById(Long recordId) {
    return ResponseEntity.ok(recordRepository.findById(recordId));
  }
}
