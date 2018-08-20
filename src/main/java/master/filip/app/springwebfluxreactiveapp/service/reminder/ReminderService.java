package master.filip.app.springwebfluxreactiveapp.service.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import reactor.core.publisher.Mono;

public interface ReminderService {

    Mono<Reminder> createReminder(Reminder reminder);

    Mono<Void> deleteReminderById(int id);
}
