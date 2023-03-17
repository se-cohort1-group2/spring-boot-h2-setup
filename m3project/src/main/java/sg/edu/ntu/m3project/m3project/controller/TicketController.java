package sg.edu.ntu.m3project.m3project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.ntu.m3project.m3project.entity.TicketEntity;
import sg.edu.ntu.m3project.m3project.repository.TicketRepository;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    TicketRepository ticketRepo;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<TicketEntity>> findAll() {
        List<TicketEntity> tickets = (List<TicketEntity>) ticketRepo.findAll();
        return ResponseEntity.ok().body(tickets);
    }

}
