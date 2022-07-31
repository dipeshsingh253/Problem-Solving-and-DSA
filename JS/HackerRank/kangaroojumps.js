let x1 = 0;
let v1 = 3;
let x2 = 4;
let v2 = 2;
let ans="Yes";
//console.log(x1, v1, x2, v2);

if(x2>x1 && v2>v1)
{
    ans="No";
    console.log(ans);
}

for(let i=0; i<Infinity; i++)
{
    if(x1==x2)
    {
        ans="Yes";
        console.log(ans);
        break;
    }
    else
    {
        x1+=v1;
        x2+=v2;
    }
}

