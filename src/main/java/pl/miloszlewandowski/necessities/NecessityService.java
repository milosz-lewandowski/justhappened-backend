package pl.miloszlewandowski.necessities;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NecessityService {

  private final NecessityRepository necessityRepository;

  public NecessityService(NecessityRepository necessityRepository) {
    this.necessityRepository = necessityRepository;
  }

  public List<Necessity> getAll(){
    return necessityRepository.findAll();
  }
}
