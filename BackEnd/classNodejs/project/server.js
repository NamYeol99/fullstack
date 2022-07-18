const express = require("express");
const path = require("path");
const loogger = require("morgan");
const fs = require("fs");
const bodyParser = require("body-parser");
const app = express();
const PORT = 12010;
const _path = path.join(__dirname, "./dist");
// console.log(_path);

// app.use(loogger("dev")); 
//로깅에 도움을 주는 미들웨어
//로깅 : 무슨 일이 어디에서 일어났는지를 기록하는 것
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extends: true })); //중첩 객체 사용 허용
app.use(express.static(_path));

app.get("/join", (req, res) => {
  fs.readFile("./dist/join.html", function (error, data) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(data);
  });
});
app.get("/signin", (req, res) => {
  fs.readFile("./dist/login.html", function (error, data) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(data);
  });
});
app.get("/index", (req, res) => {
  fs.readFile("./dist/index.html", function (error, data) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(data);
  });
});
app.post("/signup", (req, res) => {
  const {
    body: { id, name, pass },
  } = req;
  console.log(`회원Id : ${id}, 회원명: ${name}, 비밀번호 : ${pass}`);
  fs.readFile("./dist/index.html", function (error, data) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(data);
  });
});
app.post("/signin", (req, res) => {
  const {
    body: { id, pass },
  } = req;
  console.log(`회원Id : ${id}, 비밀번호 : ${pass}`);
  fs.readFile("./dist/index.html", function (error, data) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(data);
  });
});

// 서버가 실행 상태로 전환.
app.listen(PORT, () => {
  console.log(`Serverno Running at http://127.0.0.1:${PORT}/`);
});
