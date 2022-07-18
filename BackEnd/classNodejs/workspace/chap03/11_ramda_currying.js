const R = require('ramda');

//ramda 미 적용할 경우
const non_currying = (a,b,c) => a+b+c;
console.log(non_currying(1,2));

// ramda적용 커링적용 :: 연산을 지연시키는 효과
const a = R.add(1);
console.log(a);
const b = a(2);
console.log(b);
const c = R.add(1)(1)
console.log(c);

// ramda적용
const addFourNumbers = (a,b,c,d) => a+b+c+d;
const curriedAddFourNumbers = R.curry(addFourNumbers);
const f = curriedAddFourNumbers(1,2);
const g = f(3);
console.log(`ramda를 적용하여 계산한 결과 : ${g(4)}`); // 10

// ramda를 이용한 커스텀 커링

