function a(c, d) {
    const b = [this.name, this.adjective, '이가 춤을 춥니다', c, d].join(' ');
    return b
}

const obj = {
    name: 'KNY',
    adjective: 'splendid'
}
//첫번째 인자인 obj는 ()의 상위 객체가 됨
// apply는 두번째 인자부터는 배열이 들어와도 각각의 인자로 인식

console.log(a.apply(obj,['tiger', 'air'])); 

// call은 두번쨰 인자부터는 배열이 들어오면 두번째 인자로 인식
// call은 화살표 함수로 변경안됨. call 화살함수에서 this는 window를 가리키기 때문.
//  
console.log(a.call(obj,'tiger', 'air'));  