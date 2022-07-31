let n = 5;
let m = 5;
let matrix = [
  [4, 7, 1, 1, 7],
  [8, 9, 9, 6, 1],
  [6, 4, 9, 5, 1],
  [7, 7, 4, 7, 7],
  [8, 6, 2, 5, 5],
];


goZigZag(n,m,matrix);

function goZigZag(n,m,matrix){
    let row = 0;
    let bag = "";
    while(row<n){
        if(row%2==0)
        {
       
            bag+=matrix[row].reverse().join(' ')+" ";
            row++;
        }
        else if(row%2!==0)
        {
    
            bag+=matrix[row].join(' ')+" ";
           
            row++;
        }
    }
    console.log(bag);
}