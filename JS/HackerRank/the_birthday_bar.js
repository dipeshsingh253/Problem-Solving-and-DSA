let s=[1,2,1,3,2];
let d=3;
let m=2;

let n=s.length;

let sum=0;
let count=0;
for(let i=0; i<m; i++)
{
    sum+=s[i];
}
if(sum==d)
{
    count++;
}
for(i=m; i<n; i++)
{
    sum+=s[i]-s[i-m];

    if(sum==d)
    {
        count++;
    }
}
console.log(count);