let n = 3;
let m = 5;

let matrix = [
  [1, 2, 3, 4, 5],
  [6, 7, 8, 9, 10],
  [11, 12, 13, 14, 15],
];

swastikSum(n,m,matrix);

function swastikSum(n,m,matrix){
    let sum1=swastikSumLeft(n,m,matrix);
    let sum2=swastikSumRight(n,m,matrix);
    console.log(Math.abs(sum1-sum2));
}

function swastikSumLeft(n,m,matrix){
    let top = 0;
    let bottom = n-1;
    let left = 0;
    let right = m-1;
    let sum = 0;
    let bag="";
    for(let i=top;i<=Math.floor(n/2);i++){
        bag+=matrix[i][left]+" ";
        sum+=matrix[i][left];
    }
    
    left++;
    top=Math.floor(n/2);
    for(i = left;i<=right;i++){
        bag+=matrix[top][i]+" ";
        sum+=matrix[top][i];
    }

    top++;

    for(i=top;i<=bottom;i++){
        bag+=matrix[i][right]+" ";
        sum+=matrix[i][right];
    }
    return sum;
    // console.log("bag 1=" + sum);
}


function swastikSumRight(n,m,matrix){
    let top = 0;
    let bottom = n-1;
    let left = 0;
    let right = m-1;
    let sum = 0;
    let bag="";

    for(let i=right;i>=Math.floor(m/2);i--){
        bag+=matrix[top][i]+" ";
        sum+=matrix[top][i];
    }
    top++;
    right=Math.floor(m/2);
    for(i=top;i<=bottom;i++){
        bag+=matrix[i][right]+" ";
        sum+=matrix[i][right];
    }
    right--;
    for(let i=right;i>=left;i--){
        bag+=matrix[bottom][i]+" ";
        sum+=matrix[bottom][i];
    }
   return sum;
}