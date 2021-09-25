package pl.miloszlewandowski.exceptions;

import org.springframework.http.HttpStatus;

public class RequestException extends RuntimeException {

  private final HttpStatus httpStatus;
  private final RequestExceptionCode requestExceptionCode;
  private final String message;
  private String secondaryMessage;

  public RequestException(RequestExceptionCode requestExceptionCode, HttpStatus httpStatus) {
    super(requestExceptionCode.toString());
    this.httpStatus = httpStatus;
    this.requestExceptionCode = requestExceptionCode;
    this.message = requestExceptionCode.toString();
  }

  public RequestException(RequestExceptionCode requestExceptionCode, HttpStatus httpStatus,String secondaryMessage){
    this(requestExceptionCode, httpStatus);
    this.secondaryMessage = secondaryMessage;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public RequestExceptionCode getRequestExceptionCode() {
    return requestExceptionCode;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public String getSecondaryMessage() {
    return secondaryMessage;
  }

  public void setSecondaryMessage(String secondaryMessage) {
    this.secondaryMessage = secondaryMessage;
  }
}
