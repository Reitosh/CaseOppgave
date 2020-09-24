import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CaseMain {
    public static void main(String[] args) {
        kjorOppgave();
    }

    public static List<List<String>> csvReader(){
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader csvReader = new BufferedReader(new FileReader("datasett.csv"))) {
            csvReader.readLine(); //Leser første linje
            String line;
            while ((line = csvReader.readLine()) != null){ //Nå vil 2. linje og videre leses
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception e) {
        }

        return records;
    }

    //Metode som henter alle
    public static List<Person> getPersoner(){
        List<List<String>> val = csvReader();
        List<Person> personer = new ArrayList<>();
        for(List<String> element : val){

            Person person = new Person();
            person.seq = element.get(0);
            person.firstName = element.get(1);
            person.lastName = element.get(2);
            person.age = element.get(3);
            person.street = element.get(4);
            person.city = element.get(5);
            person.state = element.get(6);
            person.latitude = element.get(7);
            person.longitude = element.get(8);
            person.ccnumber = element.get(9);

            personer.add(person);
        }

        return personer;
    }

    //Metode for å vise gi enkel informasjon om datasettet
    public static int antallPersoner(){
        int antall;
        int count;
        getPersoner();
        count = getPersoner().size();
        antall = count - 1;

        return antall;
    }

    //Lager personobjekt som taes inn i søkemetoden for å legge til
    //i lista med søkeresultater
    public static Person lagPerson(List<String> element){
        Person person = new Person();
        person.seq = element.get(0);
        person.firstName = element.get(1);
        person.lastName = element.get(2);
        person.age = element.get(3);
        person.street = element.get(4);
        person.city = element.get(5);
        person.state = element.get(6);
        person.latitude = element.get(7);
        person.longitude = element.get(8);
        person.ccnumber = element.get(9);

        return person;
    }

    //Metode som tar inn brukerinput for å søke i datasettet
    //Tar i utgangspunkt kolonnene i datasettet og matcher input med elementer i valgt kolonne
    //Søk på ufullstendige fraser gir også match med elementer i kolonnen og henter informasjon
    public static List<Person> arraySøk(int row, String input, List<List<String>> data){
        List<Person> fantMatch = new ArrayList<>();
        for(List<String> element : data){
            if(element.get(row).contains(input)){
                fantMatch.add(lagPerson(element));
            }
        }
        return fantMatch;
    }

    //Metode for å gjengi antall unike byer
    //Informasjon til sluttbruker om datasettet
    public static int antallUnikeByer(){
        int unike;
        List<List<String>> verdi = csvReader();
        List<String> alleByer = new ArrayList<>();

        for(List<String> elementer : verdi){
            alleByer.add(elementer.get(5));
        }

        HashSet<String> hByer = new HashSet<>(alleByer);

        unike = hByer.size();

        return unike;
    }

    //Metode for å gjengi antall unike stater
    //Informasjon til sluttbruker om datasettet
    public static int antallUnikeStater(){
        int unike;
        List<List<String>> verdi = csvReader();
        List<String> alleStater = new ArrayList<>();

        for(List<String> elementer : verdi){
            alleStater.add(elementer.get(6));
        }

        HashSet<String> hStater = new HashSet<>(alleStater);

        unike = hStater.size();

        return unike;
    }

    //Denne skulle behandle tomme strenger ved input for å breake while
    //loopen for å avslutte applikasjonen.
    /*public static boolean isNullOrEmpty(String str){
        if(str != null && !str.trim().isEmpty()){
            return false;
        } else {
            return true;
        }
    }*/

    public static void kjorOppgave(){
        while (true) {
            System.out.println("Antall personer i lista er: " + antallPersoner() + " fordelt på " + antallUnikeByer() + " byer, og " +
                    antallUnikeStater() + " stater"); //Enkel info om datasettet som er lastet inn
            Scanner sc = new Scanner(System.in); //Scanner for å ta inn brukerinput
            System.out.println("Tast 1 for å søke etter en person på fornavn\n" +
                    "Tast 2 + Enter for å søke etter en person på etternavn\n" +
                    "Tast 3 + Enter for å søke etter en person på alder\n" +
                    "Tast 4 + Enter for å søke etter en person basert på gateadresse\n" +
                    "Tast 5 + Enter for å søke etter en person basert på by\n" +
                    "Tast 6 + Enter for å søke etter en person basert på stat\n"); //Valg for brukeren
                int row = Integer.parseInt(sc.nextLine()); //Tar første input og gjør om til int for å velge kolonne man søker i
                System.out.println("Skriv inn søkeord (Bruk tall for søk på alder og 2 bokstaver for søk på stat): \n");
                String input = sc.nextLine(); //Streng med søkefrase som det søkes etter, trenger ikke være et fullstendig ord
                List<List<String>> data = csvReader(); //Laster elementene i datasettet
                List<Person> personer = arraySøk(row, input, data); //Metoden som søker etter kolonne, input og hvilket datasett som brukes
                System.out.println(personer.toString()); //Printer ut informasjon om hver person som er lastet inn fra søket
                System.out.println("Antall treff: " + personer.size() + "\n" + "\n"); //Returnerer antall treff på søket
        }
    }

}