<template>
  <div class="container">
    <div class="col-md-5 mx-auto">
      <div class="myform form">
        <h1>Login</h1>
        <form action="/" ref="frm">
            <label for="id">ID</label>
            <input
              type="text"
              name="id"
              ref="id"
              class="form-control"
              id="id"
              placeholder="아이디를 입력하세요"
            />
            <label for="pass">Password</label>
            <input
              type="password"
              name="pass"
              id="pass"
              ref="pass"
              class="form-control"
              placeholder="패스워드를 입력하세요  "
            />
            <button
              ref="btnLogin"
              @click.prevent="Login"
              class="btn btn-block mybtn btn-primary tx-tfm"
            >
              Login
            </button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import { ref } from "@vue/reactivity";
export default {
  name: "ToLogin",
  setup() {
    const frm = ref("");
    const id = ref(null);
    const pass = ref(null);
    function Login() {
      if (id.value.value == "") {
        alert("아이디를 입력하세요");
        id.value.focus();
      } else if (pass.value.value == "") {
        alert("패스워드를 입력하세요");
        pass.value.focus();
      } else {
        frm.value.submit();
      }
    }
    return { Login, frm, id, pass };
  },
};
</script>

<style>
a {
  text-decoration: none !important;
}
h1,
h2,
h3 {
  font-family: "Kaushan Script", cursive;
}
.myform {
  position: relative;
  display: -ms-flexbox;
  display: flex;
  padding: 1rem;
  -ms-flex-direction: column;
  flex-direction: column;
  width: 100%;
  pointer-events: auto;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 1.1rem;
  outline: 0;
  max-width: 500px;
}
.tx-tfm {
  text-transform: uppercase;
}
.mybtn {
  border-radius: 50px;
  margin-top: 10px;
  margin-right: 10px;
}
.login-or {
  position: relative;
  color: #aaa;
  margin-top: 10px;
  margin-bottom: 10px;
  padding-top: 10px;
  padding-bottom: 10px;
}
.span-or {
  display: block;
  position: absolute;
  left: 50%;
  top: -2px;
  margin-left: -25px;
  background-color: #fff;
  width: 50px;
  text-align: center;
}
.hr-or {
  height: 1px;
  margin-top: 0px !important;
  margin-bottom: 0px !important;
}
.google {
  color: #666;
  width: 100%;
  height: 40px;
  text-align: center;
  outline: none;
  border: 1px solid lightgrey;
}
form .error {
  color: #ff0000;
}
#second {
  display: none;
}
.container {
  margin-top: 20px;
}
</style>