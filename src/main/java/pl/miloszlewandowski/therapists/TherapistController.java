package pl.miloszlewandowski.therapists;

import io.swagger.annotations.ApiParam;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableSpringDataWebSupport
@RequestMapping(
    path = "/therapists")
public class TherapistController {

  private final TherapistService therapistService;

  public TherapistController(TherapistService therapistService) {
    this.therapistService = therapistService;
  }

  //  @GetMapping(path = "/")
  //  public List<TherapistLabel> therapistsLabelList(@RequestParam(required = false) String
  // pattern) {
  //    return therapistService.findByNameOrAll(Optional.ofNullable(pattern));
  //  }

  //  @GetMapping(path = "/{id}")
  //  public TherapistDto getTherapist(@PathVariable(value = "id") Integer id) {
  //    return therapistService.findTherapistById(id);
  //  }

  @GetMapping(path = "/{id}")
  public TherapistDetailsProjection getTherapistProjection(@PathVariable(value = "id") Integer id) {
    return therapistService.getProjectionById(id);
  }

  //  @ApiOperation(value = "Create new therapist")
  @PostMapping(path = "/")
  public void saveTherapist(
      @ApiParam(value = "New therapist data") @RequestBody TherapistSaveDto therapistSaveDto) {
    therapistService.createTherapist(therapistSaveDto);
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
