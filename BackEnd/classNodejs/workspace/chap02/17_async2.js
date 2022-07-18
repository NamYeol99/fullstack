console.log("HI"); // 

setTimeout(() => {
    console.log("async function1 complete");
}, 5000);
setTimeout(() => {
    console.log("async function2 complete");
}, 5000);
console.log("Bye");