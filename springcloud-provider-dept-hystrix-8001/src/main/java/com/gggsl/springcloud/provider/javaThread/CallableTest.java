package com.gggsl.springcloud.provider.javaThread;

import java.util.concurrent.*;

public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int res=0;
        for (int i = 0; i < 1000; i++) {
            res += i;
        }
        try {
            //Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
class RunnableTest implements Runnable{
    @Override
    public void run() {
        int res=0;
        for (int i = 0; i < 1000; i++) {
            res += i;
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 8, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
        CallableTest task = new CallableTest();
        Future<Integer> future = executor.submit(task);

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 222;
            }
        });
        executor.submit(futureTask);
        System.out.println(futureTask.get());
        System.out.println(future.get());

    }
}
