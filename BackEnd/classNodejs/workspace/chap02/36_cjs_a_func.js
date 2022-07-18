const {odd, even} = require('./36_cjs_a.js');

function checkOddOrEven(num){
    // if(num%2==0) return odd;
    // else return even;
    return (num%2)?odd:even;
}
module.exports = checkOddOrEven;