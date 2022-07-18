
for(var i=0; i<10; i++){
    setTimeout(() => {
        console.log(j);
    }, 100); //hoisting 되면서 closure(독립적인 값을 유지) 현상이 나타나게됨.
}

// 즉시실행함수
// cㅣosure를 제거하기 위해 즉시실행함수를 적용. 
// for(var i=0; i<10; i++){
//     (function(j){
//         setTimeout(() => {
//             console.log(j);
//         }, 100);
//     })(i)
// }

((i,j) =>{})(i,j)// 매개변수 적용(순서대로)