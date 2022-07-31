function primeNumber(n) {
    if(n<2) return false;

    for(let i=2;i<n;i++)
    {
        if(n%i == 0) return false;

    }
    return true;
}

function primeNumberOptimized(n) {
    if(n<2) return false;

    for(let i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i == 0) return false;

    }
    return true;
}


// primeNumber ==> O(n);
// primeNumberOptimized ==> O(sqrt(n));
let x =primeNumber(4);
console.log(x);
console.log(Math.sqrt(256));