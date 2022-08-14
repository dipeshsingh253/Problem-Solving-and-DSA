// let matrix = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9],
// ];
let matrix = [
  [3, 3, 10, 9, 2, 1, 1],
  [7, 10, 5, 6, 8, 5, 4],
  [2, 6, 10, 6, 6, 8, 7],
  [8, 4, 1, 2, 2, 1, 7],
  [9, 9, 5, 5, 10, 10, 3],
  [6, 5, 4, 4, 5, 8, 10],
  [10, 2, 3, 5, 9, 3, 4],
];

let n = 7;
let bag = "";
let row = Math.floor(n / 2);
//console.log(row);

for (let j = n - 1; j >= 0; j--) {
  if (j >= Math.floor(n / 2)) {
    //console.log(j, row--);
    bag += matrix[row--][j] + " ";
  } else {
    //console.log(row);
    if (row == -1) {
      row++;
      row++;
    }
    //console.log(j,row++);
    bag += matrix[row++][j] + " ";
  }
}

for (let i = 1; i < n - 1; i++) {
  if (i <= Math.floor(n / 2)) {
    bag += matrix[row++][i] + " ";
    //console.log(i,row++);
  } else {
    if (row == n) {
      row--;
      row--;
    }
    //console.log(i,row--);
    // console.log(col);
    bag += matrix[row--][i] + " ";
  }
}

console.log(bag);
