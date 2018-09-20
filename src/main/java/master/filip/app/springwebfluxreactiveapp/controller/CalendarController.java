package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    private final EventRepository eventRepository;

    public CalendarController(EventRepository eventRepository) {
        super();
        this.eventRepository = eventRepository;
    }

    @GetMapping("/calendar")
    public String getCalendar(final Model model, @CurrentUser User user){

        //dodati metodu za sve eventove koji ce se prikazivati u kalendaru
        return "calendar";
    }
}
