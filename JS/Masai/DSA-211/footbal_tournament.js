let n = 5;
let arr = ["A", "ABA", "ABA", "A", "A"];
let res =getToFinals(n, arr);
//console.log(res);
function getToFinals(n, arr) {
  let teams = [...new Set(arr)];
  let team1 = teams[0];
  let team2 = teams[1];
  let goalTeam1 = 0;
  let goalTeam2 = 0;
  //console.log(teams);
  for (let i = 0; i < n; i++) {
    switch(arr[i])
    {
        case team1: goalTeam1++; break
        case team2: goalTeam2++; break
    }
  }
  let winner= goalTeam1>goalTeam2?team1:team2;
  console.log(winner);
}
