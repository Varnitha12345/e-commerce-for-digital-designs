function signIn(){
    const signIn = document.getElementById("sign-in");
    const signUp = document.getElementById("sign-up");
    const signInBtn = document.getElementById("sign-in-btn");
    const signUpBtn = document.getElementById("sign-up-btn");

    signIn.classList.add("active");
    signInBtn.classList.add("active");
    signUp.classList.remove("active");
    signUpBtn.classList.remove("active");
}

function signUp(){
    const signIn = document.getElementById("sign-in");
    const signUp = document.getElementById("sign-up");
    const signInBtn = document.getElementById("sign-in-btn");
    const signUpBtn = document.getElementById("sign-up-btn");

    signIn.classList.remove("active");
    signInBtn.classList.remove("active");
    signUp.classList.add("active");
    signUpBtn.classList.add("active");
}

function vendorSignup(){
    const vendorSignupBtn = document.getElementById("vendor-signup");
    const customerSignupBtn = document.getElementById("customer-signup");
    const vendorParts = document.getElementById("vendorParts");

    vendorSignupBtn.classList.toggle("d-none");
    customerSignupBtn.classList.toggle("d-none");
    vendorParts.classList.toggle("d-none");


}

// function changeBtn() {
//     const checkedBtn = document.getElementById('remember');
//     const btn = document.getElementById('signUpBtn');
//
//     if (!checkedBtn.checked()){
//         checkedBtn.checked(true);
//         btn.classList.toggle("disabled")
//     }else {
//         checkedBtn.checked(false);
//         btn.classList.toggle("disabled")
//     }
//
// }