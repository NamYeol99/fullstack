<template>
	<h1>{{title}}</h1>
	<div class="noti">
		<b>{{notiNum}}</b>
		<span class="info">That's an error.</span><br>
		The requested URL  <span class="warn">{{wrongAddress}}</span>
		was not found on this server. <br>
		<span class="info">That's all we know.</span>
	</div>
</template>

<script>
import { ref } from '@vue/reactivity'
export default {
	name: 'NotFound',
	setup(){
		const title = ref('NotFound')
		const wrongAddress = getUrl(decodeURI(window.location.href))
		const notiNum ='404'

		function getUrl(str){
			// http://localhost:8080/hello
			const tmp = str.substring(str.indexOf(':')+3)
			return tmp.substring(tmp.indexOf("/"))
		}
		return {title,wrongAddress,notiNum}
	}
}
</script>

<style>

</style>