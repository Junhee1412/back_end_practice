<template>
  <div class="black-bg" v-if="모달창열렸니 == true">
    <div class="white-bg">
      <img :src="원룸들[누른거].image" class="room-img" />
      <h4>{{ 원룸들[누른거].title }}</h4>
      <p>{{ 원룸들[누른거].content }}</p>
      <!-- 아래 input은 같음 -->
      <!-- <input @input="month = $event.target.value" />
           <input v-model="month" />
           <textarea v-model="month"></textarea> 
           <input type="checkbox" v-model="month" /> 
           input에는 전부 문자 자료형임. 숫자도 문자로 받아서 *이 아닌 +으로 연산하면
           30000 + 12면 3000012라고 저장됨. 이걸 방지하기 위해선 v-model.number="month"라고 해야함.
           이건 boolean타입으로 지정해둬야함.-->
      <!-- <select v-model.number="month">
        <option>1</option>
        <option>2</option>
      </select> -->
      <input v-model.number="month" />
      <p>
        {{ month }}개월 선택함 : {{ 원룸들[누른거].price * month }}원 입니다.
      </p>
      <button @click="$emit('closeModal')">닫기</button>
      <!-- 데이터 재할당은 불가능 -->
    </div>
  </div>
</template>

<script>
export default {
  name: "ModalSite",
  data() {
    return {
      month: 1,
    };
  },
  // 데이터와 watch의 이름은 같아야하고 파라미터 추가하면 변수도 사용가능
  // 파라미터는 2개까지 저장 가능하고 1개면 변경 후 데이터가 저장됨.
  // 2개면 (변경 후 데이터, 변경 전 데이터)
  watch: {
    month(a) {
      if (a >= 13) {
        alert("13이상 입력하지 마셈");
        this.month = 1;
      } else if (isNaN(a)) {
        // else if(/[^0-9]/.test(a)){ 도 가능
        alert("제발 한글은 하지마셈");
        this.month = 1;
      }
    },
  },
  props: {
    원룸들: Array,
    누른거: Number,
    모달창열렸니: Boolean,
  },
  beforeUpdate() {
    if (this.month === 2) {
      alert("2개월 너무 적어연 안팔아요..");
      this.month = 3;
    }
  },
};
</script>

<style></style>
