//javascript가 일급객체(first-class Object/객체가 연산을 지원)이기 때문.

const a = (a) => {
    return a + 10;
}
//특정 함수등으로 어떤 값을 받아 새로운 값을 반환하는 것을 Monad Function
const b = [1,2,3].map(a); //1. 매계변수가 콜백함수
console.log(b); // [11,12,13]


const _call = (a,b) => a() + b(); //2. 콜백함수가 내부에서 실행하여 반환
console.log(_call(()=>10, function(){return 20})); 


// const aa = val => () => val; //3. 함수를 반환하는 함수
// 위 아래 같은 코드
const aa = function(val) {
    return function(){
        return val;
    }
}
console.log(aa);
aa_lazy = aa(100);
console.log(aa_lazy());

