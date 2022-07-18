const f1 = obj => {
    obj = null;
}
let b1 = {"a" : 1};
f1(b1);
console.log(b1); // { a:1 } 출력
const f2 = arr => {
    arr = null;
}
let b2 = [];
let a2 = b2;
f2(b2);
console.log(b2);
console.log(a2);

const swap = (a,b) => {
    let temp = a;
    a = b;
    b = temp;
}
let x = 1;
let y = 2;
swap(x,y);
console.log(x,y);

const arr = {'a':1};
console.log(arr);
const fnc = function(c){
    c.a = 2;
}
fnc(arr);
console.log(arr);