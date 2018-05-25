<html>
	<head>
		<title>人员信息表</title>
		<meta charset="utf-8" />
	</head>
	<body>
		<table border="1" width="500" height="200">
	      <tr>
	          <th>ID</th>
	          <th>NAME</th>
	          <th>SEX</th>
	          <th>ADDRESS</th>
	      </tr>
	      <#list list as user>
	          <tr>
	             <td>${user.id}</td>
	             <td>${user.name}</td>
	             <td>${user.sex}</td>
	             <td>${user.address}</td>
	          </tr>
	      </#list>
    </table>
	</body>
</html>