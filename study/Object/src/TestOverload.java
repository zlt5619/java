public class TestOverload {
    int id;
    String name;
    String password;

    TestOverload(){

    }
    TestOverload(int id){
        this.id=id;
    }
    TestOverload(int id,String s1){
        this.id=id;
        this.name=s1;
    }
}
