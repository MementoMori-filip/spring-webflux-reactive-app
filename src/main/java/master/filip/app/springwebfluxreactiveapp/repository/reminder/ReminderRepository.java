package master.filip.app.springwebfluxreactiveapp.repository.reminder;

import master.filip.app.springwebfluxreactiveapp.domain.Reminder;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface ReminderRepository extends ReactiveMongoRepository<Reminder, String> {
}
