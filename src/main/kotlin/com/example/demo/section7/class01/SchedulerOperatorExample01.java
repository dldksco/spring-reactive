package com.example.demo.section7.class01;

import com.example.utils.Logger;
import reactor.core.publisher.Flux;

/**
 * Sequence의 Operator 체인에서 최초의 쓰레드는 subscribe()가
 * 호출되는 scope에 있는 쓰레드이다.
 * 전부 main thread에서 발생할것임
 */
public class SchedulerOperatorExample01 {
    public static void main(String[] args) {
        Flux.fromArray(new Integer[] {1, 3, 5, 7})
                .filter(data -> data > 3)
                .map(data -> data * 10)
                .subscribe(Logger::onNext);
    }
}
