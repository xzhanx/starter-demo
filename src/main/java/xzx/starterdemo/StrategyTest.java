package xzx.starterdemo;

/**
 * @author xzx
 * @date 2020/7/21
 */
public class StrategyTest {

    public static void main(String[] args) {
        new ImportContext(new StrategyOne()).executeStrategy("test");
    }
}
