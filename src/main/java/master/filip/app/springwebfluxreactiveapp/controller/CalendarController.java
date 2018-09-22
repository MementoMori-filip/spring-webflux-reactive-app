package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.*;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

@Controller
public class CalendarController {

    private final EventRepository eventRepository;
    private final PasswordEncoder passwordEncoder;
    private static final UUID ADMIN_IDENTIFIER = UUID.fromString("0d2c04f1-e25f-41b5-b4cd-3566a081200f");

    public CalendarController(EventRepository eventRepository, PasswordEncoder passwordEncoder) {
        super();
        this.eventRepository = eventRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/calendar")
    public String getCalendar(final Model model, @CurrentUser User user){

        /*final Flux<Event> allEvents = this.eventRepository.findAll();*/
        List<Event> allEvents = new ArrayList<>();

        User u1 = new User(ADMIN_IDENTIFIER, "filip", passwordEncoder.encode("filip94"), "admin");

        Group g2 = new Group(
                "Java Team"
        );

        Company c2 = new Company(
                "msg",
                "Omladinskih brigada 90g",
                Arrays.asList(
                        new Group("Java Team"),
                        new Group(".NET Team")
                )
        );

        Member m1 = new Member(
                "Filip Ivanovic",
                "filipivanovic@outlook.com",
                u1,
                g2,
                c2
        );

        Event e1 = new Event(
                "proba1",
                "probaproba",
                new Date(),
                new Date(),
                "location",
                new StyleOfEvent("public"),
                new TypeOfEvent("birthday"),
                Arrays.asList(m1)
        );
        allEvents.add(e1);

        model.addAttribute("allEvents", allEvents);

        return "calendar";
    }

    @PostMapping("/calendar/save")
    public Mono<Event> saveEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }
}
