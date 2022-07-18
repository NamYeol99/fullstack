const arr = [5,12,8,130,44]
const found = arr.find(function(el){
    return el > 10;
})
console.log(found);
const 조건 = e=> e.height>=200
const 친구들 = [
    {'name' : "김길동", "height" : 173},
    {'name' : "고길동", "height" : 175},
    {'name' : "장길동", "height" : 180},
    {'name' : "이길동", "height" : 190}
]
const 키큰친구 = 친구들.find(조건); // 못찾으면 undeifined
console.log(키큰친구);
const 키큰친구인덱스 = 친구들.findIndex(조건); //못찾으면 -1
console.log(키큰친구인덱스);
const tallestFriend = 친구들.indexOf(조건);
console.log(tallestFriend);


