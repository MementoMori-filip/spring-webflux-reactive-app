package master.filip.app.springwebfluxreactiveapp.repository.styleofevent;

import master.filip.app.springwebfluxreactiveapp.domain.StyleOfEvent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StyleOfEventRepository extends ReactiveMongoRepository<StyleOfEvent, String> {
}
