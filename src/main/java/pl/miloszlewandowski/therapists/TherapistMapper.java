package pl.miloszlewandowski.therapists;

import java.util.List;
import java.util.Optional;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TherapistMapper {

  Therapist entityFromDto(TherapistDto therapistDto);

  Therapist entityFromSaveDto(TherapistSaveDto therapistSaveDto);

  TherapistDto entityToDto(Therapist therapist);

  TherapistLabel entityToLabel(Therapist therapist);

  List<TherapistLabel> entitiesToLabels(List<Therapist> therapists);




}
