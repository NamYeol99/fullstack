var express = require("express");
const { route } = require(".");
var router = express.Router();

/* GET users listing. */
router.get("/", function (req, res, next) {
	// res.send("respond with a resource");
  res.render('users/userList', { title: 'userList' });

});
router.get("/join", function (req, res, next) {
  res.render('users/join', { title: 'Join', data: {name: "kny"}});
});
router.get("/login", function (req, res, next) {
  res.render('users/login', { title: 'Login' });
});
router.post("/login", function (req, res, next) {
  
});
module.exports = router;
