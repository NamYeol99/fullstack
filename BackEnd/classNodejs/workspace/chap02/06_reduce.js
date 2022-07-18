var arr = [1,2,3,4,5];
var maxCallback = function(a,b){
    return Math.max(a,b);
}
// const result = arr.reduce(maxCallback);
const result = arr.reduce((a,b)=>{
    return Math.max(a,b);
}, )
console.log(result);

console.log('a'.charCodeAt(0));
var arr2 = ['a','b','C','D','e'];
const result2 = arr2.reduce((a,b) => {
    return Math.min(a,b.charCodeAt(0))
},1000)
console.log(String.fromCharCode(result2));

const result3 = [{x:22}, {x:42}].reduce((max,cur)=>{
    return Math.max(max.x, cur.x)
});
console.log(result3);