package pl.miloszlewandowski.moodchecks;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/moodcheck")
public class MoodCheckController {

    private final MoodCheckService moodCheckService;

    public MoodCheckController(MoodCheckService moodCheckService) {
        this.moodCheckService = moodCheckService;
    }

    @GetMapping(path = "/")
    public List<MoodCheck> getAllMoodchecks(){
        return moodCheckService.getAll();
    }

    @GetMapping(path = "/{id}")
    public MoodCheck getMoodcheckById(Integer id){
        return moodCheckService.getById(id);
    }

    @PostMapping
    public void saveMoodcheck(@RequestBody MoodCheckSaveR moodCheckSaveR){
        moodCheckService.saveMoodCheck(moodCheckSaveR);
    }

}
