package kz.bitlab.task1.service;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LoggerService {

    public static void info(String s) {
        log.info(s);
    }

    public static void info(String s, Object ... objects) {
        log.info(s, objects);
    }

    public static void error(String s) {
        log.error(s);
    }

    public static void error(String s, Object ... objects) {
        log.error(s, objects);
    }

    public static void warn(String s) {
        log.warn(s);
    }

    public static void warn(String s, Object ... objects) {
        log.warn(s, objects);
    }
}
