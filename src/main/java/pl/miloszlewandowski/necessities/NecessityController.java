package pl.miloszlewandowski.necessities;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/necessities")
public class NecessityController {

  private final NecessityService necessityService;

  public NecessityController(NecessityService necessityService) {
    this.necessityService = necessityService;
  }

  @GetMapping("/")
  List<Necessity> getAll() {
    return necessityService.getAll();
  }

  @GetMapping("/{id}")
  Necessity getById(@PathVariable(value = "id") Integer id){
    return necessityService.getById(id);
  }

  @GetMapping("/patient/{id}")
  List<Necessity> getAllByPatientId(@PathVariable(value = "id") Integer id) {
    return necessityService.getAllByPatientId(id);
  }

  @PostMapping
  void saveNecessity(@RequestBody SaveNecessityR saveNecessityR){
    necessityService.saveNecessity(saveNecessityR);
  }

  @DeleteMapping(path = "/{id}")
  void deleteNecessity(@PathVariable(value = "id") Integer id){
    necessityService.delete(id);
  }
}
