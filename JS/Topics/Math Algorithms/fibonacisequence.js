function nthTermfibonacci(n)
{
    let fib = [0,1];

    for(let i=2;i<n;i++)
    {
        fib[i] = fib[i-1] + fib[i-2];
    }
    return fib;
}

let x =nthTermfibonacci(5);
console.log(x);

// let y = [1,2,3,4,5];
// y[5]= 4;
// console.log(y);