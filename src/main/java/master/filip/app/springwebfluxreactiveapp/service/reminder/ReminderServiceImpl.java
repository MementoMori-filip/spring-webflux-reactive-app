package master.filip.app.springwebfluxreactiveapp.service.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import master.filip.app.springwebfluxreactiveapp.repository.reminder.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private ReminderRepository reminderRepository;

    @Override
    public Mono<Reminder> createReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    @Override
    public Mono<Void> deleteReminderById(int id) {
        return reminderRepository.deleteById(id);
    }
}
