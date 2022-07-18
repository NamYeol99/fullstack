const a = [1,2,3,4,5]
console.log(a.includes(3)); // true

const pets = ['cat', 'dog' ,'bat']
console.log(pets.includes('at')); // false
console.log(pets.includes('cat')); // true

console.log([1,2,3].includes(2)); // true
console.log([1,2,3].includes(4)); // flase
console.log([1,2,3,NaN].includes(NaN)); //true (3,인덱스위치)
