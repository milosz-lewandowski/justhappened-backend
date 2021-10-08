package pl.miloszlewandowski.necessities;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/necessities")
public class NecessityController {

  private final NecessityService necessityService;

  public NecessityController(NecessityService necessityService) {
    this.necessityService = necessityService;
  }

  @GetMapping("/")
  List<Necessity> getAll(){
    return necessityService.getAll();
  }
}
