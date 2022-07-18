<template>
  <h1>v-show</h1>
  <span>표션식 값을 참-거짓을 기반으로 엘리먼트의 display css 속성을 전환</span><br>
  <span v-show="flag" v-text="msg"></span>
</template>

<script>
const vm = {
    data: function(){ return {msg: 'Notice!!!', flag: 1}},
    methods:{
        toggle(){
            this.flag ^=1
        }
    },
    mounted(){
        setInterval(() => {
            this.toggle()
        },1000);
    }
}

export default vm
    

</script>

<style>

</style>