package pl.miloszlewandowski.factories;

import pl.miloszlewandowski.entities.Record;

import java.time.LocalDateTime;

public class RecordFactory {
    static Record getRecord() {
        Record record = new Record();
        record.setDateTime(LocalDateTime.now());
        return record;
    }
}
