/**
 * Created by Surya on 2/8/2017.
 */
$(document).ready(function(){
    debugger;
   $(" .mainSearch").off().on("click",function(){
        var searchVal = $(" .mainSearchInput").val();
       searchForTerm(searchVal);
    });

});

function searchForTerm(searchVal){
    var data = {"searchValue":searchVal};
    $.ajax({
        type: "POST",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url:"search.do",
        data: JSON.stringify(data),
        sync:false,
        success: function(result){
            if(result[0]!= "200"){

            }else{
                $(" .resultTextDiv").empty().append('<h1 style="color: darkorange;">'+result[1]+'</h1>');
            }
        }

    })

}