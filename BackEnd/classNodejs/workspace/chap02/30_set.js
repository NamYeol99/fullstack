var lotto = new Set();
// var lotto = new Array();
while (lotto.size < 6){ // lotto.length = 배열크기, lotto.size = set크기
    let ball = Math.floor(Math.random()*45) + 1;
    lotto.add(ball); // set
    // lotto.push(ball); // array
}
console.log(lotto);

// var setA = new Set([1,2,3,4]);
// var setB = new Set([3,4,5,6]);
// var intersection = new Set([...setA].filter(x=> setB.has(x))) // 교집합 출력
// console.log('intersection'+ ':' + [...intersection]);

// var difference = new Set([...setA].filter(x=> !setB.has(x))); // 차집합 출력
// console.log('difference'+ ':' + [...difference]);

// var union = new Set([...setA, ...setB]); // 합집합 출력
// console.log(union);

let it = lotto[Symbol.iterator]();
console.log(it.next());
console.log(it.next());

for (let i = 0; i < lotto.size; i++) {
    console.log(it.next());
}

it = lotto[Symbol.iterator]();
for (let i = 0; i < lotto.size; i++) {
    console.log(it.next());
}

