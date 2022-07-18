<template>
    <h1>선언적 렌더링</h1>
    {{message}}
    <h3 v-text="message"> </h3>
</template>

<script>
export default {
    data(){
        return {message: "Vue3 Programming"}
    }
}
</script>

<style>

</style>