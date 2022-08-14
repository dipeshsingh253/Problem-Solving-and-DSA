let str = "1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10";

let n = 4;
let m = 4;

str = str.trim().split(" ").map(Number);
let ans = spiralToMatrix(str, m, n);
console.log(ans);
function spiralToMatrix(str, n, m){
    let top = 0;
    let left = 0;
    let bottom = n - 1;
    let right = m - 1;
    let count = 0;
    let matrix = [];
    for (let i = 0; i < n; i++) {
      let array = new Array(n);
      matrix.push(array);
    }
    //console.log(matrix);
    let sum = 0;
    //   let bag = "";
    while (count < n * m) {
    
    for (let i = left; i <= right && count < n * m; i++) {
      matrix[top][i] = str[count++];
      sum = checkDiagonalAndSum(sum, matrix[top][i], top, i);
    }
    top++;
    
    for (i = top; i <= bottom; i++ && count < n * m) {
      matrix[i][right] = str[count++];
      sum = checkDiagonalAndSum(sum, matrix[i][right], right, i);
    
    }
    right--;
    for (i = right; i >= left && count < n * m; i--) {
      matrix[bottom][i] = str[count++];
      sum = checkDiagonalAndSum(sum, matrix[bottom][i], bottom, i);
    }
    
    bottom--;
    for (i = bottom; i >= top && count < n * m; i--) {
      matrix[i][left] = str[count++];
      sum = checkDiagonalAndSum(sum, matrix[i][left], left, i);
    
    }
    left++;
    }
    return sum;
}



function checkDiagonalAndSum(sum, el, i, j) {
  if (j == i || j + i == n - 1) {
    sum += el;
  }
  return sum;
}


// console.log(matrix);
// console.log(count);
//console.log(sum);