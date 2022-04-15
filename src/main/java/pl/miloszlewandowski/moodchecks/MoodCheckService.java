package pl.miloszlewandowski.moodchecks;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodCheckService {

    private final MoodCheksRepository moodCheksRepository;

    public MoodCheckService(MoodCheksRepository moodCheksRepository) {
        this.moodCheksRepository = moodCheksRepository;
    }

    public List<MoodCheck> getAll() {
        return moodCheksRepository.findAll();
    }

    public MoodCheck getById(Integer id) {
        return moodCheksRepository.getById(id);
    }
}