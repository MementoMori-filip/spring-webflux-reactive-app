package master.filip.app.springwebfluxreactiveapp.rest.eventcustom;

import master.filip.app.springwebfluxreactiveapp.ambiguous.EventCustom;
import master.filip.app.springwebfluxreactiveapp.repository.eventCustom.EventCustomFullReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/event")
public class EventCustomControllerREST {

    @Autowired
    private EventCustomFullReporsitory eventCustomFullReporsitory;

    @GetMapping(value = "/findAllEvents")
    public Flux<EventCustom> findAllEvents(){
        return eventCustomFullReporsitory.findAll();
    }

    @GetMapping(value = "/findAllByCompany/{company}")
    public Flux<EventCustom> findAllEventsByCompany(@PathVariable String company){
       /* return eventCustomFullReporsitory*/
        return null;
    }

    //insert
    @PostMapping
    public void insertEvent(@RequestBody EventCustom eventCustom){
        eventCustomFullReporsitory.save(eventCustom).subscribe();
    }

    //update
    @PutMapping
    public void updateEvent(@RequestBody EventCustom eventCustom){
        eventCustomFullReporsitory.save(eventCustom).subscribe();
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable("id") String id){
        this.eventCustomFullReporsitory.deleteById(id).subscribe();
    }

}
