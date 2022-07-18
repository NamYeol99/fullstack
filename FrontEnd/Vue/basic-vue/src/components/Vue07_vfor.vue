<template>
    <h1>v-for</h1>
    Which of the following cities if your favourite?
    <ul>
        <li v-for="(item,idx) in list" :key='idx'>{{idx+1}}. {{item}}</li>
    </ul>
    <span v-for="(dan,i) in dan" :key='i'>
        <span v-for="(nums,j) in nums" :key='j'>
        {{dan}} * {{nums}} = {{dan*nums}} <br>
    </span><br>
    </span> -->
    <!-- <ul>
        <li v-for="(dan,i) in dan" :key='i'>
            <ul><li v-for="(nums,j) in nums" :key='j'>
                {{dan}} * {{nums}} = {{dan * nums}}
            </li></ul>
        
        </li>
    </ul> -->
</template>

<script>
export default {
    data(){
        return {
            list:['Busan', 'Seoul', 'Changwon', 'Pohang', 'Incheon'],
            nums:[1,2,3,4,5,6,7,8,9],dan:[2,3,4,5,6,7,8,9]
        }

    }
}
</script>

<style>
    ul{
        list-style-type: none;
    }
</style>