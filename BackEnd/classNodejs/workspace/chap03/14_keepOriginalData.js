const a = [1,2,3,4]
const c = [8,9] //배열
// const c = {"d":1} //리터럴 객체
a.push(c)
let b = a.slice()
b[0] = 10;
a[4][1] = 100;  //배열일때
// a[4].d = 100    //리터 객체일때

console.log(a, b);

b = a.splice(1)
console.log(a, b);