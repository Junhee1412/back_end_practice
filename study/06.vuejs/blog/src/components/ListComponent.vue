<template>
  <div>
    <h4>{{ blogPost[0].title }}</h4>
    <p>{{ blogPost[0].date }}</p>
  </div>
  <div>
    <h4>{{ blogPost[1].title }}</h4>
    <p>{{ blogPost[1].date }}</p>
  </div>
  <div>
    <h4>{{ blogPost[2].title }}</h4>
    <p>{{ blogPost[2].date }}</p>
  </div>
</template>

<script>
export default {
  name: "ListComponent",
  props: {
    blogPost: Array,
  },
};
</script>

<style></style>
