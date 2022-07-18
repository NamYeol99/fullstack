const {map, filter, pipe, values, go} = require('fxjs');
const L = require('fxjs');
const 친구들 = [
    {
        "name" : "고길동",
        "do" : "군인"
    }, {
        "name" : "이길동",
        "do" : "개발자"
    }, {
        "name" : "강길동",
        "do" : "은행원"
    }, {
        "name" : "김길동",
        "do" : "개발자"
    }
]
// 1. 배열의 함수를 통해서 구하는 방식(문제점 : key와 value의 값이 변경되면 직접 수정)
const t = 친구들.map(el => el.do === "개발자" ? el : null).filter(el => el)
console.log(t);
const prop = key => obj => obj[key];
// const prop = function(key){
//     return function(obj){
//         return obj[key];
//     }
// }

// 2. fxjs를 통해서 구하는 방식(key와 value를 따로 지정해줄 필요가 없다. 매개변수만 변경)
const propEqual = value => key => obj => prop(key)(obj) === value;
// const propEqual = function(value){
//     return function(key){
//         return function(obj){
//             return prop(key)(obj) === value;
//         }
//     }
// }

const t2 = go(
    친구들,
    L.filter(propEqual('개발자')('do')),
    L.takeAll
)

console.log(t2);