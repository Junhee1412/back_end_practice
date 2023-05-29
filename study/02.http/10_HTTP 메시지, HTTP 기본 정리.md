## HTTP 메시지 구조

http 메시지는 크게 4개의 구성요소가 있다.

- start-line(시작 라인)
- header 헤더
- empty line 공백 라인(CRLF)
- message body

http는 RFC 공식 스펙에
> HTTP-message = start-line
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;*(header-field CRLF)
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;CRLF
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[ message-body ]

라고 되어있다. 이 구성에서 각각이 무엇을 구성하는지 알아보려한다!


#### HTTP 요청 메시지(예시)

><span style="color:red">GET /search?q=hello&hl=ko HTTP/1.1</span>
<span style="color:blue">Host: www.google.com</span>
<span style="color:green">(공백)</span>

#### HTTP 응답메시지(예시)

><span style="color:red">HTTP/1.1 200OK</span>
<span style="color:blue">Content-Type: text/html;charset=UTF-8
Content-Length: 3423</span>
<span style="color:green">(공백)</span>
```
<html>
  <body>...</body>
</html>
```



## start-line(시작 라인)

시작라인은 붉은 글씨로 표시된 영역이다.
#### 요청메시지(request)

start-line = **request-line** / status-line
request-line = method SP(공백, 띄어쓰기) request-tartget SP HTTP-version CRLF(엔터)

의 형식을 띈다.

즉 이 안의 구성요소로는
- HTTP 메서드(GET: 조회)
- 요청 대상(/search?q=hello&hl=ko)
- HTTP version 이 들어간다.

순서대로 위에서는 GET이 먼저 들어갔고 띄어쓴 뒤 요청 대상이 들어갔다. 그 다음에는 HTTP 1.1버전임을 명시하였고 엔터로 공백을 집어넣어 HTTP 요청메시지의 시작 라인을 마무리지었다고 볼 수 있다.

메서드는 (GET, POST, PUT, DELETE)가 있으며 이는 서버가 수행해야 할 동작을 지정해준다.
이후에 위의 메서드에 대해 자세히 알아보겠다.

요청대상은 절대경로로 시작한다. / 로 시작하여 뒤에 경로를 지정해준다.

메시지의 마지막에는 버전으로 마무리 지은 뒤 공백(줄바꿈)을 꼭 넣어준다.

#### 응답메시지(response)

start-line = request-line / **status-line**
status-line = HTTP-version SP status-code SP reason-phrase CRLF

- HTTP 버전
- HTTP 상태코드(200 성공, 400 클라이언트 요청 오류, 500 서버 내부 오류)
- 이유 문구

로 구성된다.

HTTP/1.1 200 OK로 되어있는데 HTTP 버전과 200번 성공했기 때문에 이를 나타내는 이유문구 OK가 생성된다.
201 create 404 Not Found 등 다양하게 쓰이고 있으며 상태코드에 대한 내용은 이후에 자세히 알아보겠다.

## HTTP 헤더

헤더 영역은 다음과 같이 정의 된다.
header-field = field-name ":" OWS field-value OWS(OWS : 띄어쓰기 허용을 뜻한다.)

field-name은 대소문자 구분이 없으며 위에선 Host를 뜻한다. 뒤에 www.google.com 은 대소문자 구분을 한다.

이것의 용도는 HTTP 전송에 필요한 모든 부가 정보를 다 넣어둔다.
message-body가 어떤 것으로 되어있는지, message-body의 크기, 인증, 압축, 요청 클라이언트 정보 등이 다 들어 있다. message body에 명시된 내용 제외 모든 정보가 들어있다고 할 수 있다!

## HTTP 메시지 바디

이 곳에는 실제 전송할 데이터가 들어있다. byte로 표현되는 모든 데이터가 전송 가능하기 때문에 실제 전송되는 영역이라고 볼 수 있다.

**HTTP는 단순하며 확장이 가능하고** 스펙도 읽어볼만 한 수준이라고 한다.

간단하게 총 정리를 하자면

모든 것이 지금은 HTTP로 구성되어 있으며 
HTTP의 특징은
- 클라이언트 서버 구조
- Stateless 지향
- 비 연결성
- HTTP 메시지가 있다.

이로 인해 단순하면서 확장 가능하고 조금 더 효율적인 서버를 사용할 수 있도록 구성된 프로토콜인 것이다.

**다음은 HTTP API를 만들어보며 HTTP 메서드에 대해 하나하나 알아보려 한다!**