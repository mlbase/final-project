/**
 * 
 */

$(document).ready(function(){
	$("#checkbtn").click(function () {
		//	alert('idcheckbtn');
		
			// title첵크
		
			$.ajax({
				url:"http://localhost:3000/title",
				type:"post",
				data:{ title:$("#title").val() },
				success:function( resp ){
				//	alert('success');
				
					if(resp.trim() == "YES"){
						$("#titlecheck").html("중복된 제목입니다");
						$("#title").val("");
					}else{
						$("#titlecheck").html("사용할 수 있는 제목입니다");
					}			
				},
				error:function(){
					alert('error');
				}
			});
		});
	
	$("#postbook").on("click",function () {
		
		let params = $("#frm").serialize();
		console.log(params);
		
		$.ajax({
			url:"http://localhost:3000/book",
			type:"post",
			data:params,
			success:function(resp){
			//	alert('success');
				if(resp == "OK"){
					alert("책정보 업로드에 성공했습니다.");	
					location.href = "index.html";
				}else{
					alert("책정보 업로드에 실패했습니다.");
				}			
			},
			error:function(){
				alert('error');
			}			
		});
	});
	
	
	$("#search").click(function () {
		let params = $("#frm").serializeArray();
		
            $.ajax({
                method: "GET",
                url: "https://dapi.kakao.com/v3/search/book?target=title",
                data: { query: $("#isbn").val() },
                headers: { Authorization: "KakaoAK df463844cdd08a00867744d4479dd735" },
                success: function(resp){
                	alert(JSON.stringify(resp));
					alert(resp.title);
					$("#title").val(resp.title);
					$("#filename").val(resp.thumbnail);
					$("#writer").val(resp.authors);
					$("#publishdate").val(resp.datetime);
					$("#publisher").val(resp.publisher);
					$("#price").val(resp.price);
					$("#content").val(resp.contents);
                }
                
            });
	});                      
});