function powerOfTwo(n) {
    if (n < 1) return false;
    while (n > 1) {
        if (n % 2 !== 0) return false;
        n = n / 2;
    }
    return true;
}


function powerOfTwoBitwise(n){
    if(n<1) return false;
    return (n & (n-1)) === 0;
}



// powerOfTwo ==> O(n);
//powerOfTwoBitwise ==> O(1);


let x = powerOfTwo(256);
let y = powerOfTwoBitwise(256);
console.log(y);