function Person() {
    this.value = "KNY",
    this.printThis = function() {
        console.log(this);
    }
}
var p = new Person();
var print = p.printThis; // 변수에 this값 넣으면 this값 날라감

p.printThis() // new로 생성된 객체의 printThis이기 때문에 this는 Person
// -> Person {value: "KNY", printThis: f}

print(); // Person의 printThis만 들고와서 print라는 변수에 할당했기 때문에 this는 node 모듈
// -> Window {stop: f, open: f, alert: f, ...} (브라우저)
// -> Object[global](Node.js)