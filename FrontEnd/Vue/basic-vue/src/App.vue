<template>
  <img alt="Vue logo" src="./assets/logo.png" width="50"/>
  <h1>Vue 3 Exercise</h1>
  <hr>
  <div class="asd">
    <div v-bind:class="classCard" v-for="(component,i) in arrList" :key="i">
    <span>{{i+1}}번</span>
      <component v-bind:is="component"></component>
    </div>
  </div>
  <Footer :class="classFooter" msg="Footer for Your Vue.js App" />
</template>

<script>
import Exercise01 from './components/Vue01_data.vue'
import Exercise02 from './components/Vue02_vtext_vhtml.vue'
import Exercise03 from './components/Vue03_vbind.vue'
import Exercise04 from './components/Vue04_vonce.vue'
import Exercise05 from './components/Vue05_vshow.vue'
import Exercise06 from './components/Vue06_vif.vue'
import Exercise07 from './components/Vue07_vfor.vue'
import Exercise08 from "./components/Vue08_von.vue"
import Exercise09 from "./components/Vue09_von_event.vue"
import Exercise10 from "./components/Vue10_von_keyEvent.vue"
import Exercise11 from "./components/Vue11_von_mouseEvent.vue"
import Exercise12 from "./components/Vue12_von_capture_self.vue"
import Exercise13 from "./components/Vue13_checkbox.vue"
import Exercise14 from "./components/Vue14_radio.vue"
import Exercise15 from "./components/Vue15_select.vue"
import Exercise16 from "./components/Vue16_checkbox_binding.vue"
import Exercise17 from "./components/Vue17_radio_binding.vue"
import Exercise18 from "./components/Vue18_select_binding_o.vue"
import Exercise19 from "./components/Vue19_select_binding_c.vue"
import Exercise20 from "./components/Vue20_form_element_join.vue"
import Exercise21 from "./components/Vue21_o_c_ref_reactive.vue"
import Exercise22 from "./components/Vue22_scriptsetup.vue"
import Exercise23 from "./components/Vue23_vpre.vue"
import Exercise24 from "./components/Vue24_computed.vue"
import Exercise25 from "./components/Vue25_watch_watcheffect.vue"

import Footer from "./components/Vue_Footer.vue"

export default {
  name: "App",
  components: {
    Exercise01, Exercise02,Exercise03, Exercise04, Exercise05, Exercise06,
    Exercise07, Exercise08,Exercise09, Exercise10, Exercise11, Exercise12,
    Exercise13, Exercise14, Exercise15, Exercise16, Exercise17, Exercise18,
    Exercise19, Exercise20, Exercise21, Exercise22, Exercise23, Exercise24,
    Exercise25,
    Footer
  },
  data(){
    return{
      arrList: [
        Exercise01, Exercise02,Exercise03, Exercise04,Exercise05, Exercise06,
        Exercise07, Exercise08,Exercise09, Exercise10,Exercise11, Exercise12,
        Exercise13, Exercise14,Exercise15, Exercise16, Exercise17, Exercise18,
        Exercise19, Exercise20, Exercise21, Exercise22, Exercise23, Exercise24,
        Exercise25, 
      ],
      classCard:"card",
      classFooter:"footer",

    }
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.card {
  border: 1px solid black;float:left;margin: 5px;
  width: 500px; height: 400px; overflow: scroll;
}
.asd{
  margin-left:180px;
}
.footer{
  height:200px;margin: 0;background-color: rgb(220, 220, 220);
  line-height: 190px;padding-left: 50px; font-weight: bold;  clear:both;
}

</style>
