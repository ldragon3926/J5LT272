package com.example.lt272;


import org.slf4j.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTest {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTest.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void getTime(){
        log.info("Bây giờ là: {}", dateFormat.format(new Date()));
    }
}

