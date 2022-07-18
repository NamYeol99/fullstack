const express = require('express')
const path = require('path')

const app = express()
const _path = path.join(__dirname, './dist')  
app.set('port', process.env.PORT ??= 12010)
app.use(express.static(_path))

const PORT = app.get('port')
app.listen(PORT, () => {
    console.log(`Server http://127.0.0.1:${PORT}/`)
    console.log(`http://127.0.0.1:${PORT}/join`)
    console.log(`http://127.0.0.1:${PORT}/login`)
    console.log(`포트asdad폴리오 서버가 시작됩니다. ${PORT}!`)
})
app.use(express.static(_path))     
// app.listen(PORT, ()=> console.log(`포트폴리오 서버가 시작됩니다. ${PORT}!`))
