<template>
  <h1>v-once</h1>
  <span v-once>다시는 변경되지 않습니다.{{msg}}</span><br>
  <span>변경이 잘 됩니다.{{msg}}</span><br>
  <input type="text" v-model="msg" />
  
</template>

<script>

export default {
    // data(){
    //     return {"msg": "v-once 이기 때문이죠"}
    // },
    data: () => ({"msg": "v-once이기 떄문이져"}),
}
</script>

<style>

</style>