package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.ambiguous.EventCustom;
import master.filip.app.springwebfluxreactiveapp.domain.*;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.eventCustom.EventCustomFullReporsitory;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

@Controller
public class CalendarController {

    private final EventRepository eventRepository;
    private final EventCustomFullReporsitory eventCustomFullReporsitory;

    public CalendarController(EventRepository eventRepository, EventCustomFullReporsitory eventCustomFullReporsitory) {
        super();
        this.eventRepository = eventRepository;
        this.eventCustomFullReporsitory = eventCustomFullReporsitory;
    }

    @GetMapping("/calendar")
    public String getCalendar(final Model model, @CurrentUser User user){

        final Flux<EventCustom> allEvents = this.eventCustomFullReporsitory.findAll();

        model.addAttribute("allEvents", allEvents);

        return "calendar";
    }

    @PostMapping("/calendar/save")
    public Mono<Event> saveEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }
}
