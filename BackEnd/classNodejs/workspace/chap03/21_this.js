function add1 (c, d, fn) {
    // return fn(c + d);
    console.log(fn(c+d));
}
let user = {
    add() {
        console.log(this); // user 객체
        add1(this.a, this.b, function(total){ // this.a = 2 this.b = 3
            console.log(total); // 5
            console.log(this.a+"/"+this.b); // this.a,b = undefined / undefined
            console.log(this); // window 또는 Node.js
            
        })
    }
}
user.add();