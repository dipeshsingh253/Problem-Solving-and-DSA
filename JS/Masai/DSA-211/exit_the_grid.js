let n = 4;
let matrix = [
  ["R", "R", "R", "R"],
  ["L", "L", "L", "L"],
  ["U", "U", "U", "U"],
  ["D", "D", "D", "D"],
];
exitTheGrid(n, matrix);

function exitTheGrid(n, matrix) {
  let currentPosition = matrix[0][0];
  let count=0;
  for(let i=0;i<n;i++) {
    if(currentPosition==undefined){
        console.log(count);
        break;
    }
    for(let j=0;j<n;j++) {
        //console.log(matrix[i][j]);
       
        // else
        // {
            if(matrix[i][j]=="R"){
                currentPosition=matrix[i][j+1];
                count++;
            }
            else if(matrix[i][j]=="L"){
                currentPosition=matrix[i][j-1];
                count++;
            }
            else if(matrix[i][j]=="U"){
                currentPosition=matrix[i+1][j];
                count++;
            }
            else if(matrix[i][j]=="D"){
                currentPosition=matrix[i+1][j];
                count++;
            }
       // }
        
        //console.log("Current position: " + currentPosition);
    }
  }
  
  //console.log("count"+count);
}
