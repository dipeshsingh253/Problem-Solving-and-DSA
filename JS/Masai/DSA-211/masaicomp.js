let n = 3;
let m = 4;
let arr = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
];
masaiComp(n, m, arr);
function masaiComp(n, m, arr) {
  let res = [];

  for (let i = 0; i < n; i++) {
    let max = 0;
    let x = arr[i];

    for (let j = 0; j < m; j++) {
      if (max < x[j]) {
        max = x[j];
      }
    }
    res.push(max);
  }
    console.log(res.join(" "));
  //return res;
}
