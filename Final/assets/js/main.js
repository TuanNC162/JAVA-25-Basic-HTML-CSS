$(document).ready(function(){

    $('.owl-carousel').owlCarousel({
      loop:true, //Vong lap
      margin:24, //Khoang cach giua cac phan tu
      nav:true, //Thanh dieu huong
      dots: true, //Dau cham dieu huong
      autoplay: true, //Silde tu dong chay
      autoplaytimeout: 3000, //don vi ms - quy dinh tgian chay silde
      responsive:{  //Hien thi so items theo man hinh
          0:{
              items:4
          },
          600:{
              items:4
          },
          1000:{
              items:4
          }
      }
  })
  
    });