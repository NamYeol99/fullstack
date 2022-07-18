const R = require('ramda');
const {map, filter, pipe} = require('fxjs');
const f_1 = R.map(a => a+1);
const f_2 = R.filter(a => a%2);
const result = f_2(f_1([1,2,3,4])) // 함수를 합쳐서 연산
console.log(result);

//ramda를 이용한 함수합성 - compose
console.log(R.compose(Math.abs, R.add(1), R.multiply(2))(-4));

//ramda를 이용한 함수합성 - pipe
console.log(R.pipe(R.negate, R.inc)(3));
//nagete = 값 3을 부정 -> -3
//inc = 하나를 더함

//fxjs를 이용한 함수합성 - pipe
const f_pipe = pipe(
    map(a => a+1),
    filter(a => a%2)
)
const _result = f_pipe([1,2,3,4]);
console.log(_result);


