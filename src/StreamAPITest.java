/*
1.
stream关注的是对数据的运算，与CPU打交道
集合关注的是数据的存储，与内存打交道
2.
Stream自己不会存储元素。
Stream不会改变源对象。相反，他们会返回一个持有结果的新Stream
Stream操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
3.
Stream执行流程
Stream的实例化
一系列的中间操作(过滤、映射、...)
终止操作
4.说明:
4.1一个中间操作链，对数据源的数据进行处理
4.2一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用

 */

import org.junit.Test;

public class StreamAPITest {

    //创建Stream方式一:通过集合创建
    @Test
    public void test1(){

    }

}
