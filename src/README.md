# Case: Politibiler Backend

Da jeg først fikk oppgaven, visste jeg at jeg ønsket å bruke Java. Jeg tenkte
at jeg ønsket å bruke Java og Spring Boot for å løse oppgavene.

Jeg har tidligere brukt Spring, men jeg har ikke brukt Spring Boot, så dette måtte
jeg sette meg inn i. Likevel fikk jeg inntrykk av at dette er mer moderne.

Det første jeg gjorde var å lage en java klasse som heter Bil og har alle attributtene jeg så at bilene
i API-et fra politiet har. 

For å sette meg inn i hvordan jeg skulle bruke Spring Boot leste jeg en del på nettet. 
Jeg fant fort ut at jeg trengte en Controller som et inngangspunkt for å sende og håndtere HTTP forespørsler.
I Controlleren min har jeg også Mappings som assosierer spesifikke URL-er med HTTP forspørslene.

Sammen med denne Controlleren trengte jeg en Service som håndterer logikken. Jeg fikk ikke helt til å hente ut dataen 
fra API-et først. Jeg fant ut at en fin måte var å lage en record som hentet ut bilene som en liste.
Servicen inneholder metoder som forteller hvordan metodene i Controlleren skal fungere. Jeg startet med en metode som 
henter ut alle bilene. Deretter laget jeg metodene som hentet dataen som ble spesifisert i oppgaven.

For å teste at metodene hentet ut riktig data brukte jeg localhost, men da jeg skulle teste post metoden min, valgte jeg
å bruke Postman på web. Her så jeg at metoden endret de riktige attributtene som jeg ønsket.

# Til ettertanke
Til neste oppgave hvor jeg får beskjed om at jeg skal skrive tester vil jeg trolig forsøke å arbeide mer med test driven
development metodikk. Dette tenker jeg fordi jeg i etterkant synes det var vanskelig å skrive tester som hadde god nok
testdekning.

For å finne ut av hvilke tester jeg ville lage måtte jeg tenke tilbake til testingen psykologi. 

# Veien videre
Videre ville jeg endret "endreStatus"-metoden slik at denne kan ta mot input fra brukeren for å endre status og oppdrag.

