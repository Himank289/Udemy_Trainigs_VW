import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { HardCodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  username:string="Himank"
  password:string=""
  errorMessage:string="Invalid Credentials"
  invalidLogin:Boolean=false

  constructor(private router:Router,
    private hardcodedAuthenticationService:HardCodedAuthenticationService
  ){

  }


  handleLogin():void{
    // console.log(this.username);
    if(this.hardcodedAuthenticationService.authenticate(this.username,this.password)){
        this.invalidLogin=false;
        this.router.navigate(['welcome',this.username]);
    }  
    else{
      this.invalidLogin=true;
    }
  }

}
