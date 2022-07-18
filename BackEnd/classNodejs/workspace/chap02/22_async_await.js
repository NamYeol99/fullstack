const a = function(){
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
           console.log('a'); 
           resolve('a');
        }, Math.random()*100);
    })
}
const b = function(){
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
           console.log('bb'); 
           resolve('b');
        }, Math.random()*100);
    })
}
const c = function(){
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
           console.log('c'); 
           resolve();
        }, Math.random()*100);
    })
}
const main = async function(){
    await a();
    await b();
    await c();
}
main();

