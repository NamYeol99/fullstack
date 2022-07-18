function factorial(num) {
    let result = 0;
    if (num != 1){
        result = num * factorial(num - 1);
    }
    else{
        result = 1;
    }
    // result += (num!=1)? num*factorial(num-1):num*1;
    return result;
}
// console.log(factorial(5));

const copy = function(obj){
    let out = {};
    let value, key;
    for(key in obj){
        // console.log(obj[key]);
        value = obj[key];
        if (typeof value === "object" && value != null){
            out[key] = copy(value);
        }
        else out[key] = value;
        // out[key] = (typeof value === "object" && value != null) ? copy(value) : value;
    }
    return out;
}
const aa = {
    "b" :1,
    "c" : { "d" : 2 }
}
let bb = copy(aa);
bb.c.d = 100;
console.log(aa);
