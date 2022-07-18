function* gen(){ // *는 함수명 안에만 있으면 됨. 위치는 상관없음
    yield 10;
    if(false) yield 20;
    yield 30;
    return 90;
    yield 50;
}

let it = gen();
console.log(it.next());
console.log(it.next());
console.log(it.next());
console.log(it.next());
for (const it of gen()) {
    console.log(it);
}
console.log([...gen()])
