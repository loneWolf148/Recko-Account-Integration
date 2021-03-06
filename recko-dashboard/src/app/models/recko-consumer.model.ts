import { ICompanyCredential } from './company-credential.model';

export interface IReckoConsumer {
    id: string;
    name: string;
    amount: number;
    date: Date;
    type: string;
    credential: ICompanyCredential;
}