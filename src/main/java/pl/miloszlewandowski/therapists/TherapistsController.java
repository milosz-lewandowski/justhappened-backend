package pl.miloszlewandowski.therapists;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "therapists")
public class TherapistsController {

  private final TherapistService therapistService;

  public TherapistsController(TherapistService therapistService) {
    this.therapistService = therapistService;
  }

  @GetMapping()
  public List<TherapistLabel> therapistsLabelList(@RequestParam(required = false) String pattern) {
    return therapistService.findByNameOrAll(Optional.ofNullable(pattern));
  }

  @GetMapping(value = "{id}")
  public ResponseEntity<TherapistDto> getTherapist(@PathVariable(value = "id") Integer id) {
    return ResponseEntity.ok(therapistService.findTherapistById(id));
  }

  @ApiOperation(value = "Create new therapist")
  @PostMapping()
  public TherapistDto saveTherapist(
      @ApiParam(value = "New therapist data") @RequestBody TherapistSaveDto therapistSaveDto) {
    return therapistService.createTherapist(therapistSaveDto);
  }

  //  @PutMapping("therapists/{id}")
  //  public void updateTherapist(@RequestBody Therapist therapist) {
  //            therapistRepository.getById(therapist.getId());
  //    therapistRepository.save(therapist);
  //  }
  //
  //  @DeleteMapping("/therapists/{id}")
  //  public void deleteTherapist(@PathVariable("id") Integer id) {
  //    therapistRepository.deleteById(id);
  //  }
  //
  //      @GetMapping("/therapists/{id}/patients")
  //      public ResponseEntity<Map<String, List<Patient>>> getTherapistPatients(
  //              @PathVariable("id") Integer id){
  //          Map<String, List<Patient>> map = new HashMap<>();
  //          map.put("patients", patientRepository.getPatientsByTherapistId(id));
  //          return ResponseEntity.ok(map);
  //      }

}
