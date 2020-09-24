- Hvordan skal applikasjonen brukes?

Applikasjonen skal brukes til å søke etter personer i et større brukerregister. 

- Hva løser applikasjonen?

Applikasjonen gjør om en uoversiktlig csv-fil til et enkelt søkerregister der brukeren kan søke etter personer
og få en liste basert på søket til brukeren. En bruker kan søke etter personer med fornavn, etternavn, alder, 
gate, by eller stat. Merk at brukeren kan søke med ufullstendige ord og få en liste med resultater med matchende søk.
Det vil si at om man for eksempel søker etter personer fra byer som inneholder frasen "kun" så vil all informasjon om personer
fra byer som inneholder søkefrasen listes. Antall treff vil også vises.

- Hvordan bygges applikasjonen?

Applikasjonen bygges i Java, ved kompilering med javac 15, Java 10 versjon 15 og kjøres direkte i IDE'n. 


- Hvordan kjører man opp applikasjonen?

Man kjører opp applikasjonen i en IDE med støtte for java og applikasjonen vil automatisk laste inn
det angitte datasettet som det skal søkes i. 

Brukeren vil få oppgitt enkel informasjon om datasettet og får presentert 6 valgalternativer.
Søket blir basert på valget til bruker dette er:
1. Fornavn (ved søk på hele navn og ikke deler av et, må stor forbokstav være med)
2. Etternavn (ved søk på hele navn og ikke deler av et, må stor forbokstav være med)
3. Alder
4. Gate
5. By
6. Stat

Deretter skriver man inn søkeord + Enter for å søke.
Resultatet av søket vises som en oversiktlig liste med antall treff på søket. 


