// const job_1 = () => {
//     const b = Math.random()*100
//     setTimeout(() => {
//         console.log('job_1');
//     }, b);
// }
const job_1 = () => {
    return new Promise((resolve, reject)=> {
        const b = Math.random()*100;
        setTimeout(() => {
           console.log(1);
           resolve(1);
        }, b);
    });
}
const job_2 = () => {
    return new Promise((resolve, reject)=> {
        const b = Math.random()*100;
        setTimeout(() => {
           console.log(2);
           resolve(2);
        }, b);
    });
}
const job_3 = () => {
    return new Promise((resolve, reject)=> {
        const b = Math.random()*100;
        setTimeout(() => {
           console.log(3);
           resolve(3);
        }, b);
    });
}
// job_1().then(job_2).then(job_3);
job_1().then(ret => job_2()).then(ret => job_3());


const a = function(c) {
    return new Promise((resolve, reject)=>{
      setTimeout(() => {
        resolve(`${c}로부터 받은 사랑`)
      }, 1000);
    });
  }
  a('어머니').then(ret =>{
    console.log(ret);
    return a('아버지')
  }).then(ret => {
    console.log(ret);
  });