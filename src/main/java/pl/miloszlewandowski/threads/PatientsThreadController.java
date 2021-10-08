package pl.miloszlewandowski.threads;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/threads", consumes = {
    MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.ALL_VALUE})
public class PatientsThreadController {

}
