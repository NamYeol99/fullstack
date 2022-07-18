//array copy
let orig = [1,2,3,4,5];
let copy = [];
// for(let i = 0; i <orig.length; i++){
//     copy.push(orig[i]);
// }

copy = [...orig]; // call by value 출력할 때 변수가 각각 다름
// copy = orig; // call by assignment 출력할 때 변수가 같이 변경
orig[0] = 10;
// console.log(orig.toString());
// console.log(copy.toString());

const a = {"b":1};
let b = {...a}; //spread 연산자 spread op는 배열뿐만 아니라 객체도 복사
console.log(b);
let c = Object.assign({}, a);
c.b = 3;
b.b = 3;
console.log(a.b);

const aa = {
    "b":1,
    "c":{"d":2}
}
let bb={...aa}
let cc = Object.assign({},aa)
cc.c.d = 100
console.log(aa);