

<!-- <template>
  <h1>Options API methods</h1>
  <button @click="addOne">Add</button><br>
  <span ref="result">count is:</span>
</template>

<script>

export default {
    data(){
        return {count :0}
    },
    methods:{
        addOne: function(){
            this.$refs.result.textContent = `count is: ${this.count++}`
        }
    }
    
}
</script> -->
<!-- <template>
  <h1>Composition API ref</h1>
  ref는 자바스크립트의 기본형을 반응혁적인 가변 참조 객체로 만듦
  <button @click="addOne">Add</button>
  <span ref="result">count is: </span>
</template>
<script>
import {ref} from '@vue/reactivity';
// import { onMounted } from '@vue/runtime-core';
export default {
    setup(){
        // state data
        const count = ref(0) // count 변수를 0으로 초기화

        // refs
        const result = ref(null) // null로 초기화 후 return 하면서 span 객체로 돌려줌

        // methods
        function addOne(){
            result.value.textContent = `count is ${count.value++}`
        }
        return {
            count, result, addOne
        }
    }
}
</script> -->
<template>
  <h1>Composition API reactive</h1>
  reactive는 객체를 반응형으로 만듦<br>
  <button @click="addOne">Add</button><br>
  <span ref="result">count is: </span>
</template>
<script>
import {ref,reactive } from '@vue/reactivity';
// import { onMounted } from '@vue/runtime-core';
export default {
    setup(){
        // 복수계의 변수를 하나의 변수로 리턴 하고자 할 때
        const state = reactive({
            count: '0'
        })
        const result = ref('')
       
        // const result = ref(null) // null로 초기화 후 return 하면서 span 객체로 돌려줌
        function addOne(){
            // result.value.textContent = `count is ${state.count++}`
            result.value.textContent = `count is ${state.count++}`
        }
        return {
            state,result,addOne
        }
    }
}
</script>
