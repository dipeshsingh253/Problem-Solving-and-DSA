let obj = {
  rancho: 45,
  chatur: 32,
  raju: 30,
  farhan: 28,
  virus: 32,
  joy: 45,
};
let students = Object.keys(obj);
let marks = Object.values(obj);
// console.log(students);
// console.log(marks);

function sortTheArr(arr, arr2, n) {
  let i, j;

  for (i = 0; i < n - 1; i++) {
    for (j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        temp = arr2[j];
        arr2[j] = arr2[j + 1];
        arr2[j + 1] = temp;
      }
    }
  }
  return [arr, arr2];
}

//console.log(x);
//console.log(students, marks);

function sortTheArrDes(arr, arr2, n) {
  let i, j;

  for (i = 0; i < n - 1; i++) {
    for (j = 0; j < n - i - 1; j++) {
      if (arr[j] < arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        temp = arr2[j];
        arr2[j] = arr2[j + 1];
        arr2[j + 1] = temp;
      }
    }
  }
  return [arr, arr2];
}


//console.log(y);



function printRank(students,marks)
{
    let prev = -1;let rank =1;
    let count =0;
    for(let i=0;i<marks.length;i++)
    {
         if(marks[i]==prev)
         {
            console.log(rank+" "+students[i]);
         }
         else
         {
            rank+=count;
            console.log(rank+" "+students[i]);
            count=0;
         }
         count++;
         prev = marks[i];
    }
}
var x = sortTheArr(students, marks, marks.length);
students = x[0];
marks = x[1];
console.log(students,marks)
var y = sortTheArrDes(marks, students, students.length);
marks = y[0];
students = y[1];
console.log(students,marks)

//printRank(students,marks);
