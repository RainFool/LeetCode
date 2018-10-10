package com.rainfool.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private static String C_LPL = "在10月1日，英雄联盟2018全球总决赛即将开启，在经过一年的激烈竞争后，最终14个赛区的24支顶尖队伍，将在最高舞台上展开竞逐。究竟谁能够捧起召唤师奖杯，缔造自己的传奇呢，让我们一起来回顾这些队伍的历史，以及他们在最近一年的成长。";

    private static List<String> T_LIST = new ArrayList<>();

    static {
        T_LIST.add("英雄联盟");
        T_LIST.add("激烈竞争");
        T_LIST.add("传奇");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Moment().findTopic(C_LPL, T_LIST);
        long end = System.currentTimeMillis();
        System.out.println((end - start));

    }

    static class Moment {

        public void findTopic(String content, List<String> topicList) {
            int i = content.indexOf(T_LIST.get(0));
            int j = content.indexOf(T_LIST.get(1));
            int k = content.indexOf(T_LIST.get(2));
        }
    }

}
