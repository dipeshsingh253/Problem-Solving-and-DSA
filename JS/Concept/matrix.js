// let n = 2;
// let m = 2;
// let matrix = [];
// for (let j = 0; j < n; j++) {
//   let arr = [];
//   for (let k = 0; k < m; k++) {
//     arr[k] = 0;
//   }
//   matrix.push(arr);
// }
//  console.log(matrix);
//  let index = 1;
// for(let i=0;i<matrix[0].length;i++)
// {
//     matrix[index][i]++;
//     matrix[index][i] = matrix[index][i];
    //console.log(x++);
// }
//  console.log(matrix);
// let k = 0;
// for (let i = 0; i < matrix.length; i++) {
//     matrix[i][index]++;
//     matrix[i][index] = matrix[i][index];
// }
// console.log(matrix);

// function addProc(matrix, type, index)
// {
//     //console.log(matrix, type, index);
//     if(type === 0)
//     {
//         for(let i=0;i<matrix[0].length;i++)
//         {
//             matrix[index][i]++;
//             matrix[index][i] = matrix[index][i];
//             //console.log(x++);
//         }
//     }
//     else
//     {
//         for (let i = 0; i < matrix.length; i++) {
//             matrix[i][index]++;
//             matrix[i][index] = matrix[i][index];
//         }
//     }
//     console.log(matrix);
//     return matrix;
// }
// let index =1;
// let type =1;
// addProc(matrix, type, index);

function findOdd(matrix,n,m)
{
    let count =0;
    for(let i=0;i<n;i++)
    {
        for(let j=0;j<m;j++)
        {
           // console.log(matrix[i][j]);
            if(matrix[i][j]%2!==0)
            {
                count++;
            }
        }
    }
   // console.log(count);
    return count;
}

// let matrix = [ [ 2, 3 ], [ 1, 2 ] ];
// let n=2;
// let m = 2;
// findOdd(matrix,n,m);
