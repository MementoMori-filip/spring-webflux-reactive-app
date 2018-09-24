package master.filip.app.springwebfluxreactiveapp.security;

import master.filip.app.springwebfluxreactiveapp.ambiguous.EventCustom;
import master.filip.app.springwebfluxreactiveapp.repository.eventCustom.EventCustomFullReporsitory;
import master.filip.app.springwebfluxreactiveapp.ambiguous.MemberCustom;
import master.filip.app.springwebfluxreactiveapp.repository.memberCustom.MemberCustomFullRepository;
import master.filip.app.springwebfluxreactiveapp.domain.*;
import master.filip.app.springwebfluxreactiveapp.repository.company.CompanyRepository;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.group.GroupRepository;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import master.filip.app.springwebfluxreactiveapp.repository.styleofevent.StyleOfEventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.typeofevent.TypeOfEventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final UUID USER_IDENTIFIER = UUID.fromString("c47641ee-e63c-4c13-8cd2-1c2490aee0b3");
    private static final UUID USER_IDENTIFIER1 = UUID.fromString("40c5ad0d-41f7-494b-8157-33fad16012aa");
    private static final UUID USER_IDENTIFIER2 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
    private static final UUID ADMIN_IDENTIFIER = UUID.fromString("0d2c04f1-e25f-41b5-b4cd-3566a081200f");

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;
    private final GroupRepository groupRepository;
    private final TypeOfEventRepository typeOfEventRepository;
    private final StyleOfEventRepository styleOfEventRepository;
    private final EventRepository eventRepository;
    private final MemberRepository memberRepository;
    private final CompanyRepository companyRepository;

    private final EventCustomFullReporsitory eventCustomRepository;
    private final MemberCustomFullRepository memberCustomRepository;

    @Autowired
    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder, GroupRepository groupRepository, TypeOfEventRepository typeOfEventRepository, StyleOfEventRepository styleOfEventRepository, EventRepository eventRepository, MemberRepository memberRepository, CompanyRepository companyRepository, EventCustomFullReporsitory eventCustomRepository, MemberCustomFullRepository memberCustomRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.groupRepository = groupRepository;
        this.typeOfEventRepository = typeOfEventRepository;
        this.styleOfEventRepository = styleOfEventRepository;
        this.eventRepository = eventRepository;
        this.memberRepository = memberRepository;
        this.companyRepository = companyRepository;

        this.eventCustomRepository = eventCustomRepository;
        this.memberCustomRepository = memberCustomRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        createUsers();
/*      createTypeOfEvents();
        createStyleOfEvents();
        createMain();*/
