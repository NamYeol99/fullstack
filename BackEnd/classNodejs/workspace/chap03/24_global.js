global.test = "foo";
console.log(test);
console.log(__dirname);
var obj = {
    value: 'hi',
    printThis: function(){
        console.log(this);
    }
}
var print = obj.printThis;
obj.printThis(); // {value: 'hi', printThis: f}
print(); // Window {stop: f, open: f, alert: f, ...}