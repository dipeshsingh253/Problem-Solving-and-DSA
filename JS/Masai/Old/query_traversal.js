let n=3;
let m=3;
let q=1;
let matrix = [
    [1 ,2 ,3],
    [4 ,5 ,6],
    [7 ,8 ,9],
];

queryOne(n,m,matrix);
//queryTwo(n,m,matrix);
  function queryOne(n,m,matrix){
    let row = 0;
    let bag = "";
    while(row<n){
        if(row%2!==0)
        {
       
            bag+=matrix[row].reverse().join(' ')+" ";
            row++;
        }
        else if(row%2==0)
        {
    
            bag+=matrix[row].join(' ')+" ";
           
            row++;
        }
    }
    console.log(bag);
}
  
function queryTwo(n,m,matrix){
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