let matrix = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16],
];
let N = 4;
let M = 4;
let bag ="";
for(let i = 0; i < N; i++) {
    if(i%2==0){
        bag+= matrix[i].reverse().join(" ")+" ";
    }
    else
    {
        bag+= matrix[i].join(" ")+" ";
    }
}
console.log(bag);