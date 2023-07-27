<template>
  <div class="menu">
    <a v-for="(b, a) in 메뉴들" :key="a">{{ b }}</a>
  </div>

  <!-- 
  뷰의 라이프 사이클
  컴포넌트는 웹페이지에 표기되기 까지 일련의 step이 있음.
  create -> mount -> 컴포넌트 생성 -> update -> unmount

  create는 데이터만 있음
  mount는 데이터를 html로 바꿔줌
  컴포넌트를 생성함.
  update는 컴포넌트 안에 data가 변하면 발생함.
  unmount는 컴포넌트 삭제임.

  단계 도중에 후크를 걸 수 있다.(LifeCycle Hook)
  컴포넌트가 업데이트 되기 전에, create되기 전에 등 이런식으로 LifeCycle Hook을 쓸 수 있음.

 -->

  <!-- 
    축약해둔 컴포넌트 쓰는 법
    1. vue파일 import 해오고
    2. 등록하고
    3. 쓰면됨. -->
  <Discount />
  <Discount v-if="showDiscount == true" />
  <!-- 컴포넌트 문법 쓰는 이유
  1. 깔끔함
  2. 재사용이 쉬움
  3. 수정이 쉬워짐 
  반복적으로 출현하면 컴포넌트하면 좋음
  주의할 점은 모달창같이 데이터바인딩을 하면
  데이터가 없어서 제대로 작동하지않음.
  데이터 관리가 복잡해진다.-->

  <button @click="priceSort">가격순 정렬</button>
  <button @click="sortBack">되돌리기</button>
  <button @click="sortByName">가나다순 정렬</button>
  <button @click="sortByPrice">가격 역순 정렬</button>
  <!-- vue if문 작성 이렇게 하면됨. 
  <div v-if="1 == 2">hi?</div>
  <div v-else-if="1 == 3">hihihihi??</div>
  <div v-else>hihi?</div> -->

  <!-- 동적인 UI 만드는 법:
    0. HTML, CSS로 디자인(기본)
    1. UI의 현재 상태를 데이터로 저장해둠
    2. 데이터에 따라 UI가 어떻게 보일지 작성 -->
  <!-- props 문법
  1. 부모 데이터를 자식이 쓰고 싶을때 쓴다. 
  2. 주로 App.vue에 모든 데이터를 넣고 상속받아서 사용
  3. 데이터를 변경할 수 없다. 재할당이 불가능하다는 뜻(Read-Only임.)
   -->
  <!-- props 쓸 때는
   1. v-bind로 보낸다.(:누른거="누른거") 작명="자료이름", v-bind할 때 간단한 문자열은 : 없이도 보낼 수 있다.
     ex) <Modal 데이터이름="안녕하세요" />, <Card 데이터이름="12345" /> 이러면 문자열로감 숫자로 보내고 싶으면 : 사용
        오브젝트 안에 것을 보낼때는
        <Modal :이름="오브젝트.name" :나이="오브젝트.age" />
        <Modal v-bind="오브젝트" /> 이 둘이 같다. 자주 사용하진 않음.
        <Modal :오브젝트="오브젝트" /> 이렇게 보낼  수 있기 때문에.. 3개가 모두 같음
   2. 등록하고 (props:{누른거:Number})
   3. 위에서 갖다 쓰면됨.{{원룸들[누른거]}}
    -->
  <!-- 하위 컴포넌트에 데이터를 만들어도 되지만
    부모도 쓰는 데이터라면 무조건 부모 컴포넌트에 만드는게 좋다. -->
  <!-- 
    :class="{클래스명 : 조건}"을 넣으면 해당 조건이 true일 때 클래스가 추가된다.
    <div class="start" :class="{ end: 모달창열렸니 }"> 
      transition이 이것을 대신해준다. css에 문법이 표시되어있는데
      생기면서 fade-enter-from, 변수명-enter-active, 변수명-enter-to 이런식으로 나눠서 한다. 
      사라지면서는 fade-leave-from, 변수명-leave-active, 변수명-leave-to 이런식
      -->
  <transition name="fade">
    <Modal
      @closeModal="모달창열렸니 = false"
      :원룸들="원룸들"
      :누른거="누른거"
      :모달창열렸니="모달창열렸니"
    />
  </transition>
  <!-- </div> -->
  <!-- <div class="black-bg" v-if="모달창열렸니 == true">
    <div class="white-bg">
      <img :src="원룸들[누른거].image" class="room-img" />
      <h4>{{ 원룸들[누른거].title }}</h4>
      <p>{{ 원룸들[누른거].content }}</p>
      <p>{{ 원룸들[누른거].price }}원 입니다.</p>
      <button @click="모달창열렸니 = false">닫기</button>
    </div>
  </div> -->

  <!-- custom event 사용법(부모에게 메세지보내기)
  1. 자식은 $emit('작명')
  2. 부모는 메세지 받으려면 @작명한거=""
   -->

  <Card
    @openModal="
      모달창열렸니 = true;
      누른거 = $event;
    "
    :원룸="원룸들[i]"
    v-for="(작명, i) in 원룸들"
    :key="작명"
  />
  <!-- 
  <Card :원룸="원룸들[0]" />
  <Card :원룸="원룸들[1]" />
  <Card :원룸="원룸들[2]" />
  <Card :원룸="원룸들[3]" />
  <Card :원룸="원룸들[4]" />
  <Card :원룸="원룸들[5]" /> 
  -->

  <!-- <div v-for="(c, i) in 원룸들" :key="i">
    <img :src="c.image" class="room-img" />
    <h4
      @click="
        모달창열렸니 = true;
        누른거 = i;
      "
    >
      {{ c.title }}
    </h4>
    <p>{{ c.price }} 원</p>
    <p>{{ c.content }}</p>
  </div> -->

  <!-- 외부 데이터 받아오기
  
  <div>
    <img :src="원룸들[0].image" class="room-img">
    <h4>{{ 원룸들[0].title }}</h4>
    <p>{{ 원룸들[0].price }}원</p>
  </div> -->

  <!-- 신고하기 기능 만들기

  <div>
    <img src="./assets/room0.jpg" class="room-img">
    <h4 @click="모달창열렸니 = true">{{ products[0] }}</h4>
    <p>50만원</p>
    <button @click="신고수[0]++">허위매물 신고</button> <span>신고수 : {{ 신고수[0] }}</span>
  </div>
  <div>
    <img src="./assets/room1.jpg" class="room-img">
    <h4>{{ products[1] }}</h4>
    <p>55만원{{ apple }}</p>
    <button @click="신고수[1]+=1">허위매물 신고</button> <span>신고수 : {{ 신고수[1] }}</span>
  </div>
  <div>
    <img src="./assets/room2.jpg" class="room-img">
    <h4>{{ products[2] }}</h4>
    <p>60만원</p>
    <button @click="increase3">허위매물 신고</button> <span>신고수 : {{ 신고수[2] }}</span>
  </div> -->

  <!-- for문으로 div만들기 -->

  <!--<div style="border:1px solid red; width:30%;" v-for="(a, index) in products" :key="index"><h4>{{ a }}</h4>
    <p>{{ price[index] }} 만원</p>
  </div> -->
