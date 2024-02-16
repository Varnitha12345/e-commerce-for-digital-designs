<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>
<layout:extends name="main">
    <layout:put block="loginBody">
        <!-- Start of Main -->
        <main class="main login-page m-5">
            <!-- Start of Page Header -->
            <div class="page-header">
                <div class="container">
                    <h1 class="page-title mb-0">My Account</h1>
                </div>
            </div>
            <!-- End of Page Header -->

            <!-- Start of Breadcrumb -->
            <nav class="breadcrumb-nav">
                <div class="container">
                    <ul class="breadcrumb text-success">
                        <li><a class="text-decoration-none text-success" href="home">Home | </a>&nbsp;&nbsp;</li>
                        <li>My account</li>
                    </ul>
                </div>
            </nav>
            <!-- End of Breadcrumb -->
            <div class="page-content">
                <div class="container p-5 border border-2 border-dark">
                    <div class="login-popup p-2">
                        <div class="tab tab-nav-boxed tab-nav-center tab-nav-underline">
                            <div class="nav nav-tabs text-uppercase" role="tablist">
                                <div class="nav-item">
                                    <div onclick="signIn();" class="nav-link active" id="sign-in-btn">Sign In</div>
                                </div>
                                <div class="nav-item">
                                    <div onclick="signUp();" id="sign-up-btn" class="nav-link">Sign Up</div>
                                </div>
                            </div>
                            <div class="tab-content">
                                <div class="tab-pane active" id="sign-in">
                                    <div class="form-group p-2">
                                        <label>Username or email address *</label>
                                        <input type="text" class="form-control" name="username" id="username" required>
                                    </div>
                                    <div class="form-group mb-0 p-2">
                                        <label>Password *</label>
                                        <input type="password" class="form-control" name="password" id="password" required>
                                    </div>
                                    <div class="p-2 form-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-checkbox col-1" id="remember1" name="remember1" required="">
                                        <label for="remember1" class="col-2">Remember me</label>
                                        <a href="#" class="text-success offset-7">Forgot your password?</a>
                                    </div>
                                    <div class="p-2">
                                        <a href="#" class="btn btn-success col-12">Sign In</a>
                                    </div>
                                </div>
                                <div class="tab-pane" id="sign-up">
                                    <div class="form-group p-2">
                                        <label>Your email address *</label>
                                        <input type="text" class="form-control" name="email_1" id="email_1" required>
                                    </div>
                                    <div class="form-group mb-5 p-2">
                                        <label>Password *</label>
                                        <input type="password" class="form-control" name="password_1" id="password_1" required>
                                    </div>
                                    <div class="checkbox-content d-none login-vendor p-2" id="vendorParts">
                                        <div class="form-group mb-1 p-2">
                                            <label>First Name *</label>
                                            <input type="text" class="form-control" name="first-name" id="first-name" required>
                                        </div>
                                        <div class="form-group mb-1 p-2">
                                            <label>Last Name *</label>
                                            <input type="text" class="form-control" name="last-name" id="last-name" required>
                                        </div>
                                        <div class="form-group mb-1 p-2">
                                            <label>Shop Name *</label>
                                            <input type="text" class="form-control" name="shop-name" id="shop-name" required>
                                        </div>
                                        <div class="form-group mb-5 p-2">
                                            <label>Phone Number *</label>
                                            <input type="text" class="form-control" name="phone-number" id="phone-number" required>
                                        </div>
                                    </div>
<%--                                    <div class="form-checkbox user-checkbox mt-0 p-2">--%>
<%--                                        <input type="checkbox" class="custom-checkbox checkbox-round active" id="check-customer" name="check-customer" required="">--%>
<%--                                        <label for="check-customer" class="check-customer mb-1"> I am a customer </label>--%>
<%--                                        <input type="checkbox" class="custom-checkbox checkbox-round offset-1" id="check-seller" name="check-seller" required="">--%>
<%--                                        <label for="check-seller" class="check-seller"> I am a vendor</label>--%>
<%--                                    </div>--%>
                                    <p class="p-2">Your personal data will be used to support your experience
                                        throughout this website, to manage access to your account,
                                        and for other purposes described in our <a href="#" class="text-success">privacy policy</a>.</p>
                                    <a href="#" onclick="vendorSignup();" class="d-block mb-5 text-success p-2" id="vendor-signup">Signup as a vendor?</a>
                                    <a href="#" onclick="vendorSignup();" class="d-none d-block mb-5 text-success p-2" id="customer-signup">Signup as a customer?</a>
                                    <div class="form-checkbox d-flex align-items-center justify-content-start mb-5">
                                        <input type="checkbox" class="custom-checkbox" id="remember" name="remember" required="" onchange="changeBtn();">
                                        <label for="remember" class="font-size-md">I agree to the <a  href="#" class="text-primary font-size-md">privacy policy</a></label>
                                    </div>
                                    <a href="#" class="btn btn-success sign-up p-2 col-12 mb-2">Sign Up</a>
                                </div>
                            </div>
                            <p class="text-center">Sign in with social account</p>
                            <div class="social-icons social-icon-border-color d-flex justify-content-center">
                                <a href="#" class="social-icon social-facebook w-icon-facebook"></a>
                                <a href="#" class="social-icon social-twitter w-icon-twitter"></a>
                                <a href="#" class="social-icon social-google fab fa-google text-success"></a>
                            </div>
                        </br>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!-- End of Main -->
    </layout:put>

    <layout:put block="script">
        <script type="text/javascript">
            document.getElementsByClassName('sign-up').item(0).addEventListener('click', function () {
                alert("ABC");
                let email = document.getElementById('email_1').value;
                let password = document.getElementById('password_1').value;

                fetch('${BASE_URL}register',{
                    method:'post',
                    headers:{
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({
                        email: email,
                        password: password
                    })
                }).then(response =>{
                    if (response.ok){
                        window.location.href="${BASE_URL}login"
                    }else {
                        //throw new error
                        return response.text();
                    }
                }).then(text => alert(text))
                    .catch(error =>{

                    })

            });
        </script>
    </layout:put>

</layout:extends>