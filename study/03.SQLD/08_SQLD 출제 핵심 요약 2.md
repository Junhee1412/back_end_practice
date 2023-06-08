### DDL(데이터 정의어)

- Data Definition Language
  - 데이터의 구조(테이블, 컬럼)를 변경하는데 사용된다.
  - alter를 필두로 사용되는 대부분의 명령어가 DDL이다.
- create, alter, modify, drop, truncate
- 테이블에 관련된 명령어이다. 테이블을 생성, 변경, 삭제
- modify는 컬럼의 특징을 변경시킨다.
- oracle에서 DDL은 autocommit기능을 실행한다.
- SQL server에서 DDL은 autocommit기능이 실행되지 않는다.
- truncate는 숫자함수의 버림과 같이 쓰이므로 헷갈리지 말 것
- drop, truncate, delete의 비교문제가 출제되기도 한다.
- drop, truncate는 DDL이므로 oracle에서 auto commit기능이 실행된다.
- 처리속도도 delete보다 DDL이 빠르다.
- truncate는 drop & create이다. 실제로 처리할 때 oracle에서도 이렇게 처리한다. 논리적으로는 존재하지만 물리적으로는 존재하지 않는 명령어이다.

---

### DML(데이터 조작어)

- Data Manipulation Language
  - 스키마 내에서 데이터를 조작하는 일련의 SQL 명령
- insert, select, update, delete, merge
- insert 특정 행을 추가한다.
  insert into table(col1, col2, col3) values(val1, val2, val3);
  insert into table values(val1, val2, val3);
- insert에 컬럼명을 명시할 경우 데이터를 집어넣을 때 명시되지 않은 컬럼은 null값이 들어가므로 not null컬럼에 null값을 넣으려고 하는지 확인해야한다.
- insert에 컬럼을 명시하지 않으면 모든 컬럼에 순차적으로 데이터를 입력해야한다. 갯수가 정확한지 확인하자.
- select 특정 행을 조회한다.
- update 특정 행을 변경한다.(삭제 후 다시 추가한다.)(delete & insert) truncate와 유사하다.
  update table set col='값' where col1='조건';
- delete 특정 행을 삭제한다.
  delete from table where col='조건';
- 조건을 넣지 않은 delete문은 모든 데이터를 삭제한다.
- merge 특정 데이터를 넣을 때 해당 테이블 키값을 기준으로 있으면 update, 없으면 insert를 한다. matched와 같은 명령어가 함께 사용됨.
- commit, rollback, savepoint와 주로 함께 출제된다.

---

### DCL(데이터 제어어)

- Data Control Language
- grant, revoke
- 데이터베이스에 접근하고 객체들을 사용하도록 권한을 주고 회수하는 명령어들을 말함.
- grant는 권한을 부여한다.
- revoke는 권한을 해제한다.
- role은 객체이다. 권한의 집합이라고 생각하면된다. 여러 권한을 모아놓고 있는 객체 domain과 성격이 유사한듯하다..

---

### TCL(트랜잭션 제어어)

- Transaction Control Language
- commit, rollback, savepoint
- commit으로 변경사항을 저장한다.
- rollback으로 commit되기 직후 지점까지 되돌린다.
- savepoint rollback시 저장점을 명시하면 해당 저장 지점까지 돌아간다.
- DCL에 포함시켜서 보는 경향이 있다.

---

### Transaction

#### 트랜잭션의 특성은 4가지가 있다.

- 원자성(Atomicity)
  - 트랜잭션에 정의된 연산들은 모두 성공적으로 실행되거나 전혀 실행되지 않은 상태로 남아있어야 한다.(All or Nothing)
- 일관성(Consistency)
  - 트랜잭션이 실행되기 전의 데이터베이스 내용이 잘못되어 있지 않다면 트랜잭션이 실행된 이후에도 데이터베이스의 내용에 잘못이 있으면 안된다.
- 고립성(Isolation)
  - 트랜잭션이 실행되는 도중에 다른 트랜잭션의 영향을 받아 잘못된 결과를 만들어서는 안된다.
- 지속성(Durability)
  - 트랜잭션이 성공적으로 수행되면 그 트랜잭션이 갱신한 데이터베이스의 내용은 영구적으로 저장된다.

---

#### 트랜잭션의 격리 수준은 4가지로 아래와 같다.

- SERIALIZABLE (직렬화 가능)
- REPEATABLE READ (반복 가능한 읽기)
- READ COMMITTED (커밋된 읽기)
- READ UNCOMITTED (커밋되지 않은 읽기)
- 아래로 갈 수록 격리수준이 낮아서 데이터부정합 문제가 생길 수 있으나 처리속도는 빨라진다. 즉, 데이터정합성과 성능은 반비례한다.

---

#### 트랜잭션 격리 수준에 따라 발생할 수 있는 문제점은 3가지로 다음과 같다.

