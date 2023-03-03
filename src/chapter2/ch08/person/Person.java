package chapter2.ch08.person;

public class Person {

    public int stature;
    public int weight;
    public String gender;
    public String name;
    public int age;

    public Person(int stature,int weight,String gender,String name,int age){
        this.stature = stature;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.age =age;

    }

    public String showUserInfo(){
        return "키가 " + stature + "이고 몸무게가 "  + weight + "킬로인 " + gender +"이 있습니다. 이름은 " + name +"이고 나이는 "+ age +"세입니다." ;
    }
}
