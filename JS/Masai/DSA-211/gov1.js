// let matrix = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9],
//   [2, 4, 5],
//   [6, 8, 2]
// ];
 let matrix = [ [ 1, 4 ], [ 2, 6 ] ];
let n = matrix.length;
let m = matrix[0].length;
goVOne(n, m, matrix);
// function goVOne(n, m, matrix) {
//   if (n % 2 == 0 || m % 2 == 0) {
//     console.log(-1);
//     return;
//   }
//   let bag = "";
//   // let top = 0;
//   let right = m - 1;
//   for (let i = 0; i < n; i++) {
//     //console.log(i);
//     if (i < Math.floor(n / 2)) {
//         //console.log(i,right);
//         if(matrix[i][right]==undefined){
//             console.log(-1);
//             return; 
//         }
//         else
//         {
//             bag += matrix[i][right--] + " ";
//         }
     
//      console.log(i,right);
//     } else {
//       console.log(i,right);
//       if(matrix[i][right]==undefined){
//         console.log(-1);
//         return; 
//     }
//     else
//     {
//         bag += matrix[i][right++] + " ";

//     }
//     }
//   }
//   console.log("*************");
//   console.log(bag);
// }


// function goVOne(n, m, matrix) {
//     if (n % 2 == 0 || m % 2 == 0 && n+m% 2 == 0) {
//       console.log(-1);
//       return;
//     }
//     let bag = "";
//     // let top = 0;
//     let right = m - 1;
//     for (let i = 0; i < n; i++) {
//       //console.log(i);
//       if (i < Math.floor(n / 2)) {
//           //console.log(i,right);
//           if(matrix[i][right]==undefined){
//               console.log(-1);
//               return; 
//           }
//           else
//           {
//               bag += matrix[i][right--] + " ";
//           }
       
//        //console.log(i,right);
//       } else {
//         //console.log(i,right);
//         if(matrix[i][right]==undefined){
//           console.log(-1);
//           return; 
//       }
//       else
//       {
//           bag += matrix[i][right++] + " ";
  
//       }
//       }
//     }
//     //console.log("*************");
//     console.log(bag);
//   }
  

function goVOne(n, m, matrix){
    let right = m-1;
    let bag ="";
    if( n% 2 !== 0 && m==Math.ceil(n/2)){
        for(let i=0; i<n; i++){
            if(i<Math.floor(n/2)){
                bag+= matrix[i][right--]+" ";
            }
            else
            {
                bag+= matrix[i][right++]+" ";
            }
        }
    }
    else
    {
        console.log(-1);
        return;
    }
  
    // this worked for all test case try to reduce the number of lines
    console.log(bag);
}

