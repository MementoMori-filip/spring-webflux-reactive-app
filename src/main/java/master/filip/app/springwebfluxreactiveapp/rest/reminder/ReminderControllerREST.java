package master.filip.app.springwebfluxreactiveapp.rest.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import master.filip.app.springwebfluxreactiveapp.service.reminder.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reminder")
public class ReminderControllerREST {

    @Autowired
    private ReminderService reminderService;

    @GetMapping("/findAll")
    public Flux<Reminder> findAllReminder(){
        return reminderService.listAll();
    }

    @PutMapping
    public Mono<Reminder> insertReminder(@RequestBody Reminder reminder){
        return reminderService.saveOrUpdate(reminder);
    }
}
