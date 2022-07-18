//error를 then으로 처리하는 첫번째 방법
const async1 = param => {
    return new Promise((reslove, reject) =>{
        reslove(param*2)

    })
}
const async2 = param => {
    return new Promise((reslove, reject) =>{
        throw "에러"
        reslove(param*2)
    })
}
async1(1).then(async2).then(result =>{
    console.log(result); // 4
}, 
    reason=>{console.log(`이 Promise는 이 ${reason}로 종료가 되었습니다.`);
});
