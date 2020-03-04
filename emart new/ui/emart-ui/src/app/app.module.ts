import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuyerSignUpComponent } from './buyer-sign-up/buyer-sign-up.component';
import { SellerSignUpComponent } from './seller-sign-up/seller-sign-up.component';

@NgModule({
  declarations: [
    AppComponent,
    BuyerSignUpComponent,
    SellerSignUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
