<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
         
    <title>About Us</title>

    <link th:href="@{/index.css}" rel="stylesheet">
    <link th:href="@{/about.css}" rel="stylesheet">
    <link th:href="@{/footer.css}" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="Stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

    <script src="https://kit.fontawesome.com/effeb5c9fd.js" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/effeb5c9fd.js" crossorigin="anonymous"></script>

    <link rel = "Stylesheet" href="about.css"> <!-- remove line if broken -->
      

    <header>
        <nav class="menu-container"> 
            <div class="menu">
              <ul>
                <li>
                  <a th:href="@{/}">
                    Home
                <li>
                    <a th:href="@{/products}">
                    Products
                  </b>
                </li>
                <li>
                    <a th:href="@{/aboutus}">
                    About
                  </a>
                </li>
                <li>
                    <a th:href="@{/contact}">
                    Contact
                  </a>
                </li>
              </ul>
              <ul>
                <li>
                  <li>
                    <a th:href="@{/login}"><i class="fa fa-fw fa-user"></i> Login</a>
                </li>
        
                  </a>
              </ul>
            </div>
          </nav>
    </header>
</head>

<body>
    <body style="text-align: center; padding-top: 1px">

        <!--About Us Page -->
    <section class=" About Us">
        <h1 id="About Us" >About Us</h1>
        <div class="background">
            <div class="about">
                <div class="story-box">
                    <div class="story-card">
                        <div class="aboutus"> 
                            <!-- <h1> About Us </h1> -->
                            <p> We are Aston Stop. We sell a wide range of products that cater to the needs of students aged 16 and above. The products offered include textbooks, stationery, electronic devices, dorm room essentials, and much more. In addition, we also offer a variety of services such as printing and binding, course material delivery, and a buyback program for used textbooks. With a focus on quality, affordability, and convenience, we have become a popular choice for students at Aston University and beyond.</p>
                            <br>
                            <p>Founded in 2023, Aston Stop delivers premium styling, quality and value to consumers worldwide. With a breadth of collections including men’s, women’s, kids, accessories and footwear. </p>
                            <br>
                            <p>Aston Stop is a national apparel and retail company. With the support of strong national consumer recognition, Aston Stop has built an extensive distribution network in over 10 cities nationwide.</p>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
         </div>
     
        <!--Map-->
        <section class="location"> 
            <iframe src="https://www.google.com/maps/place/8+Coleshill+St,+Birmingham+B4+7BX/@52.4843164,-1.8889544,17z/data=!3m1!4b1!4m6!3m5!1s0x4870bc84c91cdc79:0x6d376e2b8bf26edd!8m2!3d52.4843164!4d-1.8889544!16s%2Fg%2F11q8wzwkv_" width="300" height="200" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
        </section>
        
    </section>
        
    <footer >
          <div class="inside-footer">  
              <div class="row">
              
                      <div class="footer-link">
                          <p id="contact-me">  Aston Stop</p> 
                          <a href="contact" class="link login-link">Contact Us</a></span>
                          <p id="contact-me" > 8 Coleshill St, Birmingham B4 7BX </p>
                          <p id="contact-me"> <u> info@astonstop.com</u></p>
                        </div>
             
                  <div class="professional-links">
                      <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
                      <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
                      <div class="social-links">
                          <a class="social" href="https://twitter.com/vscodetips" target="_blank">
                              <ion-icon name="logo-twitter"></ion-icon>
                          </a>
                      </div>
                      <div class="social-links">
                          <a class="social" href="https://github.com/jonasschmedtmann" target="_blank">
                              <ion-icon name="logo-github"></ion-icon>
                          </a>
                      </div>
                      <div class="social-links">
                          <a class="social" href="https://www.linkedin.com/in/random" target="_blank">
                              <ion-icon name="logo-linkedin"></ion-icon>
                          </a>  
                      </div>
                      <div class="social-links">
                          <a class="social" href="https://www.instagram.com/astonuniversity/" target="_blank">
                              <ion-icon name="logo-instagram"></ion-icon></a>
                      </div>
                  
                      <div class="text-center p-3 text-gold" > All Rights Reserved Aston-Stop & Aston University UK & US 2023 - © 2023 Copyright 
                      </div>
                      </div>
                  </div>
              </div>
          </div>              
    </footer>

</html> 