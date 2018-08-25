package master.filip.app.springwebfluxreactiveapp.service.track;

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
    public Flux<Track> listAll() {
        return trackRepository.findAll();
    }

    @Override
    public Mono<Track> getById(Track track) {
        return trackRepository.findById(track.getId());
    }

    @Override
    public Mono<Track> saveOrUpdate(Track track) {
        return trackRepository.insert(track);
    }
}
