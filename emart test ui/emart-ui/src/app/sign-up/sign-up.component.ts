import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  user:User;

  constructor() {
    // this.user.firstName="Lance";
    // this.user.lastName="Payne";
    // this.user.email="lance@gmail.com";
    // this.user.mobileNumber="98737497393";
   }

  ngOnInit() {
  }

  save(){
    console.log(this.user);
  }

}
