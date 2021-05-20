package pl.miloszlewandowski.controllers;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class HomeController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/")
    public RedirectView amplifyReact() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://main.d2k041opttu9wi.amplifyapp.com/");
        return redirectView;
    }

    @GetMapping("/justhappened")
    public ModelAndView justhappened(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("justhappened");
        return mav;
    }

}
