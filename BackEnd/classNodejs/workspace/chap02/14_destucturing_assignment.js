// swap 방식
let a = 2;
let b = 5;
console.log(`${a} / ${b}`);

let tmp = a;
a = b;
b = tmp;
console.log(`${a} / ${b}`);

[a,b] = [b,a];
console.log(`${a} / ${b}`);

//배열의 요소 담기
// const d = function() {return [1,2,3,4,]}
const d = () => [1,2,3,4]
const [x,y,z] = d();
console.log(x,y,z);

//객체의 value를 쉽게 담기
const f = () => ({
    "name": "KNY",
    "job" : "programmer" }) // 리터럴 객체 리턴시 () 필수
const {name} = f()
console.log(name);

// var candyMachine = {
//     status : {name: 'node', count: 5},
//     getCandy : function(){
//         this.status.count--;
//         return this.status.count;
//     }
// }
// var getCandy = candyMachine.getCandy();
// var count = candyMachine.status.count;
// console.log(getCandy);
// console.log(count);

const candyMachine = {
    status : {name: 'node', count: 5},
    getCandy : function(){
        this.status.count--;
        return this.status.count;
    }
}
let {getCandy,status:{count}} = candyMachine;
// getCandy = getCandy.bind(candyMachine);
// console.log(getCandy.call(candyMachine));
// console.log(getCandy());
console.log(getCandy.apply(candyMachine));
console.log(count);