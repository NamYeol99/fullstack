<template>
  <h1>Join</h1>
  <form action="Vue20_memberList.vue" ref="frm">
      <fieldset>
          <legend>회원가입</legend>
          <div>
              <label for="id" class ="title">ID</label>
              <input type="text" ref="id" id="id" >
          </div>
          <div>
              <label for="name" class ="title">Name</label>
              <input type="text" ref="name" id="id" >
          </div>
          <div>
              <label for="pass" class ="title">Password</label>
              <input type="password" ref="pass" id="pass">
          </div>
          <div>
              <label for="repass" class ="title">Re Password</label>
              <input type="password" ref="repass" id="repass">
          </div>
          <div>
            <label class ="title">Hobby</label>
            <label :for="item" v-for="(item, i) in hobbyList" :key="i" >
                {{item}}<input type="checkbox" name="hobby" :id="item" :ref="item" :value="item" v-model="hobby">
            </label>
          </div>
          <div>
              <label class ="title">Gender</label>
              <label :for="item" v-for="(item, i) in genderList" :key="i" >
                {{item}}<input type="radio" :name="gender" :id="item" :ref="item" :value="item" v-model="gender">
              </label>
          </div>
          <div>
              <label for="id" class ="title">mobile</label>
              <select v-model="mobile" ref="m1" id="mobile">
                  <option :value="item" v-for="(item,i) in mobileList" :key="i">{{item}}</option>
              </select> -
              <input type="text" name="mobile1" ref="m2" class="m"> - 
              <input type="text" name="mobile2" ref="m3" class="m">
              <input type="hidden" name="mobile" ref="mobile">
          </div>
          <div>
              <label class ="title"></label>
              <button ref="btnJoin" @click="join" class="btn-margin">가입</button>
              <button ref="btnCancel" @click.prevent="cancel">취소</button>
          </div>
      </fieldset>
  </form>

</template>

<script>
export default {
    data: () => ({
        hobby: [],
        hobbyList:['축구','배구','농구'],
        gender:'남',
        genderList: ['남', '여'],
        mobile:'010',
        mobileList:['010','011','016']

    }),
    methods:{
        cancel(){
            // const frm = this.$refs.frm
            // const radioFemale = this.$refs.남           
            this.$refs.frm.reset()
            document.querySelector("#남").checked = true // 단순히 document의 값을 초기화
            
        },
        join(e){
            e.preventDefault();
            const gender = this.$refs.item
            const frm = this.$refs.frm
            const id = this.$refs.id       
            const name = this.$refs.name            
            const pass = this.$refs.pass         
            const repass = this.$refs.repass       
            const m1 = this.$refs.m1
            const m2 = this.$refs.m2
            const m3 = this.$refs.m3
            // const mobile = this.$refs.mobile
            console.log(gender);
            if(id.value==""){
                alert("아이디를 입력하세요")
                id.focus()
            }
            else if(name.value==""){
                alert("이름을 입력하세요")
                name.focus()
            }
            else if(pass.value==""){
                alert("패스워드를 입력하세요")
                pass.focus()
            }
            else if(repass.value==""){
                alert("패스워드를 확인하세요")
                repass.focus()
            }
            else if(pass.value != repass.value){
                alert("비밀번호가 맞지 않습니다")
                pass.focus()
            }
            else if(m1.value==""){
                alert("전화번호를 확인하세요")
                m1.focus()
            }
            else if(m2.value==""){
                alert("전화번호를 확인하세요")
                m2.focus()
            }
            else if(m3.value==""){
                alert("전화번호를 확인하세요")
                m3.focus()
            }
            // else if(mobile.value==""){
            //     alert("asd")
            //     mobile.focus()
            // }
            else{
                frm.submit();
            }
            
       }
    }
}
</script>

<style>
    .title{
        display: inline-block; width:120px; margin: 5px; text-align: left;
    }
    fieldset div {
        text-align: left;
    }
    .m {width:50px;}
    .btn-margin {
        margin: 5px 10px;
    }
</style>