import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardCodedAuthenticationService {

  constructor() { }

  authenticate(username:string,password:string){
    // console.log("before"+this.isUserLoggedin());
    if(username==="Himank" && password==="dummy"){
      sessionStorage.setItem('authenticaterUser',username);
      // console.log("After"+this.isUserLoggedin());
      return true;
    }
    else{
      return false;
    }
     
  }

  isUserLoggedin(){
   let user= sessionStorage.getItem('authenticaterUser');
   return  !(user==null)
  }

  logout(){
    sessionStorage.removeItem('authenticaterUser');
  }
}
