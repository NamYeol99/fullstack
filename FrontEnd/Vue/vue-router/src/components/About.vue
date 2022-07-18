<template>
	<h1>{{title}}</h1>

</template>

<script>
import { ref } from '@vue/reactivity'
export default {
	name: "ToAbout",
	setup(){
		const title = ref('About')

		return {title}
	}
}
</script>

<style>

</style>