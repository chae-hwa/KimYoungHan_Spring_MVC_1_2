package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // log 선언

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        // log 레벨 ( + 말고 ,로 사용한다. => +는 연산으로 처리됨.)
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log{}", name);

        return "ok";
    }
}
