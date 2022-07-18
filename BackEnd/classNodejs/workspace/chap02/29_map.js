const myMap = new Map();
myMap.set(0,'zero'); // (key, value)
myMap.set(1,'one');
myMap.set(2,'two');
myMap.set(2,'이'); // key 가 겹치면 최종 입력이 우선
myMap.set(3,'이'); // value가 겹치면 상관없음.
console.log(myMap.get(0)); // key으로 값 불러올 수 있음.

for (const [key,val] of myMap) console.log(`${key}: ${val}`); // key, values 추출
for (const key of myMap.keys()) console.log(`key : ${key} / ${myMap.get(key)}`); // key, values 추출
for (const val of myMap.values()) console.log(`value : ${val}`); // values만 추출
for (const [key,val] of myMap.entries()) console.log(`key : ${key}`); // key만 추출
myMap.forEach((v, k) => { // key, value 추출
    console.log(k+":"+v);
});
const it = myMap.entries();
console.log(it);
let i=0;
while(i++ < myMap.size){
    const result =  it.next().value;
    // console.log(result);
    console.log(`k: ${result[0]} v : ${result[1]}`);
}

// myMap.delete(3);
// console.log(myMap);
// const arr1 = [[1,'one'],[2,'two'],[3,'three']];
// const arr2 = [[1,'uno'], [2,'dos']];
// const first = new Map([...arr1]);
// const second = new Map([...arr2]);
// console.log(second);
// const merge = new Map([...first,...second])
// console.log(merge); // 키 값이 중복되어 합쳐짐