- 더티 리드(Dirty Read)
  - 더티 리드는 특정 트랜잭션에 의해 데이터가 변경되었으나 아직 커밋되지 않은 상태에서 다른 트랜잭션이 해당 변경 사항을 조회할 수 있는 문제를 말한다.
  - A 트랜잭션이 데이터를 변경하고 commit하지 않았다.
  - B 트랜잭션이 데이터를 조회하였다.
  - rollback하였다.
  - B 트랜잭션이 무효가 된 값을 읽고 처리하므로 문제가 생긴다.
  - 즉, commit하지 않은 데이터를 읽으므로 생기는 문제이다.
- 반복 불가능한 조회(Non-Repeatable Read)
  - 같은 트랜잭션 내에서 같은 데이터를 여러번 조회했을 때 읽어온 데이터가 다른 경우를 의미한다.
  - 한 트랜잭션 내에서 같은 쿼리를 두 번 실행할 때 데이터의 값이 다르다.
  - 행의 변경에 관련이 있다.
- 팬텀 리드(Phantom Read)
  - 팬텀리드는 Non-Repeatable Read의 한 종류로 조회한 결과의 행이 새로 생기거나 없어지는 현상이다.
  - 한 트랜잭션 내에서 같은 쿼리를 두 번 실행할 때 없던 데이터가 생기거나 있던 데이터가 사라진다.
  - 행의 추가, 삭제와 관련이 있음.

---

### 제약조건

- PK : not null + unique
  - 테이블당 하나의 PK를 가질 수 있음(복합키 가능)
- not null : 해당 컬럼에 null이 올 수 없음.
- unique : 해당 컬럼에 중복값이 올 수 없으며 null은 올 수 있다.

---

### VIEW

- select문을 저장한다는 개념이다.
- 테이블과는 조금 다르다. 테이블은 데이터를 갖고있다면 view는 select만 가지고 있다.
- 독립적이고 편의성이 있으며 보안성(보여주고싶지 않은 데이터는 안보여줄 수 있으므로)이 있다.
- 문제점으로 기준 테이블이 사라지거나 변경되면 쓰지 못하는 경우가 많다.

---

### 그룹함수

- roll up, cube, groupingsets, grouping
- roll up
  - group by에 있는 컬럼들을 오른쪽에서 왼쪽순으로 그룹 생성
  - a, b로 묶이는 그룹의 값
  - a로 묶이는 그룹의 소계
- cube
  - a, b로 묶이는 그룹의 값
  - a로 묶이는 그룹의 소계
  - b로 묶이는 그룹의 소계(전체합계)
  - 가장 길다.
- grouping sets
  - 특정 항목으로 묶이는 그룹의 값이다.
  - a, b를 각각 group by 한 값에 union all을 실행하면 값이 같다.
- grouping
  - 각각 그룹화한 값에 특정 항목을 붙이고 값이 있으면 1, 없으면 0 을 반환한다.
  - case문과 같이 쓰여 1, 0에 각각 특정 텍스트로 변환하여 사용이 가능하다.

---

### TCL(트랜잭션 제어어)

- Transaction Control Language
- Commit : 모든 트랜잭션 변경사항을 저장한다.
- Rollback : Commit명령어가 실행된 직후 상태로 변경사항을 되돌린다.

---

### 윈도우 함수

- RANK 순위가 중복이면 1,1,3,4형식으로 나타난다.
- DENSE_RANK 1,1,2,3 형식으로 나타난다.
- PARTITION BY, ORDER BY
  - 나눠서 집계하고 싶을 때는 PARTITION BY를 사용한다. 결과는 PARTITION BY에 명시된 컬럼을 묶어서 따로 순위를 집계한다.
  - ORDER BY는 오름차순, 내림차순 으로 사용하며 PARTITION BY 뒤에 나올 수 있다.

---

### 계층형 함수

- PRIOR 자식데이터 = 부모데이터
- START WITH 최상위 행 지정
- CONNECT BY PRIOR 자식컬럼 = 부모컬럼 : 부모->자식 순방향 전개
- CONNECT BY PRIOR 부모컬럼 = 자식컬럼 : 자식->부모 역방향 전개

---

### PL/SQL

- 자주 출제되진 않음.
- EXCEPTION(생략가능)
- TRIGGER : COMMIT, ROLLBACK 불가능
  - BEFORE, AFTER별로 INSERT, UPDATE, DELETE가 있음.
  - INSERT AFTER면 해당 값이 들어가고 난 뒤 TRIGGER가 발동한다.
- FUNCTION은 반드시 반환 값이 있다.
- PROCEDURE는 반환 값이 없을 수도 있다.

---

**2과목 정리가 끝났다! 내일은 1과목 정리 후 마무리 지으려한다! 2일 남았으니 화이팅이다!!**
