let s=7;
let t=11;
let a=5;
let b=15;
let apple=[-2,2,1];
let orange=[5,-6];
console.log(s,t,a,b,apple,orange);

let distanceApple =Array.from(apple,e => e+a);
console.log(distanceApple);
let distanceOrange =Array.from(orange,e => e+b);
console.log(distanceOrange);

let checkInRange = function(s,t,arr)
{
    let count=0;

    for(let i=0;i<arr.length;i++)
    {
        if(arr[i]>=s && arr[i]<=t)
        {
            count++;
        }
    }
    return count;
}

let x = checkInRange(s,t,distanceApple);
let y = checkInRange(s,t,distanceOrange);
console.log(x);
console.log(y);