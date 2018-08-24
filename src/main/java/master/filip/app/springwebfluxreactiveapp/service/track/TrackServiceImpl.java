package master.filip.app.springwebfluxreactiveapp.service.track;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.domain.Group;
import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.Track;
import master.filip.app.springwebfluxreactiveapp.repository.track.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("TrackServiceImpl")
public class TrackServiceImpl implements TrackService{

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public Flux<Track> findAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Mono<Track> findTrackById(String id) {
        return trackRepository.findById(id);
    }

    @Override
    public Mono<Track> findWithBiggestId() {
        return null;
    }

    @Override
    public Mono<Track> createTrack(Member member, Event event) {
        return null;
    }
}
