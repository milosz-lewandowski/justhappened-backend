package pl.miloszlewandowski.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.miloszlewandowski.repositories.RecordRepository;

@RestController
@RequestMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.ALL_VALUE})
public class RecordsController {
    final RecordRepository recordRepository;

    public RecordsController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @GetMapping(value = "/records")
    ResponseEntity getAllRecords(){
        return ResponseEntity.ok(recordRepository.findAll());
    }

    @GetMapping(value = "/records{id}")
    ResponseEntity getRecordById(Long recordId){
        return ResponseEntity.ok(recordRepository.findById(recordId));
    }

}
