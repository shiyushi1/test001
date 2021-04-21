package yanfan.pojo;

public class Person {
    private Long id;
    private String name;
    private String sex;

    public Person(String name, String sex, Long age, String rank, String department) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.rank = rank;
        this.department = department;
    }

    public Person(Long id, String name, String sex, Long age, String rank, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.rank = rank;
        this.department = department;
    }

    public Person(Long id) {
        this.id = id;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }



    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id:" + id +
                ", 姓名:'" + name + '\'' +
                ", 年龄:" + age +
                ", 等级:'" + rank + '\'' +
                ", 所属部门:'" + department + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private Long age;
    private String rank;
    private String department;
}
