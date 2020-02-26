import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  title:string;
  tagLine:string;

  constructor() {
    this.title="This is Task List SPA";
    this.tagLine="using Routing and Bootstrap"
   }

  ngOnInit() {
  }

}