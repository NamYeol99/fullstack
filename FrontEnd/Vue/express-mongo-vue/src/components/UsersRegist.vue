<template>
    <div>
    <form id="user-form">
    <fieldset>
        <legend>사용자 등록</legend>
        <div><input id="username" type="text" placeholder="이름"></div>
        <div><input id="age" type="number" placeholder="나이"></div>
        <div><input id="married" type="checkbox"><label for="married">결혼 여부</label></div>
        <button type="submit">등록</button>
    </fieldset>
    </form>
</div>
</template>

<script>
export default {
    setup(){
        document.getElementById('user-form').addEventListener('submit', async (e) => {
            e.preventDefault();
            const name = e.target.username.value;
            const age = e.target.age.value;
            const married = e.target.married.checked;
            if (!name) {
                return alert('이름을 입력하세요');
            }
            if (!age) {
                return alert('나이를 입력하세요');
            }
            try {
                await axios.post('/users', { name, age, married });
                getUser();
            } catch (err) {
                console.error(err);
            }
            e.target.username.value = '';
            e.target.age.value = '';
            e.target.married.checked = false;
            });
    }
}
</script>

<style>

</style>