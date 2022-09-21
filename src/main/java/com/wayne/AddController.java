package com.wayne;

import com.wayne.dto.AddDto;
import com.wayne.response.AddResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServlet;

@Controller
public class AddController {
    @PostMapping(path = "/add", consumes = {"application/xml","application/json"})
    public @ResponseBody
    AddResponse add(@RequestBody AddDto addDto) {
        int answer = addDto.getT1() + addDto.getT2();
        System.out.println(answer);
        System.out.println("I'm here");
        return new AddResponse(Integer.toString(answer));
    }
}
