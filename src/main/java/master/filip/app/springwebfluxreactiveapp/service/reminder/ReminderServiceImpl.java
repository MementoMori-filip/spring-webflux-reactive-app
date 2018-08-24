package master.filip.app.springwebfluxreactiveapp.service.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import master.filip.app.springwebfluxreactiveapp.repository.reminder.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("ReminderServiceImpl")
public class ReminderServiceImpl implements ReminderService{

/*    @Autowired
    private ReminderRepository reminderRepository;*/

    @Override
    public Mono<Reminder> createReminder(Reminder reminder) {
        /*return reminderRepository.save(reminder);*/
        return null;
    }

    @Override
    public Mono<Void> deleteReminderById(String id) {
        /*return reminderRepository.deleteById(id);*/
        return null;
    }

    @Override
    public Flux<Reminder> findAll() {
        /*return reminderRepository.findAll();*/
        return null;
    }
}
