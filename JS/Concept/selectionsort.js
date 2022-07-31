function selectionSort(arr, n) {
  for (let i = 0; i < n - 1; i++) {
    let min = i;
    for (let j = i + 1; j < n; j++) {
      if (arr[i] > arr[j]) {
        min = j;
        let temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }
    }
  }
  console.log(arr);
}

function sortOk(arr,N)
{
    for(let i =0;i<N-1;i++)
    {
        let min = i;
        for(let j=i+1;j<N;j++)
        {
            if(arr[i]>arr[j])
            {
                min =j;
                let temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                
            }
        }
    }
    console.log(arr);
}

let arr = [4, 8, 2, 6, 3, 7, 8, 5, 9, 4, 5, 7, 11, 48, 23];
selectionSort(arr, arr.length);
sortOk(arr,arr.length);