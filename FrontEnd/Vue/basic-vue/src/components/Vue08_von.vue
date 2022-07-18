<template >
 <span v-on:keyup='keyPressed1($event)'>
  <h1>v-on</h1>
  <!-- <button v-on:click="count++">Add 1</button> -->
  <!-- <button v-on:click="doThis">Add</button> -->
  <button @click="doThis">Add</button>
  <p>위 버튼의 클릭한 횟수는 {{ count }}</p>

  <!-- <input type="text" name="txt" id="txt" @click="reverse" v-bind:value="msg"> -->
  <!-- <input type="text" name="txt" id="txt" @mousedown="reverse" @mouseenter="reverse" v-bind:value="msg" /> -->
 
  <input type="text" name="txt" id="txt" v-bind:value="msg" v-on="{mouseout: reverse, mouseenter :reverse}" />
  <form action="http://127.0.0.1:8080" method="post">
    <!-- ref : 엘리먼트나 자식 컴포넌트에 대한 참조를 등록할 때 사용 -->
    <input type="text" name="name" id="name" ref="yourName">
    <!-- prevnet, stop, once는 각각 적용 가능 -->
    <button @click.prevent.stop.once="isName" type="submit">확인</button>
  </form>
  </span>
</template>
<script>
export default {
  data() {
    return { count: 0, msg: 'Hello Vue3', nameStr: ""};
  },
  methods: {
    keyPressed1(e) {
      const name = this.$refs.yourName;
      if(e.keyCode == 191){
        name.focus()
      }
    },
    doThis() {
      this.count++;
    },
    reverse(){
      this.msg = this.msg.split('').reverse().join("");
    },
    isName(){
      const name = this.$refs.yourName;
      if(name.value === ""){
        alert('name을 확인하여 주세요')
        name.focus()
        return
      }
      else
        alert(name.value)
    }
  },
};
</script>

<style>

</style>