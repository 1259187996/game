import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vader
 * @version 1.0.0
 * @package PACKAGE_NAME
 * @date ${Date}
 * description
 */
public class AppTest {

    @Test
    public void mapReduceTest()throws Exception{

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("3");
        list2.add("5");
        list2.add("6");
        list2.add("8");
        List<String> list3 = list1.stream().map(s -> {
            if(list2.contains(s)){
                return s;
            }
            return null;
        }).collect(Collectors.toList());
        list3 = list3.stream().distinct().collect(Collectors.toList());
        list3.remove(null);
        System.out.println(list3.size());

    }

}
