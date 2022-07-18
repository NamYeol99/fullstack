<template>
	<h1>component create</h1>
	<div id="app">
		<!-- <p>{{title}}</p> -->
		<counter></counter>
		<counter></counter>
		<counter></counter>
	</div>
</template>

<script>

import { createApp, ref } from '@vue/runtime-dom'
const app = createApp({})
	app.component('my-counter', {
		inject:['counter_header'],
		setup(){
			const count = ref(0)
			return {count}
		},templete: `
			<span> {{ create_head }} </span>
			<button @click = "count++" v-text="count"></button>
			<hr>
			`
	})
	// app.config.globalProperties.title = 'Vue 3 Demo'
	// app.provide('counter_header', 'counter' )
	app.mount('#app')
export default {
}
</script>

<style>

</style>