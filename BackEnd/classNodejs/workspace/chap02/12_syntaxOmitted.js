const name = 'KNY';
const age = '27';
const job = '회장';

const data_used_ES6 = {name, age, job};
const data_not_used_ES6 = {'name':name, 'age':age, 'job': 'job'};

console.log(data_used_ES6.name);
console.log(data_not_used_ES6.name);