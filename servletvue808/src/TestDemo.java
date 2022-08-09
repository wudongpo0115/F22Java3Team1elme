import org.junit.Test;

public class TestDemo {
    private String name;
    private  Integer age;

//    使用alt+insert  快速自动生成 getting，setting和构造方法


    @Override
    public String toString() {
        return "TestDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Test
   public  void Test01() {
       TestDemo testdemo = new TestDemo();
       testdemo.setAge(18);
       testdemo.setName("红红");

        System.out.println(testdemo);
   }
}