/*        createEventCustom();
        createMemberCustom();*/
    }

    private void createMemberCustom() {
        MemberCustom m1 = new MemberCustom(
                "Filip Ivanovic",
                "filipivanovic@outlook.com",
                "filip",
                "filip94",
                "admin",
                "Java Team",
                "Endava",
                "Milutina Milankovica 9dj"
        );

        MemberCustom m2 = new MemberCustom(
                "Nikola Belovanovic",
                "nikola94beki@gmail.com",
                "nikola",
                "n94",
                "user",
                "Java Team",
                "Endava",
                "Milutina Milankovica 9dj"
        );

        MemberCustom m3 = new MemberCustom(
                "Dusan Savic",
                "dulecar@fon.bg.ac.rs",
                "dule",
                "dulesavic",
                "user",
                "SILAB katedra",
                "FON",
                "Jove Ilica 154"
        );

        MemberCustom m4 = new MemberCustom(
                "Milos Milic",
                "mm@fon.bg.ac.com",
                "milos",
                "mm",
                "user",
                "SILAB katedra",
                "FON",
                "Jove Ilica 154"
        );

        List<MemberCustom> list = Arrays.asList(m1, m2, m3, m4);
        this.memberCustomRepository.saveAll(list).subscribe();
    }

    private void createEventCustom() {
        Date e1dateFrom = parseDate("2018-09-28 15:00:00");
        Date e1dateTo = parseDate("2018-09-28 17:30:00");

        EventCustom e1 = new EventCustom(
                "Odbrana master rada",
                "Spring WebFlux app",
                e1dateFrom,
                e1dateTo,
                "Jove Ilica 154",
                "private",
                "faculty event",
                "filip",
                "Endava"
        );

        Date e2dateFrom = parseDate("2018-09-24 10:00:00");
        Date e2dateTo = parseDate("2018-09-24 18:45:00");

        EventCustom e2 = new EventCustom(
                "JMS i Spring 5",
                "Razvoj poslovnih resenja",
                e2dateFrom,
                e2dateTo,
                "Milutina Milankovica 9dj",
                "company's",
                "conference",
                "nikola",
                "Endava"
        );

        Date e3dateFrom = parseDate("2018-09-24 15:00:00");
        Date e3dateTo = parseDate("2018-09-25 10:30:00");

        EventCustom e3 = new EventCustom(
                "Spring 5 in Nutshell",
                "Everything you need to know about Spring 5",
                e3dateFrom,
                e3dateTo,
                "Milutina Milankovica 9dj",
                "public",
                "training",
                "nikola",
                "Endava"
        );

        Date e4dateFrom = parseDate("2018-09-25 10:30:00");
        Date e4dateTo = parseDate("2018-09-27 12:30:00");

        EventCustom e4 = new EventCustom(
                "Testiranje i kvalitet softvera",
                "Kreiranje sopstvenih alata za odredjivanje kvaliteta softvera",
                e4dateFrom,
                e4dateTo,
                "Milutina Milankovica 9dj",
                "public",
                "conference",
                "nikola",
                "Endava"
        );

        Date e5dateFrom = parseDate("2018-09-26 10:00:00");
        Date e5dateTo = parseDate("2018-09-28 15:30:00");

        EventCustom e5 = new EventCustom(
                "Development Sync",
                "Improving the design of existing code",
                e5dateFrom,
                e5dateTo,
                "Milutina Milankovica 9dj",
                "company's",
                "meeting",
                "filip",
                "Endava"
        );

        List<EventCustom> list = Arrays.asList(e1, e2, e3, e4, e5);
        this.eventCustomRepository.saveAll(list).subscribe();
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    private void createUsers() {
        final Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Creating users with USER and ADMIN roles");

        userRepository.save(
                new User(ADMIN_IDENTIFIER, "filip", passwordEncoder.encode("filip94"), "admin")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER1, "dule", passwordEncoder.encode("dulesavic"), "user")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER2, "milos", passwordEncoder.encode("mm"), "user")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER, "nikola", passwordEncoder.encode("n94"), "user")
        ).subscribe();

        Flux<User> users = userRepository.findAll();
        users.delaySubscription(Duration.ofMillis(100)).subscribe(
                u -> logger.info("User '{}' created with id '{}'", u.getId())
        );
    }

    private void createTypeOfEvents() {
        TypeOfEvent toe1 = new TypeOfEvent(
                "meeting"
        );

        TypeOfEvent toe2 = new TypeOfEvent(
                "conference"
        );

        TypeOfEvent toe3 = new TypeOfEvent(
                "seminars"
        );

        TypeOfEvent toe4 = new TypeOfEvent(
                "team building"
        );

        TypeOfEvent toe5 = new TypeOfEvent(
                "business dinner"
        );

        TypeOfEvent toe6 = new TypeOfEvent(
                "networking"
        );

        TypeOfEvent toe7 = new TypeOfEvent(
                "award ceremonies"
        );

        TypeOfEvent toe8 = new TypeOfEvent(
                "board meetings"
        );

        TypeOfEvent toe9 = new TypeOfEvent(
                "familiy event"
        );

        TypeOfEvent toe10 = new TypeOfEvent(
                "birthday"
        );

        TypeOfEvent toe11 = new TypeOfEvent(
                "wedding"
        );

        TypeOfEvent toe12 = new TypeOfEvent(
                "travel"
        );

        TypeOfEvent toe13 = new TypeOfEvent(
                "appreciation event"
        );

        TypeOfEvent toe14 = new TypeOfEvent(
                "holiday"
        );
        TypeOfEvent toe15 = new TypeOfEvent(
                "festival"
        );

        TypeOfEvent toe16 = new TypeOfEvent(
                "sport event"
        );

        TypeOfEvent toe17 = new TypeOfEvent(
                "webinar"
        );

        TypeOfEvent toe18 = new TypeOfEvent(
                "training"
        );

        List<TypeOfEvent> list = Arrays.asList(toe1, toe2, toe3, toe4, toe5, toe6, toe7, toe8, toe9, toe10,
                toe11, toe12, toe13, toe14, toe15, toe16, toe17, toe18);
        this.typeOfEventRepository.saveAll(list).subscribe();

    }

    private void createStyleOfEvents() {
        StyleOfEvent soe1 = new StyleOfEvent(
                "public"
        );

        StyleOfEvent soe2 = new StyleOfEvent(
                "private"
        );

        StyleOfEvent soe3 = new StyleOfEvent(
                "company's"
        );

        List<StyleOfEvent> list = Arrays.asList(soe1, soe2, soe3);
        this.styleOfEventRepository.saveAll(list).subscribe();
    }

    private void createMain() {

        User u1 = new User(ADMIN_IDENTIFIER, "filip", passwordEncoder.encode("filip94"), "admin");
        User u2 = new User(USER_IDENTIFIER1, "dule", passwordEncoder.encode("dulesavic"), "user");
        User u3 = new User(USER_IDENTIFIER2, "milos", passwordEncoder.encode("mm"), "user");
        User u4 = new User(USER_IDENTIFIER, "nikola", passwordEncoder.encode("n94"), "user");

        //group
        Group g1 = new Group(
                "SILAB katedra"
        );

        Group g2 = new Group(
                "Java Team"
        );

        Group g3 = new Group(
                ".NET Team"
        );

        groupRepository.save(g1).subscribe();
        groupRepository.save(g2).subscribe();
        groupRepository.save(g3).subscribe();

        //company
        Company c1 = new Company(
                "FON",
                "Jove Ilica 154",
                Arrays.asList(
                        new Group("SILAB katedra")
                )
        );

        Company c2 = new Company(
                "msg",
                "Omladinskih brigada 90g",
                Arrays.asList(
                        new Group("Java Team"),
                        new Group(".NET Team")
                )
        );

        companyRepository.save(c1).subscribe();
        companyRepository.save(c2).subscribe();

        //member
        Member m1 = new Member(
                "Filip Ivanovic",
                "filipivanovic@outlook.com",
                u1,
                g2,
                c2
        );

        Member m2 = new Member(
                "Nikola Belovanovic",
                "nikola94beki@gmail.com",
                u4,
                g3,
                c2
        );

        Member m3 = new Member(
                "Dusan Savic",
                "dulecar@fon.bg.ac.rs",
                u2,
                g1,
                c1
        );

        Member m4 = new Member(
                "Milos Milic",
                "mm@fon.bg.ac.com",
                u3,
                g1,
                c1
        );

        memberRepository.save(m1).subscribe();
        memberRepository.save(m2).subscribe();
        memberRepository.save(m3).subscribe();
        memberRepository.save(m4).subscribe();

        //events
        Event e1 = new Event(
                "proba1",
                "probaproba",
                new Date(),
                new Date(),
                "location",
                new StyleOfEvent("public"),
                new TypeOfEvent("birthday"),
                Arrays.asList(m1)
        );

        eventRepository.save(e1).subscribe();
    }
}
