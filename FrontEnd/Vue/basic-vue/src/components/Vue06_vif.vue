<template>
  <h1>v-if</h1>
  <div v-if="Math.floor(Math.random()*45)+1 > 23">
    번호가 큽니다.
	</div>
	<div v-else>
		번호가 작습니다.
	</div>
	당신의 학점은 : <input type="text" v-model="score">
	<div v-if="score>=90">A</div>
	<div v-else-if="score>=80">B</div>
	<div v-else-if="score>=70">C</div>
	<div v-else>F</div>
</template>

<script>
// const num = prompt('당신의 점수를 입력하세요');
export default {
	// data:() => ({
	// 	score: num
	// })
	// data(){
	// 	return {score:num}
	// }
	data : () => {return { score : 0}}
}
</script>

<style>

</style>