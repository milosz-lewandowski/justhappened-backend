package pl.miloszlewandowski.records;

import pl.miloszlewandowski.records.Record;

import java.time.LocalDateTime;

public class RecordFactory {
    static Record getRecord() {
        Record record = new Record();
        record.setDateTime(LocalDateTime.now());
        return record;
    }
}
