const test = (function(){
    let count = 0;
    //return 으로 외부에서 접근을 허용함. 그래서 count의 변수가 closure됨.
    return {
        increase(){
            count++;
        },
        decrease(){
            count--;
        },
        getValue(){
            console.log(count);
        }
    }
})()
test.increase();
test.increase();
test.increase();
test.getValue();


const add = (function (){
    let counter = 0;
    return function(){
        counter += 1;
        return counter;
    }
})()
console.log([add(), add(), add()]); // [1, 2, 3]