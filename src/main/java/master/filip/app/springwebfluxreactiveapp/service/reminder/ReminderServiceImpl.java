package master.filip.app.springwebfluxreactiveapp.service.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import master.filip.app.springwebfluxreactiveapp.repository.reminder.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("ReminderServiceImpl")
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private ReminderRepository reminderRepository;

    @Override
    public Flux<Reminder> listAll() {
        return reminderRepository.findAll();
    }

    @Override
    public Mono<Reminder> saveOrUpdate(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    @Override
    public Mono<Void> delete(Reminder reminder) {
        return reminderRepository.delete(reminder);
    }


}
