<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>青鸟租房 -修改房屋信息</title>
<LINK rel=stylesheet type=text/css href="css/style.css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#dis")
				.change(
						function() {
							var did = $(this).val();
							var sid = "${house.sid}";
							$("#street option").not(":eq(0)").remove();
							$
									.getJSON(
											"street?did=" + did,
											function(sb) {
												var option;
												for (var i = 0; i < sb.length; i++) {
													if (sid == sb[i].sid) {
														option = "<option value='"+sb[i].sid+"' selected=selected >"
																+ sb[i].sname
																+ "</option>";
													} else {
														option = "<option value='"+sb[i].sid+"' >"
																+ sb[i].sname
																+ "</option>";
													}
													$("#street").append(option);
												}
											});
						});

		$("form").submit(function() {
			var title = $("input[name=title]").val();
			var type = $("select[name=tid]").val();
			var area = $("input[name=area]").val();
			var price = $("input[name=price]").val();
			var htime = $("input[name=htime]").val();
			var dis = $("select[name=dis]").val();
			var street = $("select[name=sid]").val();
			var phone = $("input[name=phone]").val();
			var content = $("TEXTAREA").val();
			if (title == "") {
				alert("标题不能为空！");
				return false;
			} else if (type == "") {
				alert("户型不能为默认！");
				return false;
			} else if (area == "") {
				alert("面积不能为空！");
				return false;
			} else if (price == "") {
				alert("价格不能为空！");
				return false;
			} else if (htime == "") {
				alert("房产证日期不能为空！");
				return false;
			} else if (dis == "") {
				alert("区不能为默认！");
				return false;
			} else if (street == "") {
				alert("街道不能为默认！");
				return false;
			} else if (phone == "") {
				alert("联系方式不能为空！");
				return false;
			} else if (content == "") {
				alert("详情不能为空！");
				return false;
			}
			var treg = /^[0-9]{4}-[0-9]{2}-[0-9]{2}$/;
			if (!treg.test(htime)) {
				alert("日期格式必须为yyyy-mm-dd!");
				return false;
			}
			var preg = /^[1][3,4,5,7,8][0-9]{9}$/;
			if (!preg.test(phone)) {
				alert("联系方式必须以13,14,15,17,18开头的十一位数字!");
				return false;
			}
			return true;
		});

		$("#type").val("${house.tid}");
		$("#dis").val("${house.dis.did}");
		
		$("#dis").trigger("change");
	});
</script>
</head>
<body>
	<DIV id="header" class="wrap">
		<DIV id="logo">
			<IMG src="images/logo.gif">
		</DIV>
	</DIV>
	<DIV id="regLogin" class="wrap">
		<DIV class="dialog">
			<DL class="clearfix">
				<DT>新房屋信息发布</DT>
				<DD class="past">修改房屋信息</DD>
			</DL>
			<DIV class="box">
				<FORM id='add_action' method='post' action='update.action'>
					<DIV class="infos">
						<TABLE class="field">
							<TBODY>
								<TR>
									<TD class="field">标 题：</TD>
									<TD><INPUT type="hidden" name="id" value=""> <INPUT
										id='add_title' class="text" type="text" name="title"
										value="${house.title }"></TD>
								</TR>
								<TR>
									<TD class=field>户 型：</TD>
									<TD><select name="tid" id="type">
											<option value="" selected=selected>--请选择--</option>
											<c:forEach items="${tylist }" var="tp">
												<option value="${tp.tid }">${tp.tname }</option>
											</c:forEach>
									</select></TD>
								</TR>
								<TR>
									<TD class="field">面 积：</TD>
									<TD><INPUT id='add_floorage' class="text" type="text"
										name="area" value="${house.area }"></TD>
								</TR>
								
								<TR>
									<TD class="field">价 格：</TD>
									<TD><INPUT id='add_price' class="text" type="text"
										name="price" value="${house.price }"></TD>
								</TR>
								<TR>
									<TD class="field">房产证日期：</TD>
									<TD><INPUT id='add_date' class="text" type="text"
										name="htime" value="${house.htime }"></TD>
								</TR>
								<TR>
									<TD class="field">位 置：</TD>
									<TD>区： <select name="diss" id="dis">
											<option value="" selected=selected>--请选择--</option>
											<c:forEach items="${dlist }" var="dis">
												<option value="${dis.did }">${dis.dname }</option>
											</c:forEach>
									</select> 街： <select name="sid" id="street">
											<option value="" selected=selected>--请选择--</option>
									</select>
									</TD>
								</TR>
								<TR>
									<TD class="field">联系方式：</TD>
									<TD><INPUT id="add_action_contact" class="text"
										type="text" name="phone" value="${house.phone }"></TD>
								</TR>
								<TR>
									<TD class="field">详细信息：</TD>
									<TD><TEXTAREA name="content">${house.content }</TEXTAREA></TD>
								</TR>
								<TR style="display: none;">
									<TD class="field">hid：</TD>
									<TD><INPUT id='add_hid' class="text" type="text"
										name="hid" value="${house.hid }"></TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class="buttons">
							<INPUT value='立即修改' type='submit'>
						</DIV>
					</DIV>
				</FORM>
			</DIV>
		</DIV>
	</DIV>
	<DIV id=footer class=wrap>
		<DL>
			<DT>青鸟租房 © 2010 北大青鸟 京ICP证1000001号</DT>
			<DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
		</DL>
	</DIV>

</body>
</html>