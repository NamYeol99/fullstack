a();
b();
function a () {
    console.log("a");
}
// 익명함수일 때 화살표함수로 변경가능
// var로 선언될 때 함수를 함수를 미리 선언해야 사용가능,
// 미리 선언 안되면  not a function 됨
//const로 선언될 때 함수를 미리 선언해야 사용가능, 미리 선언 안되면 not initialized 됨
const b = () => {
    console.log("b");
}

// 화살표 함수의 매개변수 1개 일때 ()는 생략가능
// 화살표 함수의 return 또는 명령문이 1개일 때 {}와 return을 생략 가능