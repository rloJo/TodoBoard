package com.board.todoboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/todoboard")
    @ResponseBody
    public String index(){
        return "index";
    }






}