</template>

<script>
import data from "./assets/oneroom.js";
import Discount from "./Discount.vue";
import Modal from "./Modal.vue";
import Card from "./Card.vue";

export default {
  name: "App",

  data() {
    return {
      원룸들오리지널: [...data],
      오브젝트: { name: "kim", age: 20 },
      누른거: 0,
      원룸들: data,
      모달창열렸니: false,
      신고수: [0, 0, 0],
      price1: 80,
      price2: 70,
      price: [50, 20, 30],
      메뉴들: ["Home", "shop", "About"],
      products: ["역삼동원룸", "천호동원룸", "마포구원룸"],
      showDiscount: true,
    };
  },

  methods: {
    increase() {
      this.신고수[0]++;
    },
    increase2() {
      this.신고수[1]++;
    },
    increase3() {
      this.신고수[2]++;
    },
    priceSort() {
      this.원룸들.sort(function (a, b) {
        return a.price - b.price;
      });
    },
    sortBack() {
      this.원룸들 = [...this.원룸들오리지널];
    },
    // 가나다순 정렬
    sortByName() {
      this.원룸들.sort((a, b) => a.title.localeCompare(b.title));
    },
    // 가격 역순 정렬
    sortByPrice() {
      this.원룸들.sort((a, b) => b.price - a.price);
    },
  },

  created() {
    // 주로 서버에서 데이터 가져오는 코드를 작성함.
  },

  // 마운트되고 나서 뭔가 실행하고 싶다.
  mounted() {
    //2000밀리초 뒤에 showDiscount를 false로 만들어줘..
    //2초뒤에 사라짐.
    setTimeout(() => {
      this.showDiscount = false;
    }, 2000);
  },

  // 마운트 되기 전에 뭔가 실행하고 싶다.
  beforeMount() {},
  components: {
    Discount: Discount,
    Modal: Modal,
    Card: Card,
  },

  
};
</script>

<style>
/* 모달창 */
body {
  margin: 0;
}
div {
  box-sizing: border-box;
}
.start {
  opacity: 0;
  transition: all 1s;
}

/* fade가 시작할 때 css */
.fade-enter-from {
  transform: translateY(-1000px);
}
/* fade가 작동할 때 css */
.fade-enter-active {
  transition: all 1s;
}
/* fade가 끝났을 때 css */
.fade-enter-to {
  transform: translateY(0px);
}

/* fade가 사라지기 시작할 때 css */
.fade-leave-from {
  opacity: 1;
}
/* fade가 사라지는 것이 작동할 때 css */
.fade-leave-active {
  transition: all 1s;
}
/* fade가 사라지는것이 끝났을 때 css */
.fade-leave-to {
  opacity: 0;
}

.end {
  opacity: 1;
}
.discount {
  background: #eee;
  padding: 10px;
  margin: 10px;
  border-radius: 5px;
}
.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  padding: 20px;
}
.white-bg {
  width: 100%;
  background: white;
  border-radius: 8px;
  padding: 20px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: white;
  padding: 10px;
}
.room-img {
  width: 100%;
  margin-top: 40px;
}
</style>
