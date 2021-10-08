package pl.miloszlewandowski.patients;

public interface PatientDetailsTempProjection {

  Integer getId();

  String getName();

  TherapistInfo getTherapist();

  interface TherapistInfo {

    Integer getId();

    String getName();
  }
}
