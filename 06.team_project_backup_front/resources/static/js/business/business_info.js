var policyctx = document.getElementById("PET_POLICY").getContext("2d");
var myChart = new Chart(policyctx, {
  type: "bar",
  data: {
    labels: [
      "반려동물 산업 관리 감독 강화",
      "반려동물 산업의 건강한 육성",
      "성숙한 반려동물 문화 정착",
      "산업 육성 인프라 구축",
      "기타",
      "모름/무응답",
    ],
    datasets: [
      {
        label: "필요하다고 생각하는 반려동물 관련 정책",
        data: [25.4, 9.6, 43.7, 9.3, 11.3, 16.1],
        backgroundColor: [
          "rgba(255, 99, 132, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 205, 86, 0.5)",
          "rgba(75, 192, 192, 0.5)",
          "rgba(54, 162, 235, 0.5)",
          "rgba(153, 102, 255, 0.5)",
          "rgba(201, 203, 207, 0.5)",
        ],
        borderColor: [
          "rgb(255, 99, 132)",
          "rgb(255, 159, 64)",
          "rgb(255, 205, 86)",
          "rgb(75, 192, 192)",
          "rgb(54, 162, 235)",
          "rgb(153, 102, 255)",
          "rgb(201, 203, 207)",
        ],
        borderWidth: 1,
        hoverBorderWidth: 4,
        hoverBorderRadius: 4,
      },
    ],
  },
  options: {
    responsive: false,
    scales: {
      yAxes: [
        {
          ticks: {
            beginAtZero: true,
          },
        },
      ],
    },
  },
});

var protectctx = document.getElementById("ORG_ANM_PRTC_CHART").getContext("2d");
var myChart = new Chart(protectctx, {
  type: "line",
  data: {
    labels: ["2016년", "2017년", "2018년", "2019년", "2020년"],
    datasets: [
      {
        label: "분양",
        data: [30.4, 30.1, 27.6, 26.4, 29.6],
        backgroundColor: ["rgba(255, 99, 132, 0.4)"],
        borderColor: ["rgba(255, 99, 132, 1)"],
        borderWidth: 1,
        pointBorderWidth: 3,
        pointHoverRadius: 10,
      },
      {
        label: "자연사",
        data: [25, 27.1, 23.9, 24.8, 25.1],
        backgroundColor: ["rgba(54, 162, 235, 0.4)"],
        borderColor: ["rgba(54, 162, 235, 1)"],
        borderWidth: 1,
        pointBorderWidth: 3,
        pointHoverRadius: 10,
      },
      {
        label: "안락사",
        data: [19.9, 20.2, 20.2, 21.8, 20.8],
        backgroundColor: ["rgba(255, 206, 86, 0.4)"],
        borderColor: ["rgba(255, 206, 86, 1)"],
        borderWidth: 1,
        pointBorderWidth: 3,
        pointHoverRadius: 10,
      },
      {
        label: "인도",
        data: [15.2, 14.5, 13, 12.1, 11.4],
        backgroundColor: ["rgba(75, 192, 192, 0.4)"],
        borderColor: ["rgba(75, 192, 192, 1)"],
        borderWidth: 1,
        pointBorderWidth: 3,
        pointHoverRadius: 10,
      },
      {
        label: "보호중",
        data: [6.2, 4.7, 11.7, 11.8, 10.4],
        backgroundColor: ["rgba(153, 102, 255, 0.4)"],
        borderColor: ["rgba(153, 102, 255, 1)"],
        borderWidth: 1,
        pointBorderWidth: 3,
        pointHoverRadius: 10,
      },
    ],
  },
  options: {
    responsive: false,
    scales: {
      yAxes: [
        {
          ticks: {
            beginAtZero: true,
          },
        },
      ],
    },
  },
});

var petkeepctx = document.getElementById("PET_KEEP").getContext("2d");
var myChart = new Chart(petkeepctx, {
  type: "doughnut",
  data: {
    labels: [
      "현재 기르고 있음",
      "과거에 기르고 있으나 현재 안 기름",
      "길러 본 적 없음",
    ],
    datasets: [
      {
        label: "",
        data: [27.9, 28.6, 43.6],
        backgroundColor: [
          "rgba(255, 99, 132, 0.5)",
          "rgba(54, 162, 235, 0.5)",
          "rgba(255, 205, 86, 0.5)"
        ],
        hoverBorderColor: [
          "rgba(255, 99, 132, 1)",
          "rgba(54, 162, 235, 1)",
          "rgba(255, 205, 86, 1)"
        ],
        hoverBorderJoinStyle: 30,
        hoverOffset: 30,
      },
    ],
  },
  options: {
    responsive: false,
    scales: {
      yAxes: [
        {
          ticks: {
            beginAtZero: true,
          },
        },
      ],
    },
  },
});

const saTriggerMargin = 300;
const saElementList = document.querySelectorAll(".sa");

const saFunc = function () {
  for (const element of saElementList) {
    if (!element.classList.contains("show")) {
      if (
        window.innerHeight >
        element.getBoundingClientRect().top + saTriggerMargin
      ) {
        element.classList.add("show");
      }
    }
  }
};

window.addEventListener("load", saFunc);
window.addEventListener("scroll", saFunc);
