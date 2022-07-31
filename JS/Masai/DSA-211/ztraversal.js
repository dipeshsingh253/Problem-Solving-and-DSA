let n = 3;
let arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

zTraversal(n, arr);
function zTraversal(n, arr){
    let top=0;
    let left=0;
    let bottom= n-1;
    let right= n-1;
    let bag="";

    for(let i=left;i<=right;i++)
    {
        bag+=arr[top][i]+" ";
    }

    top++;
    let j= right-1;
    for(i=top;i<=bottom;i++){
        bag+=arr[i][j--]+" ";
    }
    left++;
    for(i=left;i<=right;i++){
        bag+=arr[bottom][i]+" ";
    }
    console.log(bag);
}