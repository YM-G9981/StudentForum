var myPostsPageElement = document.getElementById("myPostsPage");
var i;

for ( i = 0;i<myPsotsPage;i++){
    myPostsPageElement.innerHTML+="<li><a class ='' th:oncilck='toMyPostsPage("+i+")'>"+i+"</a></li>";
}
function toMyPostsPage(page) {
    $.get(
        "/person/getMyPost/"+username+"/"+page,
        function (){
        }
    )
}

var favouritePageElement = document.getElementById("favouritePosts");
for ( i = 0;i<favouritePostsPage;i++){
    favouritePageElement.innerHTML+="<li><a class ='' th:oncilck='toFavouritePostsPage("+i+")'>"+i+"</a></li>";
}
function toFavouritePostsPage(page) {
    $.get(
        "/person/getFavouritePost/"+username+"/"+page,
        function (){
        }
    )
}

var fabulousPageElement = document.getElementById("fabulousPosts");
for ( i = 0;i<fabulousPostsPage;i++){
    fabulousPageElement.innerHTML+="<li><a class ='' th:oncilck='toFabulousPostsPage("+i+")'>"+i+"</a></li>";
}
function toFabulousPostsPage(page) {
    $.get(
        "/person/getFabulousPost/"+username+"/"+page,
        function (){
        }
    )
}

function newPostPage(){
    location.href= "/NewPost";
}



