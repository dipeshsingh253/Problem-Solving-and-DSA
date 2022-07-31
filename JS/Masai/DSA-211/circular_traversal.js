let n = 3;
let matrix = [
    [1 ,2 ,3],
    [4 ,5 ,6],
    [7 ,8 ,9]
];

circleTraversal(n, matrix);
function circleTraversal(n, matrix){
    let top =0;
    let left =0;
    let right =n-1;
    let bottom =n-1;
    let bag="";
    
    for(let i=bottom; i>=0; i--){
        bag+=matrix[i][left]+" ";
    }
    left++;
    for(i=left; i<=right; i++){
        bag+=matrix[top][i]+" ";
    }
    top++;
    for(i=top; i<=bottom; i++){
        bag+=matrix[i][right]+" ";
    }
    right--;
    for(i=right; i>=left; i--){
        bag+=matrix[bottom][i]+" ";
    }
    console.log(bag);
}