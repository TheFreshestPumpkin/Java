package t5;

public class Dog {
    private String name;

    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double huAge(){
        return (this.age*7);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", human age="+this.huAge()+
                '}';
    }
}
