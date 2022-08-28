<!DOCTYPE html>
<html>
<head>
<title>ESP Web Server</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
.b
{
text-decoration: none;
border: none;
background-color: grey;
color: white;
padding: 15px 30px;
}
</style>

</head>

<body>
<h1>Inbuilt LED</h1>
<p>GPIO state: """ + gpio_state + """
<p>
<a href="/?led=on"><button class="b" style="margin-right: 10px;">ON</button></a>
<a href="/?led=off"><button class="b">OFF</button></a>
</p>
</body>	
</html>