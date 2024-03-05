const data = {
    name: "흰둥이",
    owner: "신짱구",
    age: 1,
    arr: [1, 2, 3, 4], //배열
    walk: function (str) {
        console.log(str);
        console.log("산책중");
    }
};
data.owner = '훈이'
console.log(JSON.stringify(data.owner))
console.log(JSON.stringify(data.name))