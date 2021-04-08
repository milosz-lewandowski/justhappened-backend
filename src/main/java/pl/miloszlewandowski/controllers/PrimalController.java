package pl.miloszlewandowski.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PrimalController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/justhappened")
    public ModelAndView justhappened(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("justhappened");
        return mav;
    }
}
