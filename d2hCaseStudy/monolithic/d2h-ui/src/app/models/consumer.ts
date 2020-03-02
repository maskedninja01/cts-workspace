import { Address } from './address';
import { D2hUser } from './d2h-user';
import { Subscription } from './subscription';
import { Transaction } from './transaction';

export class Consumer {
    consumerId:number;
    firstName:string;
    lastName:string;
    emailId:string;
    mobileNumber:string;
    address:Address;
    walletBalance:number;
    userAccount:D2hUser;
    subscriptions:Subscription[];
    transactions:Transaction[];
}
