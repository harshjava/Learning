package com.example.Zafar.repository;

import com.example.Zafar.model.SessionState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.util.calendar.BaseCalendar;

import java.util.List;

@Repository
public interface SessionStateRepo extends JpaRepository<com.example.Zafar.model.SessionState, Long> {

    public List<SessionState> findByDate(BaseCalendar.Date date);
}
