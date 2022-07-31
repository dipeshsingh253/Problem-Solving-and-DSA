function sortTheArr(arr, n) {
  let i, j;

  for (i = 0; i < n - 1; i++) {
    for (j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  return arr;
}
function bubbleSort(arr, n) {
    //console.log(arr, n);
  if (n == 0 || n == 1) {
    console.log(arr,n);
    return arr;
  } 

  for (let i = 0; i < n - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      let temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }
  bubbleSort(arr, n - 1);
}
// let arr1 =[1 ,5 ,7 ,9];
// let arr2 =[2,4,6,8];
// let ans = [...new Set([...arr1,...arr2])];
// console.log(ans);
// let x= sortTheArr(ans);
// console.log(x);

// var arr = [4, 7, 85, 2, 6, 4, 7, 3, 4, 6, 7, 45, 12, 36];
// let n = arr.length;
// // let ans1 = sortTheArr(arr, n);
// // console.log(ans1);
// console.log("Bubble sort new way");
// //let ans2 = bubbleSort(arr, n);
// console.log(bubbleSort(arr, n));