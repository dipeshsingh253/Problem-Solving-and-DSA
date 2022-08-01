let n=5;
let array = [3 ,3 ,5 ,5, 1];
equilibriumElementOne(n,array);
function equilibriumElementOne(N,arr){
    let sum = 0;
    let leftsum = 0;
    let flag =  false;

    for (let i = 0; i < N; ++i){

        sum += arr[i];
    }

    for (let i = 0; i < N; ++i)
    {
        sum -= arr[i];
    //    console.log("sum: " + sum);
    //    console.log("leftsum:"+leftsum);
        if (leftsum == sum){
            console.log(i+1)
            flag =true;
            break;
        }
          leftsum += arr[i];
    }

    if(flag===false)
    {
        console.log(-1)
    }
}

let N = 100;
let arr = [
  9307, 8359, 5079, 7669, 8707, 4902, 4345, 1717, 6831, 7888, 5704, 3700, 4622,
  1152, 2633, 9186, 1691, 4177, 7737, 3277, 2025, 2147, 9920, 3510, 9008, 1729,
  4647, 1114, 1419, 6427, 2708, 9428, 327, 323, 422, 4836, 252, 6079, 2212,
  3545, 8707, 8070, 8733, 1732, 6536, 1156, 9587, 3431, 7480, 3563, 9433, 3631,
  6688, 312, 8504, 8414, 710, 4109, 4167, 8639, 8007, 2759, 3421, 5193, 9704,
  9458, 4745, 4002, 8668, 4165, 6639, 2854, 5110, 7777, 4508, 9057, 3164, 3236,
  9750, 1165, 2929, 3344, 1578, 3837, 4960, 9370, 21, 71, 4068, 204, 5519, 3671,
  3759, 1204, 588, 2942, 9211, 687, 5276, 5087,
];
equilibriumElementTwo(N, arr);
function equilibriumElementTwo(N, arr){
    
    let sum=0;
    let leftSum=0;
    let flag = false;
    let lin=0;
    let rin=N-1;
    for(let i=0;i<N;i++)
    {
        sum+=arr[lin++];
        leftSum+=arr[rin--];
        if(sum==leftSum && lin<N)
        {
            // console.log("lin:"+lin);
            // console.log(sum,leftSum);
            console.log(lin+1)
            flag =true;
            break;
        }
    }
     if(flag===false)
    {
        console.log(-1)
    }   
}


// equilibriumElementOne ==> Time Complexity ==> O(2n)
// equilibriumElementTwo ==> Time Complexity ==> O(n)