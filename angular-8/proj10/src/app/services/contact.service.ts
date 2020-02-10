import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';


@Injectable({
  providedIn: 'root'
})
export class ContactService {
  contacts:Contact[];

  constructor() {
    this.contacts=[
      {contactID:101,firstName:"Vamsy",lastName:"Kiran",mobileNumber:"1234567780", alternateMobileNumber:"72727272727",mailId:"vamsy@gmail.com",organization:"PinnacleCorps" ,dob:new Date("1985-05-05")},
      {contactID:102,firstName:"Anurag",lastName:"Patel",mobileNumber:"22141412312", alternateMobileNumber:"654543343",mailId:"dipesh@gmail.com",organization:"MicrosoftCorps" ,dob:new Date("1994-02-06")},
      {contactID:103,firstName:"Aman",lastName:"Jones",mobileNumber:"5443732634", alternateMobileNumber:"53437455434",mailId:"aman@gmail.com",organization:"PentagonCorps" ,dob:new Date("1996-02-01")},
      {contactID:104,firstName:"Dinesh",lastName:"Kumar",mobileNumber:"7866676576", alternateMobileNumber:"34574435665",mailId:"dinesh@gmail.com",organization:"AppleCorps" ,dob:new Date("1992-02-12")},
      {contactID:105,firstName:"Soni",lastName:"Kumari",mobileNumber:"09876668655", alternateMobileNumber:"45345344576",mailId:"soni@gmail.com",organization:"AmazonCorps" ,dob:new Date("1990-04-09")},
    ]
   }

   getAll():Contact[]{
     return this.contacts;
   }

   get(id:number){
     return this.contacts.find((c)=>(c.contactID==id));
   }

   add(contact:Contact){
     this.contacts.push(contact);
   }

   update(contact:Contact){
     let index = this.contacts.findIndex((c)=>(c.contactID===contact.contactID));
     if(index>-1){
       this.contacts[index]=contact;
     }
   }

   delete(id:number){
     let index= this.contacts.findIndex((contact)=>(contact.contactID===id));
     if(index>-1){
       this.contacts.splice(index,1);
     }
   }
}
