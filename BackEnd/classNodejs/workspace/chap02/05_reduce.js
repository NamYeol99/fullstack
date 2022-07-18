var total = 0;
var arr = new Array(1,2,3,4,5,6,7,8,9,10);
for (let i = 0; i < arr.length; i++) {
    total += arr[i];   
}
console.log(total);

var init = 100;
//acc = 누적 , cur = 현재값, idx = 현재 index, init = acc의 초기값 
total = arr.reduce((acc,cur, idx) =>{
    return acc += cur;
}, init); // acc에 초기값을 100으로 지정
console.log(total);