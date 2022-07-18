const express = require('express')
const path = require('path')
const loogger = require('morgan')
const fs = require('fs')
const bodyParser = require('body-parser')

const app = express()
const PORT = 12010
const simple_module = require('./simple_module.js')
const _path = path.join(__dirname, './dist')
console.log(_path);

app.use(loogger('tiny'))
app.use(bodyParser.json())
app.use(bodyParser.urlencoded( {extends: true} ))
app.use('/dist', express.static(_path))
app.use((req, res, next) => {console.log('요청이 왔네요~ 지나갑니다~');next()})
//request(요청)가 들어올 때
app.get('/book/:bookName', (req, res) => {
  const {bookName} = req.params
  res.send(`안녕하세요 LifeisGoodandHappy서점입니다. ${bookName}을 주문하셨네요`)
})
app.get('/join',(req, res) => {
  fs.readFile('./dist/join.html', function(error, data){
    res.writeHead(200, {'Content-Type':'text/html'})  
    res.end(data)
  })  
})
// npm install body-parser 해서 라이브러리 추가
app.post('/joinfrm',(req, res) => {
  const {body: {id, name, pass}} = req;
  console.log(`회원Id : ${id}, 회원명: ${name}, 비밀번호 : ${pass}`);
})
app.get("/", simple_module.index)
app.get('/users/:userName/book/:bookName',simple_module.handleBook)

// 서버가 실행 상태로 전환.
app.listen(PORT, () => {
  console.log(`Server Running at http://127.0.0.1:${PORT}/`);
})