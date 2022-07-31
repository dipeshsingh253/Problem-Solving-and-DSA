//BORDERLESS

let n = 4;
let m = 4;
let matrix = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16],
];
borderLessSum(n, m, matrix);
function borderLessSum(n, m, matrix) {
  let top = 1;
  let bottom = n - 2;
  let left = 1;
  let right = m - 2;

  let sum=0;
  j=left;
  for(let i=top;i<=bottom;i++) {
    for(let j=left;j<=right;j++) {
      sum+=matrix[i][j];
      //console.log(matrix[i][j]);
    }
  }
  console.log(sum);
}
