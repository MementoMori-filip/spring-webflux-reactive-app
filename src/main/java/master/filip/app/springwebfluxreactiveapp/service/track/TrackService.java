package master.filip.app.springwebfluxreactiveapp.service.track;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.Track;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TrackService {

    Flux<Track> findAllTracks();

    Mono<Track> findTrackById(String id);

    Mono<Track> findWithBiggestId();

    Mono<Track> createTrack(Member member, Event event);
}
