package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import reactor.core.publisher.Mono;

public class EventRepositoryCustomImpl implements EventRepositoryCustom{

    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public Mono<Void> updateEvent(Event dbEvent, Event event) {

        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(Integer.toString(dbEvent.getId())));

        Event eventTemplate = mongoOperations.findOne(query, Event.class);

        eventTemplate.setDateFrom(dbEvent.getDateFrom());
        eventTemplate.setDateTo(dbEvent.getDateTo());
        eventTemplate.setDescription(dbEvent.getDescription());
        eventTemplate.setNameOfEvent(dbEvent.getNameOfEvent());
        eventTemplate.setStyleOfEvent(dbEvent.getStyleOfEvent());
        eventTemplate.setTypeOfEvent(dbEvent.getTypeOfEvent());

        mongoOperations.save(eventTemplate);

        Event eventReturn = mongoOperations.findOne(query, Event.class);

        //ispravi ovo! Ne treba null da vraca...
        return null;
    }
}
