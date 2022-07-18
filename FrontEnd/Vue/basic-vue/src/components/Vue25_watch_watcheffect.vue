<template>
  <h1>watch watchEffect</h1>
  <h3>watch는 개발자가 코드로 지정한 변수값의 변화를 감시하는 것, 
    콜백함수를 이용하여 부가적인 작업을 추가할 수 있다.</h3>
  
  <p>{{ count_o }}</p>
  <button @click="count_o++">Optioins API 카운트 증가</button>
  
  <p>{{ count_c_1 }}</p>
  <button @click="count_c_1++">Composition API 1st 카운트 증가</button>
  
  <p>{{ count_c_2 }}</p>
  <button @click="count_c_2++">Composition API 2nd 카운트 증가</button>
  
  <p>상태: {{state}}</p>
  <button @click="onStop()">watchEffect 중지</button>
</template>

<script>
import { ref, watch, watchEffect } from '@vue/runtime-core';
export default {
  // Options API
  data(){
    return {count_o : 0,}
  },
  watch: {
    count_o: function(cur, prev){
      console.log(`Options API Watch:  ${prev} ==> ${cur} `);
    },
  },

  // Composition API
  setup(){
    const count_c_1 = ref(0)
    const count_c_2 = ref(0)
    const state = ref('실행중')
    watch(
      count_c_1, function(cur, prev) {
        console.log(`Composition API Watch: ${prev} ==> ${cur}`)
      }, {immediate: true,} //immediate:true 초기값부터 변화(undefined->0) 파악함.
    )
    watch(
      [count_c_1,count_c_2], function(cur, prev) {
        console.log(`Composition API Multiple Watch: ${prev} ==> ${cur}`);
      }
    )
    //watchEffect 불필요한 변수를 감시하지 않고 콜백함수에서 참조되는 변수만 감시
    const stop = watchEffect(
      function() {
        console.log(`Composition API WatchEffect Called : ${count_c_2.value}`);
      },{flush: 'post',} // pre : dom이 업데이트 전에 콜백함수를 호출
                         // post: dom이 업데이트 후에 콜백함수를 호출
    )
    const onStop = function(){
      state.value = '중지'
      stop() //watchEffect를 할당받은 stop을 stop()함수로 호출하면 watchEffect는 중단
    }
    return {count_c_1, count_c_2, state, onStop,}
  },
}
</script>

<style>

</style>