export class Person{
    constructor(fname, lname){
        this.firstName = fname
        this.lastName = lname
    }
    
    getDetails(){
        console.log(`${this.firstName} | ${this.lastName}`)
    }
}