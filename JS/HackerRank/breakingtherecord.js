let scores=[10,5,20,20,4,5,2,25,1];
let n=scores.length;

let min=scores[0];
minCount=0;
let max=scores[0];
maxCount=0;
let bag="";

for(let i=0;i<n;i++)
{
    if(scores[i]>max)
    {
        max=scores[i];
        maxCount++;
    }
    if(scores[i]<min)
    {
        min=scores[i];
        minCount++;
    }

}
// console.log("minCount: " + minCount + " maxCount: " + maxCount);
console.log(maxCount+" "+minCount);
