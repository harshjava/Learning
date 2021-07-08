package com.example.Zafar.Controller;

import com.example.Zafar.Service.SessionStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.util.calendar.BaseCalendar;

@RestController
public class SessionStateController {

    @Autowired
    SessionStateService sessionStateService;
    @GetMapping("/date/{date}")
    public ResponseEntity getSessionSate(@PathVariable("date") BaseCalendar.Date date){
        ResponseEntity getallstate = sessionStateService.getallstate(date);
        return getallstate;
    }

    
}
