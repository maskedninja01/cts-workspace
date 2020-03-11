import { Address } from './address';
import { User } from './user';

export class Buyer {
    buyerId:number;
    firstName:string;
    lastName:string;
    emailId:string;
    mobileNumber:string;
    address:Address;
    createdDate:Date;
    userAccount:User;
}
