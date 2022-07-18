<template>
  <h1>v-on capture, self</h1>
  <div v-on:click.capture="doTop" id="top">
    <div v-on:click.capture="doMiddle" id="middle">
        <button type="button" v-on:click="doBottom">Bubble</button>
    </div>
  </div>
  stop은 자신만 이벤트를 실행할 경우<br>
  capture는 자신보다 부모가 먼저 실행해야 하는 경우 부모에 capture를 붙인다.<br>
<br><br><br>
=========================self=========================
  <div v-on:click="doTop" id="top">
    <div v-on:click.self="doMiddle" id="middle">
        <button type="button" v-on:click="doBottom">Bubble</button>
    </div>
  </div>
self는 자신이 직접 발생한 이벤트만 처리 <br>
</template>

<script>
export default {
    methods:{
        doTop(){ console.log('Top 이벤트 발생.') },
        doMiddle(){ console.log('Middle 이벤트 발생') },
        doBottom(){ console.log('Bottom 이벤트 발생') }
    }
}
</script>

<style>
#top{
    width:200px; height: 200px; background: pink;
}
#middle{
    width:100px; height: 100px; background: greenyellow;
}

</style>