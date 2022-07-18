<template>
	<h1>computed</h1>
	<h3>ref, reactive, watcher 모두 실시간으로 데이터의 변경을 반영하지만
		특별히 계산된 속성을 반영하고자 할 때 사용
	</h3>
	<h2>Small Items</h2>
	<p v-for="item in small_items_o" :key="item.id">{{item.text}}</p>
	<p v-for="item in small_items_c" :key="item.id">{{item.text}}</p>
	<h2>Big Items</h2>
	<p v-for="item in big_items_o" :key="item.id">{{item.text}}</p>
	<p v-for="item in big_items_c" :key="item.id">{{item.text}}</p>
</template>

<script>
import { reactive,computed } from '@vue/reactivity'
export default {
	// Options API
	data(){
		return {
			arr: [
				{id: 1, text: '1번 옵션 아이템'},
				{id: 2, text: '2번 옵션 아이템'},
				{id: 3, text: '3번 옵션 아이템'},
				{id: 4, text: '4번 옵션 아이템'},
				{id: 5, text: '5번 옵션 아이템'},
			]
		}
	},
	computed: {
		small_items_o() {
			return this.arr.filter(function(item) { return item.id < 3})
		},
		big_items_o(){
			return this.arr.filter(item => item.id >= 3)
		}
	},
	//Composition API
	setup(){
		const arr = reactive([
			{id: 1, text: '1번 옵션 아이템'},
			{id: 2, text: '2번 옵션 아이템'},
			{id: 3, text: '3번 옵션 아이템'},
			{id: 4, text: '4번 옵션 아이템'},
			{id: 5, text: '5번 옵션 아이템'},
		])
		const small_items_c = computed(() => {
			return arr.filter(function(item){
				return item.id < 3
			})
		})
		const big_items_c = computed(function() {
			return arr.filter(function(item){
				return item.id >= 3
			})
		})
		return {small_items_c,big_items_c}
	},
}
</script>

<style>

</style>