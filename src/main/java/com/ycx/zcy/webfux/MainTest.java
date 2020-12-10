package com.ycx.zcy.webfux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author yucexuan
 * @version 1.0
 * @date 2020/11/30 22:03
 */
public class MainTest {
    public static void main(String[] args) {
        Flux.just(1,2,3,4).subscribe(System.out::print);
        System.out.println();
        Mono.just(1).subscribe(System.out::println);

    }
}
