package pl.miloszlewandowski.moodchecks;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/moodcheck",consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.ALL_VALUE})
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

}
