document.getElementById('loginForm')?.addEventListener('submit', (e) => {
    e.preventDefault();
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (email.trim() === "" || password.trim() === "") {
        alert("All fields are required.");
        return;
    }
    alert("Login successful!");
});

document.getElementById('registrationForm')?.addEventListener('submit', (e) => {
    e.preventDefault();
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (name.trim() === "" || email.trim() === "" || password.trim() === "") {
        alert("All fields are required.");
        return;
    }
    alert("Registration successful!");
});
