const express = require('express');
const app = express();

//port가 env에 없을 때 3000번으로 기본 세팅
app.set('port', process.env.PORT || 3000);
// app.set('prot', process.env.PORT ??= 3000);
app.use(express.static('public'))

// request(요청)가 들어올 때
app.get("/", (req,res) => {
    res.send('<h1>Hello Express</h1>');
});


// server가 요청 대기 상태로 전환
const PORT = app.get('port');
app.listen(PORT, () => {
    console.log(`asdasd`);
})
// const PORT = 3000;
// app.listen(app.get('port'), () =>{
//     console.log(`http://127.0.0.1:${PORT} 포트에서 대기중...`);
// })