package pl.miloszlewandowski.patients;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

  Patient saveDtoToEntity(PatientSaveDTO patientSaveDTO);
}
