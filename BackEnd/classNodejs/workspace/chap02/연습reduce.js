
const arr = new Array(1,2,3,4,5,6,7,8,9,10,11);

//acc = 누적 , cur = 현재값, idx = 현재 index, init = acc의 초기값 
const total = arr.reduce((acc,cur) =>{
    if(cur%2 !=0){
        acc = acc +1;
    }
    return acc;
},0);

let result = arr.reduce((acc, cur)=>{return acc += (cur%2)})

console.log(total);
console.log(result);
