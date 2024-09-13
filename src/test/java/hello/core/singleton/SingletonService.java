package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
        //해당 객체 인스턴스 필요시 해당 메서드를 통해서만 조회 가능
    }

    //private으로 생성자의 외부 호출 막음
    private SingletonService(){
    }

    public void login(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
