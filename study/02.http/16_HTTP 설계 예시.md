## HTTP 설계 예시

사실 프로젝트 하나만 해보면 HTTP API를 설계하는 것이 어렵지 않을 것이다.
우선 김영한 강사님의 커리큘럼에 있었기 때문에.. 정리는 하고 가야겠다!

제시된 상황에 대해 먼저 설명하겠다.

- HTTP API - 컬렉션
  - POST 기반 등록
  - 예) 회원 관리 API 제공
- HTTP API - 스토어
  - PUT 기반 등록
  - 예) 정적 컨텐츠 관리, 원격 파일 관리
- HTML FORM 사용
  - 웹 페이지 회원 관리
  - GET, POST만 지원

### 회원 관리 시스템

API 설계 - POST 기반 등록

- 회원 목록 /members -> GET (단순 조회는 GET을 이용한다)
- 회원 등록 /members -> POST (등록은 POST를 이용해서 등록한다. 리소스 생성)
- 회원 조회 /members/{id} -> GET(단건 조회는 uri에 {id}를 입력하여 조회한다.)
- 회원 수정 /members/{id} -> PATCH, PUT, POST(uri에 {id}를 입력하고 어떤 메서드를 쓸지 정한다.)
  - PATCH : 부분 수정(권장)
  - PUT : 전체 수정이 필요한 경우(덮어버려야 하는 경우 근데 그런 경우는 거의 없음..)
  - POST : 부분 수정이 가능함. PATCH를 사용하지 못할 경우에는 해당 메서드를 사용
- 회원 삭제 /members/{id} -> DELETE(단건 삭제는 uri에 {id}를 입력하여 삭제)

우선 이렇게 쓰인다고 보면된다!

POST와 PUT의 차이는
클라이언트가 리소스를 보낼 때 리소스의 식별자를 누가 생성하는지인데
POST에서 회원 등록할 때 /members 라고만 서버에 uri를 보낸다.
그럼 서버에선 식별자를 만들어준다. Location: /members/100 이런 식으로 만들어주는 것이다.
클라이언트는 식별자를 모른채로 서버가 자동으로 만들어준다는 것이다.

이런 형식을 바로 컬렉션(Collection)이라고 한다.
서버가 리소스의 URI를 생성하고 관리하는 것.

### 파일 관리 시스템

API 설계 - PUT 기반 등록

- 파일 목록 /files -> GET
- 파일 조회 /files/{filename} -> GET
- 파일 등록 /files/{filename} -> PUT
- 파일 삭제 /files/{filename} -> DELETE
- 파일 대량 등록 /files -> POST

파일을 등록하는 행위는 PUT으로 하는 것이 적절하다.
기존 파일은 지우고 새로 등록하는 것이므로 완전히 덮어줘야하는 것이다.

이제 PUT에 대해 알아보자
PUT은 위의 POST와 다르게 filename을 알고 있어야 한다.
클라이언트는 uri에 filename이 넣어줘야 한다.
즉, 이건 클라이언트가 리소스를 알고 관리하는 것이다.

이런 형식은 바로 스토어(Store)라고 한다.
클라이언트가 리소스의 URI를 서버로 보내서 직접 클라이언트가 관리하는 것.
스토어는 /files

둘 중에 컬렉션을 더 많이 쓴다. POST방식으로 리소스를 등록하는 방식이 더 많다는 것을 알 수 있다.

### HTML FORM 사용

- HTML FORM은 GET, POST만 지원한다.
- AJAX 같은 기술을 사용해서 해결이 가능하다 -> 회원 API참고
- 여기서는 순수 HTML, HTML FORM만 사용해보겠다.
- GET, POST만 지원하므로 제약이 있다는 점을 인지하고 설계한다.

---

- 회원 목록 /members -> GET
- 회원 등록 폼 /members/new -> GET
- 회원 등록 /members/new, /members -> POST

---

- 회원 조회 /members/{id} -> GET
- 회원 수정 폼 /members/{id}/edit -> GET
- 회원 수정 /members/{id}/edit, /members/{id} -> POST
- 회원 삭제 /members/{id}/delete -> POST

---

우선 크게 보면 조회는 무조건 GET, 그 외는 전부 POST이다.
그리고 등록, 수정 폼으로 한 번 거치고 난 뒤 POST가 사용된다.

GET, POST만을 사용하기 때문에 **동사**로 된 컨트롤 URI를 사용한다.
위에서 예를 들면 /edit, /delete, /new와 같이 사용하게 된다.
실무에서는 매우 많이 사용하고 있다고 한다.
맨위에서 제시했던 상황에서도 딱 떨어지지 않는 경우가 많이 있다.
그럴 땐 HTML FORM이 아니더라도 종종 사용하곤 한다.

## 정리

**참고하면 좋은 URI 설계 개념**

- 문서
  - 단일개념(파일 하나, 객체 인스턴스, 데이터 베이스 row)
  - 예) /members/100, /files/star.jpg
- 컬렉션(Collection), Post방식의 설계
  - 서버가 관리하는 리소스 디렉터리
  - 서버가 리소스의 URI를 알고 관리
  - 예) /members
- 스토어(Store), Put방식의 설계
  - 클라이언트가 관리하는 자원 저장소
  - 클라이언트가 리소스의 URI를 알고 관리
  - 예) /files
- 컨트롤러, 컨트롤 URI
  - 문서, 컬렉션, 스토어로 해결하기 어려운 추가 프로세스를 실행한다.
  - 동사를 직접 사용하는 것을 권장한다.
  - 예) /members/{id}/delete
  - 복잡한 설계에는 대부분 컨트롤 URI를 사용하게 된다.
  - 실무에선 대부분 사용한다고 보면 된다.

**다음은 HTTP 상태 코드에 대해 알아보자!**
