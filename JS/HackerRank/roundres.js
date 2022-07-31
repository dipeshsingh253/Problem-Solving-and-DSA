function round5(x)
{
    return Math.ceil(x/5)*5;
}
console.log(round5(29));
let grades=[73,67,38,33];
for(let i=0;i<grades.length;i++)
{
    let a=grades[i];
    //console.log(a);
    let x=round5(a);
    //console.log(x);
    let y=x-a;
    //console.log(y);
    if(y<3 && a>=38)
    {
        grades[i]=x;
        //console.log(a);
    }
    else
    {
        continue;
    }
    
}
console.log(grades);