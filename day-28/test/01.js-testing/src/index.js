module.exports =function(){

    this.add = function(a, b){
        return a + b;
    }

    this.multiply = function(x, y){
        return x * y;
    }   
    
    this.checkEven = n => {
        const rem = n % 2;
        if(rem == 0)
            return true
        else
            return false
    }
}