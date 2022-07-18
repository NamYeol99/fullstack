// const curry = fn => a => b => fn(a,b);
const custom_curry = function(fn) {
    return function(a){
        return function(b){
            return fn(a,b);
        }
    }
}
// const f1 = custom_curry((a,b)=> a+b);
const f1 = custom_curry(function(a,b){ // 사용자가 직접 만든 커리 함수
    return a+b; 
})
const f2 = f1(1);
const ret = f2(2)
console.log(ret); // 3

