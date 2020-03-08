package my.app.couch.web.controller;

import my.app.couch.model.code.CommonConst;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommonConst.URL_ROOT)
public class HomeController {


    @GetMapping("/test")
    public String getTest(){
        return "Success";
    }

}
