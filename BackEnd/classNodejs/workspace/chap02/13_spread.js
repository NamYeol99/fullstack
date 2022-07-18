//최근에 spread operator가 복사, 연결 등에 다방면으로 많이 사용


const a = (b, ...rest)=>{ // 묶음 :: 매개변수가 ... 매개변수 -> 배열
    console.log(rest);
}
a(1,2,3); //spread op가 입력값에 없고 매개변수에 있을 때

const b = [1,2,3]
const a2 = function(a,b,c,d){  
    console.log(a,b,c,d);
}
a2(1,...b);// 분해 :: ... 매개변수가 매개변수 -> 분해
// spread op 가 입력값에 있고 매계변수가에 없을 때

const a3 = [1,2,3,4,5] // spread op 없는 경우
const [head, ...rest] = a3
console.log(head, rest);

//spread operator 배열 복사
const arr1 = [1,2,3,4,5];
const arr2 = [...arr1, 6,7,8,9]; //분해 :: 배열이 배열안 -> 배열
console.log(arr2);

var arr3 = ['철수', '영희'];
var arr4 = [...arr3]; // array copy

//문자열 복사
var str1 = 'hello world';
var str2 = [...str1];//분해 :: 문자열이 배열안으로 -> 배열
console.log(str2);

//객체 복사
const aa = {"name": "KNY", "mobile":"010-1234-5789"}
const bb = {...aa, "key":1} //객체를 객체안으로
console.log(bb);

//배열을 매계변수로 넣으면 낱개로 분해됨
const zz = [4,2,6,7,3,9]
console.log(Math.max(...zz)); //배열이 매계변수로
console.log(Math.max(zz)); 

// 배열 통합
const x = [1,2,3];
const y = [4,5,6];
const xx = [7,8,9];
const z = [...x,...y,...xx]; //분리 :: 2개 이상의 배열을 합칠 때
const w = x.concat(y).concat(xx); // 2개이상의 배열을 합칠 때
console.log(z);
console.log(w);

