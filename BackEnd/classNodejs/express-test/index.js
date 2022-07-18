const express = require('express');
const path = require('path');

const app = express();
app.set('port', process.env.PORT || 3000);
app.use(express.static('public'))
app.get("/", (req,res) => {
    console.log(__dirname);
    res.send(path.join(__dirname, './index.html'));
});

// const PORT = 3000;
// app.listen(app.get('port'), () =>{
//     console.log(`http://127.0.0.1:${PORT} 포트에서 대기중...`);
// })
const PORT = app.get('port');
app.listen(PORT, () => {
    console.log(`Server running at http://127.0.0.1:${PORT}/`);
})