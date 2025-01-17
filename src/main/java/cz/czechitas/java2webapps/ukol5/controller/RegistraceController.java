package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {

    @GetMapping("/")
    public ModelAndView formular() {
        ModelAndView modelAndView = new ModelAndView("/formular");
        modelAndView.addObject("form", new RegistraceForm());
        return modelAndView;
    }

    @PostMapping("/formular")
    public Object form(@Valid @ModelAttribute("form") RegistraceForm form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/formular";
        }
        Period period = LocalDate.parse(form.getDatumNarozeni()).until(LocalDate.now());
        int vek = period.getYears();

        if (vek < 9 || vek > 15) {
            bindingResult.addError(new FieldError("form", "datumNarozeni", "Vek ditete musi byt v rozmezi 9 - 15 let"));
            return "/formular";
        }

        return new ModelAndView("/vyplnenyFormular").addObject("form", form);

    }

}
