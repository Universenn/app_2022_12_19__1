package com.ll.app_2022_12_19;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @GetMapping("/writeMessage")
    @ResponseBody
    public String writeMessage() {
        return "메세지가 작성 되었습니다.";
    }

}
