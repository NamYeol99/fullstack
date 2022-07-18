document.addEventListener("DOMContentLoaded", function(){
  // [].slice.call와 Array.from()은 유사배열이나 iterable object를 배열로 만들어주는 문법
  let lazyImages = [].slice.call(document.querySelectorAll("img.lazy"))
  let active = false;
  const lazyLoad = function(){
    if(active === false) {
      active = true;
      setTimeout(() => {
        lazyImages = lazyImages.map(function(lazyImage) {
          // getBoundingClientRect() 엘리먼트의 크기와 뷰포트에 상대적인 위치정보를 제공
          // window.innerHeight는 웹브라우저를 제외한 다큐먼트의 높이
          // 인자로 전달받은 요소의 모든 CSS 속성값을 담은 객체를 리턴

          // 스크롤되면서 window.innerHeight의 값이 이미지의 top속성보다 커질때
          if(lazyImage.getBoundingClientRect().top <= window.innerHeight
              && window.getComputedStyle(lazyImage).display != "none"){
            lazyImage.src = lazyImage.dataset.src
            lazyImage.classList.add("fadeout")
            lazyImage.classList.add("fadein")
            return null
          } else {
            return lazyImage
          }
        }).filter(function(image) {return image})
        // !lazyImages.length의 값이 0이면 더이상 보여줄 이미지가 없다. 빈배열이 됨
        // 빈배열일 때 removeEventListener가 추가
        // active는 false 값을 가진다.
        if (!lazyImages.length) {
          document.removeEventListener("scroll", lazyLoad)
        } else {
          active = false
        }
      }, 500);
    }
  }
  document.addEventListener("scroll", lazyLoad)
})