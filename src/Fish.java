import java.util.Random;

public class Fish {
   public static Random random=new Random();
    public static   String  name ;
    public static  int  age ;
    public static Boolean  gender ;

    public static Fish add(){
        Fish fish=new Fish();
        fish.setAge(random.nextInt(10));
      fish.setGender(random.nextBoolean());
      return fish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
