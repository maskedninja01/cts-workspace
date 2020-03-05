import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  users:User[];
  errMsg:string;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.loadData();
  }

  loadData(){
    this.users=null;
    this.errMsg=null;
    this.userService.getAll().subscribe(
      (data2)=>{this.users=data2;},
      (err)=>{this.errMsg='Sorry server not reachable';}
    );
  }

}
