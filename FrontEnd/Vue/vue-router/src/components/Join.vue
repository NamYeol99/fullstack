<template>
<div class="container">
  <div class="col-md-5 mx-auto">
    <div class="myform form">
  <h1>Join</h1>
  <form action="/" ref="frm" method="get">
    <fieldset>
      <legend>회원가입</legend>
        <div>
          <label for="id" class="title">ID</label>
          <input type="text" ref="id" id="id" name="id" placeholder="아이디"/>
          <span id= "id-check">5자 이상의 글자를 입력하세요</span>
        </div>
        <div>
          <label for="name" class="title">Name</label>
          <input type="text" ref="name" id="id" name="name" placeholder="이름"/>
        </div>
        <div>
          <label for="pass" class="title">Password</label>
          <input type="password" ref="pass" id="pass" name="pass" placeholder="비밀번호"/>
        </div>
        <div>
          <label for="repass" class="title">Re Password</label>
          <input type="password" ref="repass" id="repass" name="repass" placeholder="비밀번호 재확인"/>
        </div>
        <div>
          <label class="title">Hobby</label>
          <label :for="item" v-for="(item, i) in hobbyList" :key="i">
            {{ item
            }}<input
              type="checkbox"
              name="hobby"
              :id="item"
              :ref="item"
              :value="item"
              v-model="hobby"
            />
          </label>
        </div>
        <div class="label-input">
          <label class="title">Gender</label>
          <label :for="item" v-for="(item, i) in genderList" :key="i">
            {{ item
            }}<input
              type="radio"
              :name="gender"
              :id="item"
              :ref="item"
              :value="item"
              v-model="gender"
            />
          </label>
        </div>
        <div class="label-input">
          <label for="id" class="title">mobile</label>
          <select v-model="mobile" ref="m1" id="mobile" name="mobile">
            <option :value="item" v-for="(item, i) in mobileList" :key="i">
              {{ item }}
            </option>
          </select>
          - <input type="text" name="mobile1" ref="m2" class="m" /> -
          <input type="text" name="mobile2" ref="m3" class="m" />
          <input type="hidden" name="mobile" ref="mobile" />
        </div>
        <div class="label-input">
          <label class="title"></label>
            <button ref="btnJoin" @click.prevent="join" class="btn btn-block mybtn btn-primary tx-tfm">
              가입
            </button>
            <button @click.prevent="cancel" class="btn btn-block mybtn btn-primary tx-tfm">
              취소
            </button>

      </div>
    </fieldset>
  </form>
    </div>
  </div>
</div>
</template>

<script>
import { reactive, ref } from "@vue/reactivity";
export default {
  name: "ToJoin",
  setup() {
    const hobby = reactive([]);
    const hobbyList = reactive(["축구", "배구", "농구"]);
    const gender = "남";
    const genderList = reactive(["남", "여"]);
    const mobile = "010";
    const mobileList = reactive(["010", "011", "016"]);
    const frm = ref("");
    const name = ref(null);
    const repass = ref(null);
    const m2 = ref(null);
    const m3 = ref(null);
    const id = ref(null);
    const pass = ref(null);
    function join() {
        if(id.value.value.length < 5){
            document.querySelector('#id-check').style.display="block"
            
            id.value.focus();
        }
        else if (id.value.value == "" ) {
            alert("아이디를 입력하세요");
            id.value.focus();
        }
        else if (id.value.value.length>=5 && name.value.value == ""){
            document.querySelector('#id-check').style.display="none"
            alert("이름을 입력하세요");
            name.value.focus();
        
        } else if (name.value.value == "") {
            name.value.focus();
        } else if (pass.value.value == "") {
            alert("패스워드를 입력하세요");
            pass.value.focus();
        } else if (repass.value.value == "") {
            alert("패스워드를 확인하세요");
            repass.value.focus();
        } else if (pass.value.value != repass.value.value) {
            alert("비밀번호가 맞지 않습니다");
            pass.value.focus();
        } else if (m2.value.value == "" || m2.value.value.length != 4) {
            alert("전화번호를 확인하세요");
            m2.value.focus();
        } else if (m3.value.value == "" || m3.value.value.length != 4) {
            alert("전화번호를 확인하세요");
            m3.value.focus();
        } else {
            alert("회원가입이 완료 되었습니다.")
            frm.value.submit();
        }
        }
    return {
      join,
      frm,
      id,
      name,
      pass,
      hobby,
      hobbyList,
      gender,
      genderList,
      mobile,
      mobileList,
      repass,
      m2,
      m3,
    };
  },
};
</script>

<style>
#id-check{
    display: none;
    color: red;
}
.title {
  display: inline-block;
  width: 120px;
  margin: 5px;
  text-align: left;
}
fieldset div {
  text-align: left;
}
.m {
  width: 50px;
}
.btn-margin {
  margin: 5px 10px;
  border-radius: 15px;
}
fieldset {
  width: 330px;
  margin: 0 auto;
}
.label-input{
  margin-bottom: 10px;
}
</style>