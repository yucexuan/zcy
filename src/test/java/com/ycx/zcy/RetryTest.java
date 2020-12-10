package com.ycx.zcy;

import com.github.rholder.retry.*;
import com.google.common.base.Predicates;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/8 10:27
 * @description
 **/
public class RetryTest {
    public static void main(String[] args) throws ExecutionException, RetryException {
        Retryer<Long> retryer = RetryerBuilder.<Long>newBuilder()
                //重调条件
                .retryIfResult(Predicates.equalTo(1L))
                //重调策略
                .withWaitStrategy(WaitStrategies.fixedWait(1, TimeUnit.SECONDS))
                //尝试次数
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .build();

        retryer.call(() -> {
            System.out.println("返回值是0L，看看能调用几次");
            return 1L;
        });
    }
}
