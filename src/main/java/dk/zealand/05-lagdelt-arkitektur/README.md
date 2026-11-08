# 05 – Lagdelt arkitektur

**Flow:** `Main` (præsentation) → `FileService` → `FileRepository` → fil.

**Forudsig:** Hvem opdager en manglende fil, og hvem viser beskeden?

**Afprøv:** Kør uden `data.txt`. Opret derefter filen med en tekstlinje, og kør igen.

**Ændr:** Læg en `catch (IOException e)` i `FileService` og returnér en fast tekst ved fejl. Hvad mister kalderen af information? Gendan bagefter.

**Forklar:** Hvorfor skal `FileRepository` normalt ikke udskrive fejl direkte til brugeren?
