package pl.miloszlewandowski.records;

import java.time.LocalDateTime;

public class RecordFactory {
    static TheRecord getRecord() {
        TheRecord theRecord = new TheRecord();
        theRecord.setDateTime(LocalDateTime.now());
        return theRecord;
    }
}
