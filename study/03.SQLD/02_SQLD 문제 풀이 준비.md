#### 1. 다음 중 데이터 제어어(DCL)에 해당하는 명령어는?

1) INSERT
2) RENAME
3) COMMIT
4) REVOKE

---
### <해설>

SQL 문장의 종류는
- DML(데이터 조작어) : Manipulation
- DDL(데이터 정의어) : Definition
- DCL(데이터 제어어) : Control
- TCL(트랜잭션 제어어) : Transaction Control

### DML
- 데이터를 조회하거나 검색하기 위한 명령어
- SELECT, INSERT, UPDATE, DELETE

### DDL
- 테이블과 같은 데이터 구조를 정의하는데 사용되는 명령어
- CREATE, ALTER, DROP, RENAME

### DCL
- 데이터베이스에 접근하는 권한을 설정하는데 사용되는 명령어
- GRANT, REVOKE

### TCL
- 논리적인 작업의 단위를 묶어서 DML에 의해 조작된 결과를 작업단위(트랜잭션) 별로 제어하는 명령어
- COMMIT, ROLLBACK

즉 DCL에 해당하는 것은 REVOKE 4번이 정답이다.

---

#### 2. 다음 중 아래 내용의 범주에 해당하는 SQL 명령어로 옳지 않은 것은?

1) CREATE
2) GRANT
3) ALTER
4) DROP

> 테이블의 구조를 생성, 변경, 삭제하는 등 데이터 구조를 정의하는데 사용되는 명령어이다.

---

### <해설>

설명은 DDL 데이터베이스를 정의하는 명령어를 뜻한다.
데이터 정의어는 테이블을 조작하는 명령어로
CREATE, ALTER, DROP, RENAME이 있다.

즉, GRANT는 테이블에 접근할 수 있는 권한을 설정하는 DCL(데이터 제어어)이므로 3번이 정답이다.

---

#### 3. 아래 내용에 해당하는 SQL 명령어의 종류를 작성하시오

> 논리적인 작업의 단위를 묶어 DML에 의해 조작된 결과를 작업 단위(Transaction)별로 제어하는 명령어인 Commit, Rollback, Savepoint 등이 여기에 해당하며, 일부에서는 DCL(Data Control Language)로 분류하기도 한다.

---

### <해설>

설명은 작업단위를 제어하는 TCL을 뜻한다.
정답은 TCL이다.

---

#### 4. 데이터베이스를 정의하고 접근하기 위해서는 데이터베이스 관리 시스템과의 통신수단이 필요한데 이를 데이터 언어(Data Language) 라고 하며, 그 가능과 사용 목적에 따라 데이터 정의어(DDL), 데이터 조작어(DML) 데이터 제어어(DCL)로 구분된다. 다음 중 데이터 언어와 SQL 명령어에 대한 설명으로 가장 부적절한 것은?

1) 비절차적 데이터 조작어(DML)는 사용자가 무슨 데이터를 원하며, 어떻게 그것을 접근해야 되는지를 명세하는 언어이다.
2) DML은 데이터베이스 사용자가 응용 프로그램이나 질의어를 통하여 기보 저장된 데이터베이스를 실질적으로 접근하는데 사용되며 SELECT, INSERT, DELETE, UPDATE 등이 있다.
3) DDL은 스키마, 도메인, 테이블, 뷰, 인덱스를 정의하거나 변경 또는 제거할 때 사용되며 CREATE, ALTER, DROP, RENAME 등이 있다.
4) 호스트 프로그램 속에 삽입되어 사용되는 DML 명령어들을 데이터 부속어(Data Sub Language) 라고 한다

---

### <해설>

1) 비절차적 데이터 조작어는 사용자가 무슨 데이터를 원하는지만을 명세한다.
절차적 조작어에서는 어떻게 데이터에 접근해야하는지 명세하는데
절차적 데이터 조작어로는 JAVA, PL/SQL(오라클), T-SQL(SQL Server 등이 있다.)

즉, 1번이 정답이다.

2) DML은 데이터를 접근하기 위한 언어이다.
3) DDL은 테이블을 조작하기 위한 언어이다.
4) DML은 독자적으로 쓰일 수 없기 때문에 데이터 부속어라고 한다.
파이썬이나 자바에 포함되어져서 사용되기 때문


---

#### 다음 중 데이터베아스 시스템 언어의 종류와 해당되는 명령어를 바르게 연결한 것을 2개 고르시오.


1) DML - SELECT
2) TCL - COMMIT
3) DCL - DROP
4) DML — ALTER

---

### <해설>

1) DML = SELECT, INSERT, UPDATE, DELETE
2) TCL = COMMIT, ROLLBACK
3) DCL = GRANT, REVOKE
 DROP은 DDL이다.
4) DML = SELECT, INSERT, UPDATE, DELETE
 ALTER는 DDL이다.
 
즉, 정답은 1, 2

---

#### 다음 중 아래의 데이터 모델과 같은테이블 및 제약조건을 생성하는 DDL 문장으로 올바른 것은?(단, DBMS는 Oracle을 기준으로 한다.)

>PRODUCT
PROD_ID VARCHAR2(10) NOT NULL
PROD_NM VARCHAR2(100) NOT NULL
REG_DT DATE NOT NULL
REGR_NO NUMBER(10) NULL

IE 표기법


---

### <해설>

위의 설명을 해석하면
PRODUCT라는 테이블에
PROD_ID 컬럼은 VARCHAR2(10) 데이터타입에 NULL을 허용하지 않는다.
PROD_NM 컬럼은 VARCHAR2(100) 데이터타입에 NULL을 허용하지 않는다.
REG_DT 컬럼은 DATE타입이며 NULL을 허용하지 않는다.
REGR_NO NUMBER(10) NULL을 허용한다. 라는 뜻이다.

```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10) NOT NULL
, PROD_NM VARCHAR2(100) NOT NULL
, REG_DT DATE NOT NULL
, REGR_NO NUMBER(10)
, CONSTRAINT PRODUCT_PK PRIMARY KEY (PROD_ID));
```


```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10) NOT NULL
, PROD_NM VARCHAR2(100) NOT NULL
, REG_DT DATE NOT NULL
, REGR_NO NUMBER(10));
ALTER TABLE PRODUCT ADD PRODUCT_PK PRIMARY KEY (PROD_ID));

```
위와 같이 2가지 방식으로 입력하면 된다.

---

**해본결과.. 5문제를 하는데도 시간이 오래걸리기 때문에 개념 요약정리로 방향을 바꿔야 할 듯 하다 틀린 문제만 적어보겠다!**