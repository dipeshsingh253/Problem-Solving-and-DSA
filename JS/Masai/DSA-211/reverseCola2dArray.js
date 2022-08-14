let matrix = [
  [1, 8, 9],
  [2, 7, 10],
  [3, 6, 11],
  [4, 5, 12],
];
let n = 4;
let m = 3;

let bag = "";
for(let j=0; j<m; j++){
    for(let i=n-1;i>=0;i--)
    {
        bag+=matrix[i][j]+" ";
    }
}

console.log(bag);