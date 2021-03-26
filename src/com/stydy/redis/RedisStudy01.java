package com.stydy.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * redis学习
 * @author fengfasong
 * @date 2020/9/23
 */
public class RedisStudy01 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());
        jedis.lpush("key","value1");
        jedis.lpush("key","value2");
        jedis.lpush("key","value3");

        List<String> key = jedis.lrange("key", 0, 2);
        for(String a : key){
            System.out.println(a);
        }
    }
}
