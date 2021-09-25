package pl.miloszlewandowski.therapists;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pl.miloszlewandowski.exceptions.RequestException;
import pl.miloszlewandowski.exceptions.RequestExceptionCode;

@Service
public class TherapistService {

  private final TherapistRepository therapistRepository;
  private final TherapistMapper therapistMapper;

  public TherapistService(
      TherapistRepository therapistRepository, TherapistMapper therapistMapper) {
    this.therapistRepository = therapistRepository;
    this.therapistMapper = therapistMapper;
  }

  //  -------------- find methods
  private Therapist getTherapist(Integer id) {
    return therapistRepository
        .findById(id)
        .orElseThrow(
            () ->
                new RequestException(
                    RequestExceptionCode.ID_NOT_FOUND,
                    HttpStatus.NO_CONTENT,
                    "Therapist with id: " + id + " not found"));
  }

  public TherapistDto findTherapistById(Integer id) {
    return therapistMapper.entityToDto(getTherapist(id));
  }

  public List<TherapistLabel> findByNameOrAll(Optional<String> pattern) {
    if (pattern.isPresent())
      return therapistMapper.entitiesToLabels(
          therapistRepository.findByNameContainsIgnoreCase(pattern.get()));
    else return therapistMapper.entitiesToLabels(therapistRepository.findAll());
  }

  // ------------- create methods

  public TherapistDto createTherapist(TherapistSaveDto therapistSaveDto) {
    return therapistMapper.entityToDto(
        therapistRepository.save(therapistMapper.entityFromSaveDto(therapistSaveDto)));
  }


}
