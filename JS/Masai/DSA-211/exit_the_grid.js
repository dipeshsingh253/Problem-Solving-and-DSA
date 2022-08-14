let n = 4;
let matrix = [
  ["R", "R", "R", "R"],
  ["L", "L", "L", "L"],
  ["U", "U", "U", "U"],
  ["D", "D", "D", "D"],
];
let x =exitTheGrid(n, matrix);
console.log(x);

function exitTheGrid(n, matrix) {
  let i = 0;
  let j = 0;
  let count = 0;
  while (i >= 0 && j >= 0 && i < n && j < n) {
    if (matrix[i][j] == "x") {
      return 0;
    }
    if (matrix[i][j] == "R") {
      matrix[i][j] = "x";
      j++;
    } else if (matrix[i][j] == "L") {
      matrix[i][j] = "x";
      j--;
    } else if (matrix[i][j] == "U") {
      matrix[i][j] = "x";
      i--;
    } else if (matrix[i][j] == "D") {
      matrix[i][j] = "x";
      i++;
    }
    count++;
  }
  return count;
}
