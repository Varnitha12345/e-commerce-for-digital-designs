<%@taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>
<layout:extends name="main">
  <layout:put block="headBody" type="REPLACE">
    <title>VARAN Designs</title>
  </layout:put>
  <layout:put block="homeBody" type="REPLACE">

    <!-- Modal -->
    <div class="modal fade bg-white" id="templatemo_search" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg" role="document">
        <div class="w-100 pt-1 mb-5 text-right">
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <form action="" method="get" class="modal-content modal-body border-0 p-0">
          <div class="input-group mb-2">
            <input type="text" class="form-control" id="inputModalSearch" name="q" placeholder="Search ...">
            <button type="submit" class="input-group-text bg-success text-light">
              <i class="fa fa-fw fa-search text-white"></i>
            </button>
          </div>
        </form>
      </div>
    </div>



    <!-- Start Banner Hero -->
    <div id="template-mo-zay-hero-carousel" class="carousel slide" data-bs-ride="carousel">
      <ol class="carousel-indicators">
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="0" class="active"></li>
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="1"></li>
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <div class="container">
            <div class="row p-5">
              <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                <img class="img-fluid" src="./assets/img/banner_img_01.jpg" alt="">
              </div>
              <div class="col-lg-6 mb-0 d-flex align-items-center">
                <div class="text-align-left align-self-center">
                  <h1 class="h1 text-success"><b>VARAN Designs</b> Company</h1>
                  <h3 class="h2">Perfect Quality</h3>
                  <p>
                    VARAN Designs Shop is an latest version of design Marketing.
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="carousel-item">
          <div class="container">
            <div class="row p-5">
              <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                <img class="img-fluid" src="./assets/img/banner_img_02.gif" alt="">
              </div>
              <div class="col-lg-6 mb-0 d-flex align-items-center">
                <div class="text-align-left">
                  <h1 class="h1">Most Priority</h1>
                  <h3 class="h2">High-Standard</h3>
                  <p>
                    To Develop Our Designs to worldwide stream.
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="carousel-item">
          <div class="container">
            <div class="row p-5">
              <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                <img class="img-fluid" src="./assets/img/banner_img_03.jpg" alt="">
              </div>
              <div class="col-lg-6 mb-0 d-flex align-items-center">
                <div class="text-align-left">
                  <h1 class="h1">To Display Live experience in screen</h1>
                  <h3 class="h2">Not only a object.</h3>
                  <p>
                    This is the technology that we need.
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <a class="carousel-control-prev text-decoration-none w-auto ps-3" href="#template-mo-zay-hero-carousel" role="button" data-bs-slide="prev">
        <i class="fas fa-chevron-left"></i>
      </a>
      <a class="carousel-control-next text-decoration-none w-auto pe-3" href="#template-mo-zay-hero-carousel" role="button" data-bs-slide="next">
        <i class="fas fa-chevron-right"></i>
      </a>
    </div>
    <!-- End Banner Hero -->


    <!-- Start Categories of The Month -->
    <section class="container py-5">
      <div class="row text-center pt-3">
        <div class="col-lg-6 m-auto">
          <h1 class="h1">Categories of The Month</h1>
          <p>
            Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia
            deserunt mollit anim id est laborum.
          </p>
        </div>
      </div>
      <div class="row">
        <div class="col-12 col-md-4 p-5 mt-3">
          <a href="#"><img src="./assets/img/category_img_01.jpg" class="rounded-circle img-fluid border"></a>
          <h5 class="text-center mt-3 mb-3">3D Artworks</h5>
          <p class="text-center"><a class="btn btn-success" href="shop">Go Shop</a></p>
        </div>
        <div class="col-12 col-md-4 p-5 mt-3">
          <a href="#"><img src="./assets/img/category_img_02.jpg" class="rounded-circle img-fluid border"></a>
          <h2 class="h5 text-center mt-3 mb-3">Vectors</h2>
          <p class="text-center"><a class="btn btn-success" href="shop">Go Shop</a></p>
        </div>
        <div class="col-12 col-md-4 p-5 mt-3">
          <a href="#"><img src="./assets/img/category_img_03.gif" class="rounded-circle img-fluid border"></a>
          <h2 class="h5 text-center mt-3 mb-3">Animations</h2>
          <p class="text-center"><a class="btn btn-success" href="shop">Go Shop</a></p>
        </div>
      </div>
    </section>
    <!-- End Categories of The Month -->


    <!-- Start Featured Product -->
    <section class="bg-light">
      <div class="container py-5">
        <div class="row text-center py-3">
          <div class="col-lg-6 m-auto">
            <h1 class="h1">Featured Designs</h1>
            <p>
              Reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
              Excepteur sint occaecat cupidatat non proident.
            </p>
          </div>
        </div>
        <div class="row">
          <div class="col-12 col-md-4 mb-4">
            <div class="card h-100">
              <a href="shop-single.html">
                <img src="./assets/img/feature_prod_01.gif" class="card-img-top" alt="...">
              </a>
              <div class="card-body">
                <ul class="list-unstyled d-flex justify-content-between">
                  <li>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-muted fa fa-star"></i>
                    <i class="text-muted fa fa-star"></i>
                  </li>
                  <li class="text-muted text-right">$240.00</li>
                </ul>
                <a href="shop-single.html" class="h2 text-decoration-none text-dark">Drawings</a>
                <p class="card-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt in culpa qui officia deserunt.
                </p>
                <p class="text-muted">Reviews (24)</p>
              </div>
            </div>
          </div>
          <div class="col-12 col-md-4 mb-4">
            <div class="card h-100">
              <a href="shop-single.html">
                <img src="./assets/img/feature_prod_02.png" class="card-img-top" alt="...">
              </a>
              <div class="card-body">
                <ul class="list-unstyled d-flex justify-content-between">
                  <li>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-muted fa fa-star"></i>
                    <i class="text-muted fa fa-star"></i>
                  </li>
                  <li class="text-muted text-right">$480.00</li>
                </ul>
                <a href="shop-single.html" class="h2 text-decoration-none text-dark">Cloud Design works</a>
                <p class="card-text">
                  Aenean gravida dignissim finibus. Nullam ipsum diam, posuere vitae pharetra sed, commodo ullamcorper.
                </p>
                <p class="text-muted">Reviews (48)</p>
              </div>
            </div>
          </div>
          <div class="col-12 col-md-4 mb-4">
            <div class="card h-100">
              <a href="shop-single.html">
                <img src="./assets/img/feature_prod_03.jpg" class="card-img-top" alt="...">
              </a>
              <div class="card-body">
                <ul class="list-unstyled d-flex justify-content-between">
                  <li>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                    <i class="text-warning fa fa-star"></i>
                  </li>
                  <li class="text-muted text-right">$360.00</li>
                </ul>
                <a href="shop-single.html" class="h2 text-decoration-none text-dark">Artworks</a>
                <p class="card-text">
                  Curabitur ac mi sit amet diam luctus porta. Phasellus pulvinar sagittis diam, et scelerisque ipsum lobortis nec.
                </p>
                <p class="text-muted">Reviews (74)</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- End Featured Product -->
  </layout:put>
</layout:extends>
