//error를 then으로 처리하는 두번째방법
const async1 = (param) => {
  return new Promise((reslove, reject) => {
    reslove(param * 2);
  });
};
const async2 = (param) => {
  return new Promise((reslove, reject) => {
    throw "error occurred";
    reslove(param * 2);
  });
};
async1(1)
  .then(async2)
  .then((result) => {
    throw "error fullfiled state";
    console.log(result);
  })
  .catch((reason) => {
    console.log(`이 Promise는 ${reason}으로 종료!`);
  })
  .finally(() => {
    console.log(`무조건 실행되는 finally`);
  });
