package master.filip.app.springwebfluxreactiveapp.service.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReminderService {

    Flux<Reminder> listAll();

    Mono<Reminder> saveOrUpdate(Reminder reminder);

    Mono<Void> delete(Reminder reminder);
}
