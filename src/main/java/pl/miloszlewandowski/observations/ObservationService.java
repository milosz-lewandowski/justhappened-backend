package pl.miloszlewandowski.observations;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservationService {

  private final ObservationRepository observationRepository;

  public ObservationService(ObservationRepository observationRepository) {
    this.observationRepository = observationRepository;
  }

  public List<Observation> getAll() {
    return observationRepository.findAll();
  }

  public Observation getById(Integer id) {
    return observationRepository.getById(id);
  }

  public void saveObservation(SaveObservationR saveObservationR) {
    Observation observation = new Observation();
    observation.setThought(saveObservationR.thought());
    observation.setSituation(saveObservationR.situation());
    observation.setEffect(saveObservationR.effect());
    observationRepository.save(observation);
  }

  public void deleteById(Integer id) {
    observationRepository.deleteById(id);
  }
}
