package pl.miloszlewandowski.records;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class RecordCreationDTO {

    private Integer RecordId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime dateTime = LocalDateTime.now();
}
