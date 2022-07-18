const a = {
 "name" : "KNY",
 'tall' : 178
}
// JSON.stringify(value,function, space)
const ret = JSON.stringify(a,null,3)
console.log(ret);


const replacer = (key,value) => {
    return (typeof value === 'string' ? undefined : value)
}
const result = JSON.stringify(a,replacer,3)
console.log(result);