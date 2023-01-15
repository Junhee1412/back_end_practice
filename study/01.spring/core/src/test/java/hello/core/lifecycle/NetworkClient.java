package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient(){
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url){
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connect : " + url);
    }

    public void call(String message){
        System.out.println("call: " + url + " message = " +message);
    }

    //서비스 종료 시 호출
    public void disconnect(){
        System.out.println("close " + url);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("NetworkClient.afterPropertiesSet");
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("NetworkClient.destroy");
//        disconnect();
//    }

    @PostConstruct
    public void init(){
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void close(){
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
//인터페이스 특징

//초기화 인터페이스의 단점 해당 코드가 스프링 전용 인터페이스에 의존한다.
//외부 라이브러리에는 적용할 수 없다.(지금은 사용하지 않는다.)

//설정 정보 사용 특징

//외부 라이브러리에 적용 가능
//스프링 빈이 스프링 코드에 의존하지 않는다.
//메서드 이름을 자유롭게 할 수 있다.

//애너테이션을 권장함.(@PostConstruct, @PreDestroy)

//스프링 종속이 아닌 자바표준임. 스프링아닌 다른컨테이너에서도 동작함
//유일 단점은 외부라이브러리 적용못해서 Bean을 사용해줘야함 외부라이브러리에는