import { Component, OnInit } from '@angular/core';
import { HardCodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-logout',
  standalone: true,
  imports: [],
  templateUrl: './logout.component.html',
  styleUrl: './logout.component.css'
})
export class LogoutComponent implements OnInit{

constructor(public hardcodedAuthenticationService:HardCodedAuthenticationService){}


  ngOnInit(): void {
   this.hardcodedAuthenticationService.logout();
  }

}
