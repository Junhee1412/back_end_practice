<!-- Discount.vue -->
<!-- eslint-disable vue/multi-word-component-names -->

<template>
  <div class="discount">
    <h4 v-if="discountRate > 0">지금 결제하면 {{ discountRate }}% 할인</h4>
    <h4 v-else>할인 기간이 종료되었습니다.</h4>
  </div>
</template>

<script>
export default {
  name: "DiscountCard",
  data() {
    return {
      discountRate: 10,
    };
  },
  created() {
    const intervalId = setInterval(() => {
      if (this.discountRate > 0) {
        this.discountRate -= 1;
      } else {
        clearInterval(intervalId); // 할인 기간이 종료되면 setInterval 종료
      }
    }, 1000); // 1초마다 실행
  },
};
</script>

<style></style>
