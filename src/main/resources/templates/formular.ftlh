[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
    <main>
        <h1>Registrace na letní dětský tábor</h1>

        <form class="dite" action="/formular" method="post">

                <label for="jmeno" class="radek">Jméno:</label>
                [@spring.formInput path="form.jmeno" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="prijmeni" class="radek">Prijmeni:</label>
                [@spring.formInput path="form.prijmeni" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="datumNarozeni" class="radek">Datum narozeni:</label>
                [@spring.formInput path="form.datumNarozeni" fieldType="date" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="pohlavi" class="radek">Pohlavi:</label>
                [@spring.formSingleSelect path="form.pohlavi" options={
                    "": "",
                    "1": "chlapec",
                    "2": "divka"
                } /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="turnus" class="radek">Turnus:</label>
                [@spring.formSingleSelect path="form.turnus" options={
                    "": "",
                    "1": "1. - 10. cervence",
                    "2": "11. - 20. cervence",
                    "3": "21. - 30. cervence",
                    "4": "31. cervence - 9. srpna",
                    "5": "10. - 19. srpna",
                    "6": "20. - 29. srpna"
                } /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="email" class="radek">E-mail na rodice:</label>
                [@spring.formInput path="form.email" fieldType="email" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="email" class="radek">Telefon na rodice:</label>
                [@spring.formInput path="form.telefon" fieldType="telefon" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <div class="radek controls">
                    <button type="submit">Registrovat</button>
                </div>
        </form>
    </main>
</body>
</html>


