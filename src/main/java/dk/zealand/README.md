# Exception handling og Text I/O – Java-eksempler

Kodeeksempler til undervisningsmaterialet **12 – Exception Handling and Text I/O** på datamatikeruddannelsens 1. semester.

## Sådan bruger du projektet

1. Download ZIP fra GitHub og pak den ud, eller clone repositoryet.
2. Åbn **én eksempelmappe ad gangen** i IntelliJ (File → Open).
3. Åbn `Main.java`, og kør `main()` via den grønne Run-knap.
4. Læs mappens `README.md`, forudsig resultatet, kør og ændr koden.

**Vigtigt:** Hver mappe er et *selvstændigt lille Java-projekt*. Flere mapper har derfor deres egen `Main.java`. Åbn dem enkeltvis i IntelliJ – ikke som én samlet source root. Eksemplerne bruger Java 17+ og ingen eksterne biblioteker.

## Eksempler og sammenhæng til dokumentet

| Mappe | Tema | Afsnit i Word |
|---|---|---|
| [01-crash-og-stacktrace](01-crash-og-stacktrace/) | Ubehandlet exception og stacktrace | 1 |
| [02-try-catch](02-try-catch/) | Inputfejl og ny indtastning | 2 |
| [03-flere-catch](03-flere-catch/) | Flere fejltyper og rækkefølge | 2–3 |
| [04-throw-og-throws](04-throw-og-throws/) | Kaste fejl og sende dem videre | 4 |
| [05-lagdelt-arkitektur](05-lagdelt-arkitektur/) | Main → Service → Repository | 5 |
| [06-files-laes-og-skriv](06-files-laes-og-skriv/) | Files, Path og IOException | 6 |
| [07-buffered-reader-writer](07-buffered-reader-writer/) | Filadgang linje for linje | 7 |
| [08-finally-og-resources](08-finally-og-resources/) | finally og try-with-resources | 8 |
| [09-egen-exception](09-egen-exception/) | Brugerdefineret checked exception | 9 |

## Faglig pointe

Et eksempel viser en **teknik**, ikke en færdig løsning på feedbackopgaven. Brug de tilhørende opgaveark til selv at anvende teknikken. Se også [ExceptionWorkshopApp](https://github.com/krollchristensen/ExceptionWorkshopApp) som selvstudie i lagdelt arkitektur.

## Kør fra terminalen (valgfrit)

Stå i mappen til ét eksempel og kør:

```bash
javac *.java
java Main
```

I eksempel 01 stopper programmet med vilje med en exception. Nogle eksempler læser og skriver filer i den mappe, hvorfra programmet køres. Filerne er eksempeldata og kan slettes igen.
