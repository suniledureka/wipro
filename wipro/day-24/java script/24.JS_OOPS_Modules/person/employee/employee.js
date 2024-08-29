import {Person} from '../person.js'
export class Employee extends Person{
    
    constructor(fname,lname,sal){
        super(fname,lname)
        this.salary = sal
    }
    
    getDetails(){
        super.getDetails();
        console.log(`| ${this.salary}`)
    }
}