# Blackjack'i kaardimäng
Projekti eesmärgiks on luua populaarse kaardimängu Blackjack mõnevõrra lihtsustatud versioon. Rühmatöö esimese osa 
lõpuks peaks valmima ilma kasutajaliideseta, klaviatuurilt sisestamisega kaardimäng. 
https://en.wikipedia.org/wiki/Blackjack

Meie kaardimängus mängib hetkel diiler mängijaga kahekesi. Enne mängu algust sisestab mängija palju tal raha on 
ning kui suur on ta esimene panus. Seejärel jagab diiler kaardid välja ning mängija näeb enda kaarte ja diileri ühte 
kaarti. Kontrollitakse, kas kellelgi on blackjack(kas kaartide väärtus on 21). Nüüd peab mängija oma kaaride väärtuste
põhjal otsustama paju veel panustada ning kas võtta veel kaarte nii, et 21-st üle ei lähe. Kui mängijal on kaartide
väärtus väike arv võiks ta valida _hit_ ja saada kaardi(d), kui mängija arvab, et tal on kaartide
väärtus piisav,võiks ta valida _stand_. Mängija uued panused ei tohi olla suuremad, kui esimene panus enne kaartide nägemist!
Nüüd kui vaja, võtab diiler vajaliku arvu kaarte, et saada võimalikult 21-le ligidal arv või täpselt 21 nii, et 21-st üle ei 
minda, nagu mängijagi. Kui diiler läheb üle 21 ja mängija mitte, võidab mängija, kui mängija oli juba üle 21 läinud 
võidab diiler. Mängija kaotab oma panustatud raha kaotades. Kui mõlemate kaartide väärtused jäid võrdseks ei kaota keegi
raha ja on viik ehk _push_. Kui mängija võidab blackjackiga siis võidab ta 250% panustatud summast.

#### Autorid:  
* Gerli Kõiv
* Maksim Makarskiy

### Klasside kirjeldused
```
Main: peameetod, suhtleb mängijaga, alustab mängijaga mängu, kasutaja info GUI, reeglite leht

Blackjack: startPlay() - kogu mängu loogika, väga tähtis klass, kasutab kõikide teist klasside meetodeid mängu loomiseks
(loob käed diilerile ja mängijale, tehakse kaardipakk), diileri tegevused: dealerTurn() ja dealerTurnPlayerHasBlackJack, 
betCheck() kontrollib panuse suurust, suhtleb mängijaga, mängu GUI 

Hand: loob käe listi, arvutab käe väärtuse, lisab kaarte juurde, kontrollib kas on blackjack, lõhki(busted)

Deck: loob listi Card istenditega, üks deck ehk pakk on 52 kaarti, drawCards() - tähtis meetod saab tõmmata n arv kaarte
etteantud isikule, väljastab kaardinimede listi, mis pakist tõmmati

Card: loob isendi kaart, kaardil peab olema mast(suit) ja väärtus/nimi
```

### Projekti tegemise kirjeldus
1) Otsustamine mis klasse teha. Mõlemad nõustusime alguses, et on vaja klasse Deck, Card, Player, Bank või muu selline.
Lõpuks polnud klassi Hand tõttu klasse Player, Dealer enam vaja.

2) Gerli alustas peaklassist mängijaga suhtluse alustamisega. Pani kirja kõik muutujad mida võib vaja minna.
Alustas mänguloogika paika panemisega. Lõi klassid Blackjack ja Hand. Alustas käe väärtuse arvutamisega, kaartide välja 
jagamise meetodid. Pärast panuse tegemist peab raha maha arvutama. Alustas GUI tegemisega.

3) Maksim tegi kogu mängu loogika Blackjacki klassi, kohandas teised klassid vastavalt, kustutas Player ja Dealer klassi.
Lisas mängijale pärast kaartide nägemist uuesti panuse küsimise. Lisas mängijale _hit_ ja _stand_ valiku. Diileri tegevused.

4) Gerli alustas graafilise liidese tegemisega.

### Panus
```
Gerli: 18h (tegi kõik klassid ja lõi mängu põhjaks olevaid muutujaid ja meetodeid, alustas GUI tegemisega)
Maksim:  8h (tegi suurema osa mängu loogikast, sai aru et Player ja Dealer klasse pole vaja)
```

### Mured
Vahel polnud kindel, mis klassi meetod või osad muutujad teha või kas peaks kasutama alam- ja ülemklasse. 
Panuste ja võidusummade arvud võivad mõne tundmatu stsenaariumiga veel katki olla.

JavaFX, piltide lisamine, komponentide paigutamine, komponentide peitmine ja õigel ajal näitamine.

### Hinnang
Kuna polnud varem JavaFX-iga kokku puutunud tekkis muresid kuidas koodi arusaadavaks/ilusaks teha või kuidas üldse mõnda
funtktsionaalsust teha. Kui oleks varem alustanud oleks rohkem funktsionaalsusi valmis muidugi.
Hetkel jäi teha veel:
- Reeglite leht alguses
- Täiustada kasutaja info lehte (peaks ka tegema nupu "Mängima")
- Kuvada mängulaual üleval diileri kätt ja all mängija kätt, mängija rahakoti seisu
- Mängija saab panustada, sisestada oma summa, raha läheb maha
- Nupud Hit ja Stand töötavad ja kuvatakse õigel ajal õige arv kordi ja õigesse kohta
- Kaardid ilmuvad lauale õigesti
- Diileri kaartidel näidatakse tagumist poolt
- Kui mäng saab läbi öeldakse, kes võitis, vastav leht või teavituskast
- GUI ilusamaks, custom nupu stiilid

### Selgitused
Testisime projekti manuaalselt - programmi tööle pannes ja läbi mängides või InelliJ'i _debuggeriga_ ehk _black box_ meetodiga




# Blackjack card game in java
This is a school project which aims to further enhance the authors' programming skills and
understanging of Java + JavaFX framework.

Card images from: http://acbl.mybigcommerce.com/52-playing-cards/

