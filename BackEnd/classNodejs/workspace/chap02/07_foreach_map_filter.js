arr = new Array(10);
        for (let i=0; i<arr.length; i++){
            arr[i]=i;
        }
        console.log(arr.toString());
        console.log(arr.valueOf()); // console.log(arr)과 동일결과
        var isEven = function(value){
            // console.log(value % 2===0?value:'홀수');
            // return value % 2 === 0?value:'홀수';
            return value %2 === 0;
        }

        // var newArr = arr.map(isEven); // 콜백함수의 변경결과로 새로운 배열 반환
        var newArr = arr.filter(isEven); // 콜백함수의 해당원소로 새로운 배열 반환
        console.log(newArr.toString());



        // arr.forEach(isEven); // 콜백함수의 각 원소에 대한 실행만!