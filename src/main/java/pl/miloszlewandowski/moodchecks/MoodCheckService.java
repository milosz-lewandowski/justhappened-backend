package pl.miloszlewandowski.moodchecks;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.activities.ActivityRepository;

import java.util.List;

@Service
public class MoodCheckService {

    private final MoodCheksRepository moodCheksRepository;
    private final ActivityRepository activityRepository;

    public MoodCheckService(MoodCheksRepository moodCheksRepository, ActivityRepository activityRepository) {
        this.moodCheksRepository = moodCheksRepository;
        this.activityRepository = activityRepository;
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
        moodCheksRepository.save(moodCheck);
    }
}