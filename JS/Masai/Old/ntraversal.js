let n=3;
let matrix = [
    [1 ,2 ,3],
    [4 ,5 ,6],
    [7 ,8 ,9],
];

nTraversal(n,matrix);
function nTraversal(n,matrix){
    let top =0;
    let bottom =n-1;
    let left =0;
    let right =n-1;
    let bag ="";
    for(let i=bottom; i>=top; i--){
        bag+=matrix[i][left]+" ";
    }
    top++;
    left++;
    for(i=top;i<=bottom;i++){
        bag+=matrix[i][left++]+" ";
    }
    bottom--;
    top--;
    for(i=bottom;i>=top;i--){
        bag+=matrix[i][right]+" ";
    }
    console.log(bag);
}