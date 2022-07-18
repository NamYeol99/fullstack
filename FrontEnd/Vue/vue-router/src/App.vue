<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <router-link to="/" class="nav-link active" >Home</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/portfolio" class="nav-link">portfolio</router-link>
        </li>
        <li>
            <router-link to="/Join" class="nav-link">Join</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/login" class="nav-link">Login</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/about" class="nav-link">About</router-link>
        </li>

        
      </ul>
      
    </div>
  </div>
</nav>
<router-view/>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    // HelloWorld
  }
}
</script>

<style>
ul{
  list-style: none;
}
li{
  display: inline-block; width:150px;
}
#app {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
@import '../public/css/bootstrap.min.css';
</style>
