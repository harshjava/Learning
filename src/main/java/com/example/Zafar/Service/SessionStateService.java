package com.example.Zafar.Service;

import com.example.Zafar.model.SessionState;
import com.example.Zafar.repository.SessionStateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sun.util.calendar.BaseCalendar;

import java.util.List;

@Service
public class SessionStateService {
    @Autowired
    SessionStateRepo sessionStateRepo;

    public ResponseEntity getallstate(BaseCalendar.Date statedate){
        List<SessionState> allsessionstate = sessionStateRepo.findByDate(statedate);
        return new ResponseEntity(allsessionstate, HttpStatus.OK);
    }

    public ResponseEntity postallstate(SessionState sessionStatesave){
        SessionState save = sessionStateRepo.save(sessionStatesave);
        return new ResponseEntity(HttpStatus.OK);
    }
}
