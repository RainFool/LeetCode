package generics.java;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public void test() {
        List<String> strs = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
//        strs = objects 编译出错

        /*
         * 因为addAll内部使用 ? extends E 类型，所以可以调用
         */
        objects.addAll(strs);

        List<? extends Object> variantObjList = new ArrayList<>();
//        variantObjList.add("") 错误因为 ? extends Object 不能写入


        objects.addAll(variantObjList); //符合addAll方法签名
    }
}
