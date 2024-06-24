import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
// import { AppComponent } from '../app.component';

@Component({
  selector: 'app-welcome',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './welcome.component.html',
  styleUrl: './welcome.component.css'
})
export class WelcomeComponent implements OnInit {

  message:String="some welcome message";
  name: String=" "; 

  constructor(private route:ActivatedRoute){

  }


  ngOnInit(): void {
   console.log(this.message);
   console.log(this.route.snapshot.params['name']);
   this.name=this.route.snapshot.params['name'];
  }

}
