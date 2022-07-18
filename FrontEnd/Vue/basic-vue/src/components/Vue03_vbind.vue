<template>
<h1>v-bind</h1>
  <div :id="dynamicId">Hello</div>
  <img :src="url+ '200x100'">
  <div :class="[classA, classB]"></div>
  <div :style="[styleA, styleB]"></div>
  <div :="{id:box, 'data-url':url}"></div>
</template>

<script>
export default {
    data(){
        return {
            dynamicId: "first_div", 
            url: "https://via.placeholder.com/",
            classA : "rect",
            classB : "fill",
            styleA : "background:green; border-radius: 50px;",
            styleB : "width:100px;height:100px;",
        }
    }
}
</script>

<style>
    .rect{
        width:100px;height: 100px;
        border: 1px solid red;
    }
    .fill{
        background: blue;
    }

</style>