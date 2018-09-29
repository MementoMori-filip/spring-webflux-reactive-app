package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.ambiguous.EventCustom;
import master.filip.app.springwebfluxreactiveapp.ambiguous.MemberCustom;
import master.filip.app.springwebfluxreactiveapp.domain.*;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.eventCustom.EventCustomFullReporsitory;
import master.filip.app.springwebfluxreactiveapp.repository.memberCustom.MemberCustomFullRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class CalendarController {

    private final String company = "Endava";
    private final EventRepository eventRepository;
    private final EventCustomFullReporsitory eventCustomFullReporsitory;
    private final MemberCustomFullRepository memberCustomFullRepository;

    public CalendarController(EventRepository eventRepository, EventCustomFullReporsitory eventCustomFullReporsitory, MemberCustomFullRepository memberCustomFullRepository) {
        super();
        this.eventRepository = eventRepository;
        this.eventCustomFullReporsitory = eventCustomFullReporsitory;
        this.memberCustomFullRepository = memberCustomFullRepository;
    }

    @GetMapping("/calendar")
    public String getCalendar(final Model model, @CurrentUser User user){

        final Flux<EventCustom> allEvents = this.eventCustomFullReporsitory.findAll();
        final Mono<MemberCustom> currentMember = this.memberCustomFullRepository.findByUserUsername(user.getUsername());

        //final Flux<EventCustom> allEventsByCompany = this.eventCustomFullReporsitory.findAllByCompanyName(company);

        model.addAttribute("allEvents", allEvents);
        model.addAttribute("currentMember", currentMember);
        //model.addAttribute("allEventsByCompany", allEventsByCompany);

        return "calendar";
    }
}
