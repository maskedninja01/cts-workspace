import { Address } from './address';
import { User } from './user';

export class Seller {
    sellerId:number;
    firstName:string;
    lastName:string;
    companyName:string;
    companyDescription:string;
    address:Address;
    website:string;
    email:string;
    phone:string;
    userAccount:User;
}
