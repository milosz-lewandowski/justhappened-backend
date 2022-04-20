package pl.miloszlewandowski.observations;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/observation")
public class ObservationController {

  private final ObservationService observationService;

  public ObservationController(ObservationService observationService) {
    this.observationService = observationService;
  }

  @GetMapping(path = "/")
  List<Observation> getAll(){
    return observationService.getAll();
  }

  @GetMapping(path = "/{id}")
  Observation getById(@PathVariable(value = "id") Integer id){
    return observationService.getById(id);
  }

  @PostMapping
  void saveObservation(@RequestBody SaveObservationR saveObservationR){
    observationService.saveObservation(saveObservationR);
  }

  @DeleteMapping("/{id}")
  void deleteObservation(@PathVariable(value = "id") Integer id){
    observationService.deleteById(id);
  }

}
