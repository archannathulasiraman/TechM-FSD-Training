import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  users = [
    { username: 'admin', password: 'admin123' },
    { username: 'user', password: 'user123' }
  ];

  constructor(private fb: FormBuilder, private router: Router) {}

  ngOnInit(): void {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  login(): void {
    if (this.loginForm.valid) {
      const { username, password } = this.loginForm.value;
      const user = this.users.find(u => u.username === username && u.password === password);

      if (user) {
        alert('Login Successful!');
        localStorage.setItem('user', username);  // Save user session
        this.router.navigate(['/movies']);  // Redirect to movies page
      } else {
        alert('Invalid username or password!');
      }
    }
  }
}
