// Solve Age of empires

// You are playing the popular game of "Age of Empires". You are the king of the empire where you have 2N workers.

// All workers will be grouped in the association with size 2, so a total of N associations have to be formed.

// The building speed of the i-th worker is A[i].

// To make an association, you pick up 2 workers. Let the minimum building speed between both workers be x, then the association has the resultant building speed x.

// You have to print the maximum value possible of the sum of building speeds of N associations if you make the associations optimally.



// input ==>2 ,  1 3 1 2
function ageEmpire(n,arr)
{
    arr = arr.sort((a,b)=>{return a>b?1:a<b?-1:0});

    let sum =0;
    for(let i=0;i<arr.length;i=i+2)
    {
        sum+=arr[i];
    }
    console.log(sum);
}