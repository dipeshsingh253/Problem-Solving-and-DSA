let n=3;
let matrix = [
    [1 ,2 ,3],
    [4 ,5 ,6],
    [7 ,8 ,9],
];

reverseNtraversal(n,matrix);
function reverseNtraversal(n,matrix){
    let top=0;
    let bottom=n-1;
    let left =0;
    let right = n-1;
    let bag = "";

    for(let i=top; i<=bottom; i++){
        bag+=matrix[i][left]+" ";
    }
    left++;
    bottom--;
    for(i=bottom;i>=top;i--){
        bag+=matrix[i][left++]+" ";
    }
    top++;
    bottom++;
    for(i=top;i<=bottom;i++){
        bag+=matrix[i][right]+" ";
    }
    console.log(bag);
}