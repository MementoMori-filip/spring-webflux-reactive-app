package master.filip.app.springwebfluxreactiveapp.service.track;

import master.filip.app.springwebfluxreactiveapp.domain.Track;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TrackService {

    Flux<Track> listAll();

    Mono<Track> getById(Track track);

    Mono<Track> saveOrUpdate(Track track);
}
