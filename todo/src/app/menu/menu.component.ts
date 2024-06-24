import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HardCodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent implements OnInit{
  
  // isUserLoggedIn:boolean=false;

  constructor(public hardcodedAuthenticationService:HardCodedAuthenticationService){

  }

  ngOnInit(): void {
    // this.isUserLoggedIn=this.hardcodedAuthenticationService.isUserLoggedin();
  }

}
