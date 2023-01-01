package ezen.hellospring;

import ezen.hellospring.aop.TimeTraceAop;
import ezen.hellospring.repository.*;
import ezen.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
//    private DataSource dataSource;   2  3

//    @Autowired
//    public SpringConfig(DataSource dataSource) {       3
//        this.dataSource = dataSource;
//    }

//    private EntityManager em;       4
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }                             4

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//
//      return new MemoryMemberRepository();
//      return new JdbcMemberRepository(dataSource);
//      return new JdbcTemplateMemberRepository(dataSource);     3
//        return new JpaMemberRepository(em);  4
//    }
//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }
}
