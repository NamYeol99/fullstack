const condition = true;
const promise = new Promise((resolve, reject) =>{
    if(condition){
        resolve('success')
    } else {
        reject('fail')
    }
});

promise.then((message)=>{  // then = 성공했을 때 catch = 실패 , finally = 무조건
    console.log(message);
}).catch((error)=>{
    console.log(error);
}).finally(()=>{
    console.log('무조건');
});