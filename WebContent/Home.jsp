
<html>
<head>
<title>Home</title>
</head>
<style>
	 @page {layout: fixed; width: 500px; height: 500px}
    @frame header {left: 0px; top: 0px; width: 500px; height: 100px}
    @frame toc {left: 0px; top: 100px; width: 500px; height: 350px}

</style>
 
<frameset  rows="120,*"  border="0">
<frame src="HomeRow.jsp" name="frame1" marginheight="30"  scrolling="no">

<frameset cols="320,*">
<frame src="HomeColumn.jsp" name="frame2" scrolling="no">
<frame src="frame3.jsp" name="frame3" noresize="" marginheight="30" scrolling="yes">
</frameset>

</frameset>
<noframes>
<body>
<p>Could Not load</p>
</body>
</noframes>
</html>

<!-- <button type="button" class="btn btn-primary btn-md">Medium</button> -->