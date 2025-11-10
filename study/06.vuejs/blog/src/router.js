import { createWebHistory, createRouter } from "vue-router";
import ListComponent from "./components/ListComponent.vue";
import Home from "./components/Home.vue";

const routes = [
  {
    path: "/list",
    component: ListComponent,
  },
  {
    path: "/",
    component: Home,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
