package com.ehi.stream.getStream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:30
 * @Description: TODO
 * java.util.Map 接口不是 Collection 的子接口，且其K-V数据结构不符合流元素的单一特征，所以获取对应的流
 *
 * 需要分key、value或entry等情况：
 */
public class Demo05GetStream {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();
    }
}