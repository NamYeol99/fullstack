<template>
  <h1>v-on $event</h1>
  <form action="http://127.0.0.1:8080" method="post">
  <button type="submit" @click="warning('Warning!!', $event)">Warning</button>
   </form>
</template>

<script>
export default {
    methods: {
        warning(msg, e){
            // e가 존재한다 -> $event를 통해서 native Event에 접근 가능
            if(e) e.preventDefault();
            alert(e)
            alert(msg)
        }
    }
}

</script>

<style>

</style>