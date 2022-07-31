let n = 4;
let arr1 = [1, 2, 3, 4];
let m = 5;
let arr2 = [1, 2, 3, 4, 5];
johnNashAndSte(n,m, arr1, arr2);
function johnNashAndSte(n,m, arr1, arr2) {
    // arr1.sort((a,b) => { return a-b; });
    // arr2.sort((a,b) => { return a-b; });

    //console.log(arr1);
    // let y = [...arr1, ...arr2];
    // console.log(y);
    let x = [...new Set([...arr1, ...arr2])].sort((a,b)=>{return a-b});
    console.log(x.join(" "));
}
//  let x = [...new Set([...arr1, ...arr2])].sort((a,b)=>{return a-b});