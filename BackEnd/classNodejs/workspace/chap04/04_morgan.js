const express = require('express');
const app = express();
const loogger = require('morgan');
const PORT = 3000;
app.use (loogger('tiny'));
app.use((req, res, next) => {
    console.log('1 Time:', Date.now());
    next(); // 현재에 머무리지 않고 다음으로 넘김.
});
//use()를 통해서 web application이 실행될 때 비동기적인 job을 나눠처리함
// 직렬로 처리되는 것 보다 직렬을 나눠서 비동기적으로 처리함으로써 웹앱의 효율 향상.
app.use((req, res, next)=>{
    console.log('2 time:', Date.now());
    next(); // next안에 매개변수를 넣으면 에러 발생
});
app.get("/", (req,res) => {
    // console.log(__dirname);
    res.send('<h1>Hello Express</h1>');
});
//서버가 실행 상태로 전환

app.listen(PORT, ()=>{
    console.log(`서버가 생성되었습니다. http://127.0.0.1:${PORT}`);
});