<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <p>
        Anzahl der Kartoffeln: ${allBatatasCounter}
    </p>
    <form method="POST" action="/batata/save">
        <p>Color:
            <input type="text" name="color"/>
            <input type="submit" value="Add"/>
        </p>
    </form>
</body>
</html>
