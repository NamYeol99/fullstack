const a = {
    "b" :1,
    "c" : { "d" : 2 }
}
const str = JSON.stringify(a); // 문자열
// console.log(str.a.c.d); //문자열이라서 json객체처럼 접근 불가
console.log(str);
let b = JSON.parse(JSON.stringify(a));
b.c.d = 4
console.log(a);
console.log(a.c.d);