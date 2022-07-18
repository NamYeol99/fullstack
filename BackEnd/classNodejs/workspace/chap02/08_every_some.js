const numbers = [1,2,3,4,5];
// const isAllOdd = numbers.every(e => e%2);
const isAllOdd = numbers.every(function(e){
    return e%2;
})
const isSomeOdd = numbers.some(e => e%2);
console.log(isAllOdd, isSomeOdd);

const isBelowItems = cur => cur<40;
const arr = [1,30,39,20,10,13];
console.log(arr.every(isBelowItems));

const arr2 = ['h','e','l','l','o'];
const isFind = function(arr, val){
    return arr.some(
        function(cur){
            return cur == val
        }
    )
}
console.log("결과: " + isFind(arr2, 'e'));

var fruits = ['apple', 'banana', 'mango', 'guava'];
function checkAvailability(arr, val){
    return arr.some(function(arrVal){
        return val === arrVal;
    });
}
console.log(checkAvailability(fruits, 'kela'));
console.log(checkAvailability(fruits, 'banana'));
