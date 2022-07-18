const { check } = require('nightmare/lib/actions');
const {odd, even} = require('./36_cjs_a.js');
const checkOddOrEven = require('./36_cjs_a_func.js');

function checkStringOddOrEven(str){
    return (str.lenght%2)?odd:even;
}

console.log(checkOddOrEven(10));
console.log(checkStringOddOrEven('hello javascript'));