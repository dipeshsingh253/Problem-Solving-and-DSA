let n = 5;
let arr = [1,2,3,4,5];
productArray(n,arr);
function product(n,arr)
    {
        let result = 1;
        for (let i = 0; i < n; i++)
            result = result * arr[i];
        return result;
    }
function productArray(n,arr) {
    let res = [];
    let multiplication = product(n,arr);
    //console.log(multiplication);
    for(let i=0;i<n;i++)
    {
        res.push(multiplication/arr[i]);
    }
    console.log(res.join(" "));
}

