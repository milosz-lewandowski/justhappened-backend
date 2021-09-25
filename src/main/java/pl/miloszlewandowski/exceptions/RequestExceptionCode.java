package pl.miloszlewandowski.exceptions;

public enum RequestExceptionCode {
  ID_NOT_FOUND("Object with specific id not found"),
  NOT_FOUND("Object not found"),
  ALREADY_EXISTS("Object already exists"),
  NOT_CONTAINS("Object does not contain this resource"),
  INVALID_INPUT("Input data is invalid"),
  SYSTEM_EXCEPTION("System exception"),
  NO_OBJECTS("No objects of such type where found in repository");
//  AUTHORIZATION_ERROR("Cannot authorize"),
//  TOKEN_EXPIRED("Token has expired"),
//  WRONG_TOKEN("Not compatible token"),
//  NOT_COBRA_FILE("File is not cobra file");

  private final String textValue;


  RequestExceptionCode(String textValue) {
    this.textValue = textValue;
  }

  @Override
  public String toString() {
    return textValue;
  }
}
