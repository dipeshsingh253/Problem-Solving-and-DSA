let n = 4;
let m = 3;
let matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
  [10, 11, 12]
];
spiratTaversal(n, m, matrix);
function spiratTaversal(n, m, matrix) {
  let top =0;
  let left = 0;
  let bottom = n - 1;
  let right = m - 1;
  let count = 0;
  let bag = "";
  while (count < n * m) {
    for (let i = top; i <= bottom; i++ && count < n * m) {
      bag += matrix[i][left] + " ";
      count++;
    }

    left++;
    for (i = left; i <= right && count < n * m; i++) {
      bag += matrix[bottom][i] + " ";
      count++;
    }

    bottom--;
    for (i = bottom; i >= top && count < n * m; i-- ) {
      bag += matrix[i][right] + " ";

      count++;
    }
    right--;

    for (i = right; i >= left && count < n * m; i--)  {
      bag += matrix[top][i] + " ";
      count++;
    }
    top++;
  }
  console.log("bag: " + bag);
  console.log(count);
}
