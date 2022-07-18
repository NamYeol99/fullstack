const async = (message, ret)=> {
    return new Promise((resolve, reject)=>{
        setTimeout(() => {
            console.log(message);
            console.log(new Date());
            resolve(ret); // ret로 데이터를 넘기면 복수개가 되는데 배열로 전달됨.
        }, 2000);
    })
}
const promise = [async("async 1", 1), async("async 2", 2) ]
Promise.all(promise).then(data => {
    console.log(data); // 배열로 받음
})
