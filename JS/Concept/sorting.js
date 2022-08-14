
let dataBase = [
  {
    name: "Ironman",
    releasedate: "2008",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.hdwallpapersfreedownload.com%2Fuploads%2Flarge%2Fsuper-heroes%2Firon-man-movie-hd-2008.jpg&f=1&nofb=1",
    rating: "7.8",
  },
  {
    name: "Ironman 2",
    releasedate: "2010",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.alphacoders.com%2F689%2F689262.jpg&f=1&nofb=1",
    rating: "8.3",
  },
  {
    name: "Ironman 3",
    releasedate: "2013",
    image:
      "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fpavbca.com%2Fwalldb%2Foriginal%2F3%2F7%2Fe%2F243260.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: "The Avengers",
    releasedate: "2012",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fthecineasteslament.files.wordpress.com%2F2012%2F03%2Favengerswallpaper1.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: "Avengers: Age of Ultron",
    releasedate: "2015",
    image:
      "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.superiorwallpapers.com%2Fdownload%2Favengers-age-of-ultron-fantastic-movie-5120x3200.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: " Avengers: Infinity War ",
    releasedate: "2018",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fhdqwalls.com%2Fdownload%2Favengers-infinity-war-international-poster-if-7680x4320.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: ". Avengers: Endgame ",
    releasedate: "2019",
    image:
      "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fhdqwalls.com%2Fwallpapers%2Favengers-endgame-10k-jj.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: "Shang-Chi and the Legend of the Ten Rings",
    releasedate: "2021",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.wallpapersden.com%2Fimage%2Fdownload%2Fposter-of-shang-chi-and-the-legend-of-the-ten-rings_bG1sa2mUmZqaraWkpJRmbmxtrWZmbWk.jpg&f=1&nofb=1",
    rating: "9.6",
  },
  {
    name: " Spider-Man: Homecoming ",
    releasedate: "2017",
    image:
      "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fpicstatio.com%2Flarge%2Fc_sxdg%2FSpider-Man-Homecoming-swing-poster.jpg&f=1&nofb=1",
    rating: "9.6",
  },
];
// let arr= [1,5,4,7,8,2,5,5];

// arr.sort(function(a,b)
// {
// 	return b-a;
// })
// console.log(arr);

 // dataBase.sort(function (a, b) {

 //      a = +a;
 //      b = +b;
 //      return b.rating-a.rating;
 //    });
 //    //console.log(dataBase);

 //    console.log((4+150)%7);

  function sortTheArr(arr,N)
 {
     let i,j;
     
     for(i=0;i<N-1;i++)
     {
         for(j=0;j<N-i-1;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 let temp =arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     return arr;
 }
 
 let arr = [1, 5, 7, 9, 2, 4, 6, 8];
 let N= arr.length;
 let x =sortTheArr(arr,N);
 console.log(x);