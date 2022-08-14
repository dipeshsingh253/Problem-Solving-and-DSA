// There is a long queue of people in front of ATMs. Due to withdrawal limit per person per day, 
// people come in groups to withdraw money.

// Groups come one by one and line up behind the already present queue. The groups have a strange way of
// arranging themselves. In a particular group, the group members arrange themselves in increasing order of 
//their height (not necessarily strictly increasing). Effectively, all people who have lined up
// in increasing order of height form one group Find the minimum number of groups that can be observed in 
//the queue?


let n= 6;
let arr = [1,2,4,3,5,8];
countGroup(n,arr);
function countGroup(n,arr){
    let min = arr[0];
    let count = 1;

    for(let i=0;i<n;i++)
    {
        if(min<=arr[i]){
            min=arr[i];
        }
        else
        {
            
            min=arr[i];
            count++;
        }
        //console.log(min,count);
    }
    
    console.log(count);
}


