function* gen(f,list){
    for(const item of list){
        yield f(item)
    }
}
const add = a => a+10;
const a = [1,2,3];
const customGenerator = gen(add,a);
//coroutine은 next()를 통해서 다음단계로 넘어감(세미코루틴)
console.log(customGenerator.next());
console.log(customGenerator.next());
console.log(customGenerator.next());