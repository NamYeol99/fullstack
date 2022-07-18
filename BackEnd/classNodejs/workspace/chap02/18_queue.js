class Queue{
    constructor(){
        this.a= [];
    }
    //비어있는지, 첫번째 큐의 원소를 불러올 때
    front() {
        if(this.a.length ===0){
            console.log("큐가 비었습니다.");
            return;
        } else return this.a[0];
    }
    //data insert
    enqueue(value) {
        this.a.push(value);
    }

    //data pop
    dequeue(){
        if(this.a.length === 0 ){
            console.log("큐가 비었습니다. ");
            return;
        }
        this.a.shift();
    }
    getList(){
        console.log(this.a.toString());
    }
}

const q = new Queue();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);
q.getList();
q.dequeue();
console.log(q.front());

// for (let i = 0; i < 10; i++) {
    
// }