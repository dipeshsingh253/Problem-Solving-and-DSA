// Problem Statement

// You want all your bricks to be stacked. Currently, you have N stacks of bricks each with height H1, H2, H3, ... HN(assuming all bricks are of 1 unit height).You did not like the configuration much and want to change the height of each stack. To increase the height of a particular stack you can add some bricks to it and to decrease the height you can take out some bricks from that stack.

// You require X units of effort for putting up an item onto the stack and Y units of effort for removing it. Find an integer which is the minimum effort required.

let n =3;
let x = 6;
let y = 4;
let first =[3,1,1];
let last = [1,2,2];


first.sort((a,b) => {return a>b?1:a<b?-1:0});  
last.sort((a,b) => {return a>b?1:a<b?-1:0});
//console.log(first,last);
let sum=0;
for(let i=0;i<n;i++)
{

    if(first[i]>last[i])
    {
        sum+=(first[i]-last[i])*y;
    }
    else
    {
        sum+=(last[i]-first[i])*x;
    }

}

console.log(sum);