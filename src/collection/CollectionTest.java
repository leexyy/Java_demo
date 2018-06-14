package collection;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * Created by DELL on 2018/6/14.
 */
public class CollectionTest {
    public static void main(String[] args) {
        //集合转数组的正确方式
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        //指定好数组的类型和大小
        String[] stringArray = list.toArray(new String[list.size()]);

        //数组转集合
        int[] intArr = new int[]{1,2,3,4};
        List intList = Arrays.asList(intArr);
//        intList.add(1);

        for (String str : list) {
            System.out.println("前" + str);
        }

        list.add("3");
//        list.remove("1");
//        list.remove("2");

        //在foreach循环里面删除集合元素会报错
//        for (String str : list) {
//            if (Objects.equals("1", str)) {
//                list.remove(str);
//            }
//        }

        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if (null != s) {
                listIterator.remove();
            }
        }
        for (String str : list) {
            System.out.println("后" + str);
        }

        List<String> strList = new ArrayList<>();
        List<String> strList2 = new ArrayList();

        Map<Integer, Integer> intMap = new HashMap<>(16);
        intMap.put(1, 11);
        intMap.put(2, 22);
        intMap.put(3, 33);

        Set<Map.Entry<Integer, Integer>> entrySet = intMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }
}
