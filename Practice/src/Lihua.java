import person.Member;

public class Lihua {
    public static void main(String[] args) {
        Member lihua=new Member();
        lihua.setName("李华");
        lihua.setSex("男");
        lihua.setAge(18);
        lihua.setAddress("西安");
        lihua.setId(1372071234);

        System.out.println("姓名："+lihua.getName());
        System.out.println("性别："+lihua.getSex());
        System.out.println("年龄："+lihua.getAge());
        System.out.println("住址："+lihua.getAddress());
        System.out.println("电话："+lihua.getId());
        lihua.work();


    }
}
