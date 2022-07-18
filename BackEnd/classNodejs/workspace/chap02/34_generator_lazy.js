const _ = require("fxjs/Strict");
const L = require("fxjs/Lazy");
const C = require("fxjs/Concurrency");

const arr = [1,2,3,4,5,6,7,8];
const result = _.go( //_.go는 즉시실행 pipe 함수
    arr,
    _.map(arr=> arr), // 새로운 배열 반환
    _.filter(arr => arr %2), // 홀수인 요소만 배열로 만듦
    _.take(2) // 그중 2개만 추출
);
console.log(result);
console.log([...result]);