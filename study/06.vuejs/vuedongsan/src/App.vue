<template>
  <div class="menu">
    <a v-for="(b, a) in 메뉴들" :key="a">{{ b }}</a>
  </div>
  <!-- 
    축약해둔 컴포넌트 쓰는 법
    1. vue파일 import 해오고
    2. 등록하고
    3. 쓰면됨. -->
  <Discount />

  <!-- vue if문 작성 이렇게 하면됨. 
  <div v-if="1 == 2">hi?</div>
  <div v-else-if="1 == 3">hihihihi??</div>
  <div v-else>hihi?</div> -->

  <!-- 동적인 UI 만드는 법:
    0. HTML, CSS로 디자인(기본)
    1. UI의 현재 상태를 데이터로 저장해둠
    2. 데이터에 따라 UI가 어떻게 보일지 작성 -->
  <div class="black-bg" v-if="모달창열렸니 == true">
    <div class="white-bg">
      <img :src="원룸들[누른거].image" class="room-img" />
      <h4>{{ 원룸들[누른거].title }}</h4>
      <p>{{ 원룸들[누른거].content }}</p>
      <p>{{ 원룸들[누른거].price }}원 입니다.</p>
      <button @click="모달창열렸니 = false">닫기</button>
    </div>
  </div>

  <div v-for="(c, i) in 원룸들" :key="i">
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
  </div>

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

export default {
  name: "App",

  data() {
    return {
      누른거: 0,
      원룸들: data,
      모달창열렸니: false,
      신고수: [0, 0, 0],
      price1: 80,
      price2: 70,
      price: [50, 20, 30],
      메뉴들: ["Home", "shop", "About"],
      products: ["역삼동원룸", "천호동원룸", "마포구원룸"],
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
  },

  components: {
    Discount: Discount,
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
