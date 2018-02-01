package com.yp.elasticjobtest.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class TestJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("hello world");
    }
}
