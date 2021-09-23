package pl.miloszlewandowski.moodchecks;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.ALL_VALUE})
public class MoodCheckController {

    final MoodCheksRepository moodcheksRepository;

    public MoodCheckController(MoodCheksRepository moodcheksRepository) {
        this.moodcheksRepository = moodcheksRepository;
    }

    @GetMapping(path = "/moodchecks")
    ResponseEntity getAllMoodchecks(){
        return ResponseEntity.ok(moodcheksRepository.findAll());
    }

    @GetMapping(path = "/moodchecks/{id}")
    ResponseEntity getMoodcheckById(Long moodcheckId){
        return ResponseEntity.ok(moodcheksRepository.findById(moodcheckId));
    }
}
