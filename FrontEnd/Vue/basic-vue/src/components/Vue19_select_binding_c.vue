<template>
  <h1>select binding Composition API 방식 (Vue3.X)</h1>
  select는 바인딩을 할 때 option의 value에 binding을 한다.
  <select name="selItem" ref="selItem" id="selItem" v-model="selected" v-on:change="selChange">
    <option value="반지">ring</option>
    <option value="목걸이">necklace</option>
    <option value="귀걸이">earring</option>
    <option value="시계">watch</option>
    <option value="팔찌">bracelet</option>
  </select><br>
  <span>{{selected}} / {{selectText}}</span><br>
  <span>{{selected}} / <span ref="selText" id="selText"></span></span>
</template>

<script>
import {onMounted, ref } from '@vue/runtime-core';
export default {
  // Composition API 방식 :: Vue3.X
  setup() {
    const selItem = ref(null)
    const selText = ref(null)
    console.log(selItem);
    console.log(selText);
    const selected = '반지'
    const selectText = ref('')
    
    // 첫 화면에 select의 text를 들고오기 위한 함수
    const getSelText= function() {
      // console.log(selItem);
      selChange()
    }

    //select 변결될 때 마다 동작하는 함수
    const selChange = function(){
      const tmp = selItem.value.options[selItem.value.selectedIndex].text;
      selectText.value = tmp
      selText.value.textContent = tmp
    }
    onMounted(() =>{
      getSelText()
    })
    return {
     selItem, selText, selected, selectText, getSelText, selChange
    }
    
  }, 
}
</script>

<style>

</style>