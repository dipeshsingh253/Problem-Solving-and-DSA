// let matrix = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9],
//   [2, 4, 5],
//   [6, 8, 2]
// ];
let matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
  [1, 6, 5],
  [2, 4, 8],
];
let n = matrix.length;
let m = matrix[0].length;
//console.log(n, m);
diffVOne(n, m, matrix);

function diffVOneCorrepondingElements(n, m, matrix) {
  //let sum = 0;
//   let max = -Infinity;
  let max =0;
  let top = 0;
  let bottom = n - 1;

  let right = m - 1;

  if (n % 2 !== 0 && m == Math.ceil(n / 2)) {
    for (let i = 0; i < Math.floor(n / 2); i++) {
        //console.log(matrix[top++][right], matrix[bottom--][right]);
      let diff = Math.abs(matrix[top++][right]-matrix[bottom--][right]);
      //console.log(diff);
      if(diff > max){
        max = diff;
      }
      right--;
      // if(i<Math.floor(n/2)){
      //     bag+= matrix[i][right--]+" ";
      // }
      // else
      // {
      //     bag+= matrix[i][right++]+" ";
      // }
    }
  } else {
    console.log(-1);
    return;
  }

  // this worked for all test case try to reduce the number of lines
  console.log(max);
}


function diffVOne(n, m, matrix){
    let right = m-1;
    let res =[];
    if( n% 2 !== 0 && m==Math.ceil(n/2)){
        for(let i=0; i<n; i++){
            if(i<Math.floor(n/2)){
                // bag+= matrix[i][right--]+" ";
                res.push(matrix[i][right--]);
            }
            else
            {
                //bag+= matrix[i][right++]+" ";
                res.push(matrix[i][right++]);
            }
        }
    }
    else
    {
        console.log(-1);
        return;
    }
  
    // this worked for all test case try to reduce the number of lines
    res = res.sort((a,b)=>{return a>b?1:a<b?-1:0});
    //console.log(res);
    console.log(Math.abs(res[0]-res[res.length-1]));
    //console.log(Math.abs(res[0]-res[res.lenght-1]));
}