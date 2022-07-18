const a = function(c='naver'){
    return new Promise((resolve,reject)=>{
        // 1,2,3번은 에러를 강제로 발생.
        //Promise객체는 3가지 (pending, fullfilled, rejected)
        // throw new Error(' throw error') // 1번 js의 구문(throw) 에러객체 생성 명령
        // reject(new Error('reject new error')) // 2번 Promise의 에러객체 생성 명령
        // reject('[reject]'); // 3번 Promise로 에러발생
        setTimeout(() => {
            console.log("fullfuled 상태");
            resolve(`${c}로 부터 사랑`);
        }, 1000);
    });
}
a().then(ret => {
    console.log(ret);
    return a('kakao');    
}).then(ret=>{
    console.log(ret);
}).catch(function(e){
    console.log(`${e}라는 에러가 발생했어요..!`);
})