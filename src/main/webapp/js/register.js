$(function() {
	var isEmail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	$("input:not(#register_submit)").blur(function() {
		if ($(this).val() == "") {
			$(this).siblings("span").html("不能为空！");
			$(this).siblings("span").css("visibility", "visible");
			$(this).css("border", "1px solid #f44444");
		} else {
			if ($("#email").val() != "" && !(isEmail.test($("#email").val()))) {

				return;
			}
			$(this).siblings("span").css("visibility", "hidden");
			$(this).css("border", "1px solid #ddd");
		}
	});
});