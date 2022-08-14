let n=3;
let m=3;
let matrix= [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ];

  detectiveL(n,m,matrix);
function detectiveL(n,m,matrix) {
    let top=0;
    let bottom=n-1;
    let right=m-1;
    let left=0;
    let bag="";
    let count=0;
    while(count<n*m){
        for(let i=top; i<=bottom && count<n*m; i++) {
            bag+=matrix[i][left]+" ";
            count++;
        }
    
        let j=left+1;
        for(i=j;i<=right && count<n*m;i++) {
            bag+=matrix[bottom][i]+" ";
            count++;
        }
        left++;
        bottom--;
    }
    
    console.log(bag);
}