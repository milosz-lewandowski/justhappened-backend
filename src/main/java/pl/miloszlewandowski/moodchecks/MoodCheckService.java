package pl.miloszlewandowski.moodchecks;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.activities.ActivityRepository;
import pl.miloszlewandowski.records.RecordRepository;

import java.util.List;

@Service
public class MoodCheckService {

    private final MoodCheksRepository moodCheksRepository;
    private final ActivityRepository activityRepository;
    private final RecordRepository recordRepository;

    public MoodCheckService(MoodCheksRepository moodCheksRepository,
                            ActivityRepository activityRepository,
                            RecordRepository recordRepository) {
        this.moodCheksRepository = moodCheksRepository;
        this.activityRepository = activityRepository;
        this.recordRepository = recordRepository;
    }

    public List<MoodCheck> getAll() {
        return moodCheksRepository.findAll();
    }

    public MoodCheck getById(Integer id) {
        return moodCheksRepository.getById(id);
    }

    public void saveMoodCheck(MoodCheckSaveR moodCheckSaveR) {
        MoodCheck moodCheck = new MoodCheck();
        moodCheck.setMood(moodCheckSaveR.mood());
        moodCheck.setSelfEsteem(moodCheckSaveR.selfEsteem());
        moodCheck.setActivity(activityRepository.getById(moodCheckSaveR.activityId()));
//        moodCheck.setRecord(recordRepository.getById(moodCheckSaveR.recordId()));
        moodCheksRepository.save(moodCheck);
    }
}