
var months = [{"id" : 1, "name" : "jan"}, {"id": 2, "name" : "Fab"}];
var monthsJson = JSON.stringify(months); // 문자열로 변환
console.log(monthsJson);
var jsonMonths = JSON.parse(monthsJson); // 객체로 변환
console.log(jsonMonths);

//string to JSON
let a = '{"name": "LiftisGoodandHappy"}';
console.log(typeof a);
console.log(a.name);
a = JSON.parse(a);
console.log(typeof a);
console.log(a.name);

//array to JSON
const myArr = ["banana", "apple"];
console.log(JSON.stringify(myArr));
const jsonArr = JSON.parse(JSON.stringify(myArr));
console.log(jsonArr);

//object to JSON
const myObj = {name: 'Son', data: new Date()};
const jsonObj = JSON.parse(JSON.stringify(myObj));
// console.log(typeof jsonObj);
// console.log(jsonObj.name);

const obj = {
    "이름" : "큰돌",
    "나이" : 24,
    "나이2" : undefined
}
// console.log(obj.이름);
var prop  = Object.keys(obj);
for(let i=0; i < Object.keys(obj).length; i++){
    // console.log(obj[prop[i]]);
}
for(let key of Object.keys(obj)){
    console.log(`${key} : ${obj[key]}`);
}
for(let item of Object.values(obj)){
    console.log(`value: ${item}`);
}
for(let entry of Object.entries(obj)){
    console.log(entry[0]+":" + entry[1]);
}