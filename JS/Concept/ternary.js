function check(a,b)
{
    return a>b?"a is bigger than b"
           :a<b?"b is bigger than a"
           :"both are equal";
}
let a=3;
let b =3;

let c = check(a,b);
console.log(c);
