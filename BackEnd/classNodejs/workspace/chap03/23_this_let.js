function  Person() {
    let age = 0; //var, 제어자 없는 경우, let 일경우 외부에서는 접근안됨. undefined
    function up(){
        return ++age;

    }
    function down(){
        if(this.age > 0)
            return --age;
        else
            return 0;
    }
    return Object.freeze({up, down}) //up, down만 외부에서 접근가능
    // return {up, down}up, down만 외부에서 접근 가능
    // return Object.freeze({age, up, down}) //age, up, down 외부에서 접근가능
    // return {age, up, down}age, up, down 외부에서 접근 가능
}
//객체를 생성하고 보호하는 목적 =>
const p = new Person();
console.log(p.age);
console.log(p.up());
console.log(p.down());
console.log(p.down());
console.log(p.down());
console.log(p.down());