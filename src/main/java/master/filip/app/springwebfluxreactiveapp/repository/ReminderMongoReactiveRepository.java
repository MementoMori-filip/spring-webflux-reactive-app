package master.filip.app.springwebfluxreactiveapp.repository;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReminderMongoReactiveRepository extends ReactiveCrudRepository<Reminder, Integer> {


}
