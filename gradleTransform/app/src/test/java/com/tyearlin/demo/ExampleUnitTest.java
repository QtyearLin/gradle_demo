package com.tyearlin.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        List<String> list = new ArrayList();

        list.add("a");
        list.add("b");

        Map<String, List<String>> singletonMap = Collections.singletonMap( "list",list);
        System.out.println(singletonMap);

        List<String> list2 = new ArrayList();

        list2.add("aa");
        list2.add("bb");

        Map<String, List<String>> singletonMap2 = Collections.singletonMap( "list",list2);
        System.out.println(singletonMap2);


        assertEquals(4, 2 + 2);
    }
}