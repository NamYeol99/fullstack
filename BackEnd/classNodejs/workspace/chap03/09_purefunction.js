const b = 1;
const pure = function(a, b){ // 순수함수
    return a + b;
}
const not_pure = function(a){
    return a + b;
}
console.log(pure(1,2));
console.log(not_pure(1));

let c = 0;
// //나쁜 예
// const bad_f = () =>{
//     return c++;
// }
// bad_f();
// console.log(c); // 1

//좋은 예
const f = function(c){
    return c+1;
}
console.log(f(c));
