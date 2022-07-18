<template>
  <h1>v-on key event</h1>
  <!-- <input type="submit" value="Send" v-on:keyup.enter="send"> -->
  <input type="submit" value="Send" v-on="{ 'keyup.enter':send, click:send }">
  enter키와 클릭할 때 반응<br>
  
  <input type="text" v-on:keyup='keyPressed1($event)'>
  모든 키 반응 String.fromCharCode()으로 숫자와 알파벳만 문자로 변환<br>

  <input type="text" v-on:keyup.page-down='keyPressed2($event,"Page Down")'>
  String.fromCharCode() 미적용 특정키 만 반응(page down)<br>

  <input type="text" v-on:keyup.alt.shift="onMix1" > 
  alt shift exact => working, alt shift exact no => working<br>

  <input type="text" v-on:keyup.exact.alt.shift="onMix1"
    v-on:keyup.exact.page-up="onMix2"> 
  alt shift exact, page-up exact => onMix1 <br>

  <input type="text" v-on:keyup.exact.alt.shift="onMix1"
    v-on:keyup.page-up="onMix2"> 
  alt shift exact, page-up no => 
  alt shift 다른 키 onMix1 작동, alt shift pageup onMix1과 onMix2 동시 작동 <br>

  <input type="text" v-on:keyup.alt.shift="onMix1"
    v-on:keyup.exact.page-up="onMix2"> 
  alt shift no, page-up exact => onMix1만 동작, pageup만 누를 때 onMix2 동작   <br> 
  
  alt shift no, page-up no => not working<br>
  <!-- <input type="text" v-on:keyup.alt.shift="onMix1" v-on:keyup.page-up="onMix2"> -->
  태생적으로 ctrl, alt, shift는 다른키와 함께 동작하기 때문에 단독으로는 동작을 하지 않는다.
  하지만 다른키와 같이 누를 경우 exact를 붙이든 안 붙이든 함수는 동작한다.
  일반 키에 exact를 붙일 경우 키가 동작하기 때문에 함수는 동작한다.동작이 된다.
  ctrl, alt, shift에 exact를 붙이고 다른 키에 exact를 붙일 경우 같이 동작되면 
  ctrl, alt, shift의 함수가 동작한다.
  하지만, 다른 키에 안 붙일 경우는 두 군데 붙은 함수가 두번 동작하게 된다.
  둘다 안 붙을 수는 없다. 왜냐면 키는 한번 누를 때마다 동작하는데 동시 누르면 동작안한다.
  <input type="text" v-on:keyup.meta="onMeta"> meta

</template>

<script>
export default {
  methods: {
    send() {console.log('enter key가 눌러졌습니다.')},
    keyPressed1(e) {console.log(String.fromCharCode(e.keyCode)+' is pressed')},
    keyPressed2(e,caption) {console.log(caption+"("+(e.keyCode)+') is pressed')},
    onMix1() {console.log("1복합 클릭했어요");},
    onMix2() {console.log("2복합 클릭했어요");},
    onMeta() {console.log("윈도우키를 누르고 키를 눌렀어요");},
  }
}
</script>

<style>

</style>