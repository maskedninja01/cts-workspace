import { Component, OnInit } from '@angular/core';
import { Items } from '../models/item';
import { ItemsService } from '../services/item.service';

@Component({
  selector: 'app-shooping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  items:Items[];
  constructor(private itemServ:ItemsService) { }

  ngOnInit() {
    this.items=this.itemServ.getAll();
  }
  delete(itemId:number){
    if(confirm(`Are you sure of deleting Item ${itemId}`)){
      this.itemServ.delete(itemId);
    }
  }

}
