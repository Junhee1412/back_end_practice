## 비연결성

우선 연결을 유지하는 모델(TCP/IP)에 대해 알아보자 클라이언트가 요청을 하면 서버는 응답을 한다.
여러 클라이언트가 요청을 하면 서버는 계속해서 연결을 유지하기 때문에 서버 자원을 소모하게 된다.
이 모델의 단점은 **계속해서 서버 자원을 소모한다는 것이다!**

그럼 이제 연결을 유지하지 않는 모델은 반대로
클라이언트가 요청을 한다면! 서버는 응답 후 연결을 끊어버린다.
그러므로 계속해서 서버 자원을 소모하지 않기 때문에 서버 자원을 최소한만 사용하게 된다.

HTTP는 기본이 연결을 유지하지 않는 모델이다.
일반적으로 초 단위 이하의 빠른 속도로 응답하며
1시간 동안 수천명이 서비스를 사용해도 실제 서버에서 동시에 처리하는 요청은 수십개 이하로 적다.
우리가 특정 검색 사이트를 사용할 때 뭔가를 검색 후 그것을 보는 시간이 있는 것처럼
검색어를 입력하고 검색버튼을 누르는 요청! 그 요청에 서버는 응답 후 연결을 끊어버리는 것이다.
이로 인해 같은 사이트를 여러 클라이언트가 사용한다고 하더라도 실제 서버의 사용량을 줄일 수 있다.
다시 말해 서버 자원을 매우 효율적으로 사용할 수 있도록 설계된 HTTP의 특징인 것이다.

그러나 이 비연결성에도 단점이 있는데
#### TCP/IP 연결을 새로 맺어야 한다. - 이는 3way handshake 시간이 추가된다.
#### 웹 브라우저로 사이트를 요청하면 HTML 뿐 아니라 js, css 등 수 많은 자원들이 다운로드 된다.
매번 위의 수 많은 자원을 다운로드 하면 너무 많은 다운로드가 발생하므로 
지금은 HTTP 지속연결(Persistent Connections)로 문제를 해결했다.

HTTP 초기에는 클라이언트가 서버에 연결하고 HTML을 응답받고 종료한다.
그런데 js도 받고 이미지를 받을 때마다 3way handshake를 해야하므로 시간이 오래걸린다.

#### HTTP 지속연결(Persistent Connections)
현재는 SYN(서버 연결), SYN/ACK(클라이언트 연결/응답), ACK(서버 연결 종료)
위의 3way handshake에서 SYN/ACK 단계 때 모든 js, css등 수 많은 파일을 한번에 받는 방식으로 변경하였다.

이는 현재 HTTP/2, HTTP/3 버전에서는 더욱 최적화가 되어 이용되고 있다고 한다!

#### Stateless를 기억하자! 서버개발자들이 어려워하는 업무

동시 트래픽이 생겨야 하는 상황이 생긴다.
예를 들어 대학교 수강신청이라던지 명절 KTX예약, 선착순 이벤트 같은 경우에는
항상 Stateless한 방식으로 설계할 수 있도록 생각해야한다.
이벤트를 설계할 때는 정적 페이지를 만들고(HTML) 이벤트 참여 버튼을 누르게끔 유도하는 등의 방법이 있다!

## HTTP 메시지

HTTP 메시지는 이미지 음성 파일 등 대부분 형태의 데이터를 전송할 수 있다.
HTTP의 요청 메시지와 응답메시지는 구조가 다른데

#### HTTP 요청 메시지

><span style="color:red">GET /search?q=hello&hl=ko HTTP/1.1</span>
<span style="color:blue">Host: www.google.com</span>
<span style="color:green">(공백)</span>

#### HTTP 응답메시지

><span style="color:red">HTTP/1.1 200OK</span>
<span style="color:blue">Content-Type: text/html;charset=UTF-8
Content-Length: 3423</span>
<span style="color:green">(공백)</span>
```
<html>
  <body>...</body>
</html>
```

위와 같은 형태를 지닌다.
HTTP의 메시지 구조는
<span style="color:red">start-line 시작라인</span>, <span style="color:blue">header 헤더</span>, <span style="color:green">emptyline 공백라인(CRLF)</span>, message body(html)를 가지는데
요청 메시지에서도 본문에 필요한 message body를 가질 수 있다.

#### 다음엔 각각 메시지 구조당 어떤 내용을 가지고 있는지와 HTTP 기본에 대해 총정리를 해보겠다