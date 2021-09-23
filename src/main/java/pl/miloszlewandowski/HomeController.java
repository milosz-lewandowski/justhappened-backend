package pl.miloszlewandowski;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomeController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

//    @RequestMapping("/")
//    public RedirectView amplifyReact() {
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl("https://main.d2k041opttu9wi.amplifyapp.com/");
//        return redirectView;
//    }

    @GetMapping("/justhappened")
    public ModelAndView justhappened(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("justhappened");
        return mav;
    }

}
