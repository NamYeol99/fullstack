let a = ['손흥민' , '살라', '호나우도'];
function fnc(){
    // if(a.includes('손흥민')) return true
    // if(a.indexOf('손흥민') != -1) return true
    let srch = '살라';
    return (a.indexOf(srch) != -1?a.indexOf(srch):-1);
}
console.log(fnc());

//https://jsbench.me/z3kjkk0ul0/10