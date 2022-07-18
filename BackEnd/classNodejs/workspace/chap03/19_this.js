const a = () => {
    console.log(this);
}
a(); // node 실행시에는 노드의 실행객체를 가리킴.
// browser 실행시에는 window객체를 가르킴.

function b () {
    console.log(this);
}

b();