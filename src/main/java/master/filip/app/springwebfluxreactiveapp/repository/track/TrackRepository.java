package master.filip.app.springwebfluxreactiveapp.repository.track;

import master.filip.app.springwebfluxreactiveapp.domain.Track;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface TrackRepository extends ReactiveMongoRepository<Track, String> {
}
