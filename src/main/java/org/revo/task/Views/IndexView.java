package org.revo.task.Views;


import org.revo.task.Config.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexView {
    @GetMapping("/")
    public ModelAndView index(@AuthenticationPrincipal  User user) {
        return new ModelAndView("index");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    @GetMapping("/403")
    public ModelAndView error403() {
        return new ModelAndView("403");
    }

    @GetMapping("/static/static1")
    public ModelAndView static1() {
        return new ModelAndView("static/static1");
    }

    @GetMapping("/static/static2")
    public ModelAndView static2() {
        return new ModelAndView("static/static2");
    }
}
