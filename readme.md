## W trakcie zajęć Java 06

Tworzenie nowego projektu

Tworzenie pliku `readme.md`

Konfiguracja `.gitignore` (`.idea/`, `out/`)

Praca z GitHub, tworzenie własnego repozytorium (`github.com`)

Pierwszy `commit`

Prządkowanie struktury projketu `packages`, `commit` zmian, wysyłanie zmian na serwer

Zarządzanie gałęziami (`branches`), wysyłanie prośby `pull request`, lączenie kodu

Prawidłowe rozłączanie konta GitHub z IntelliJ po zakończeniu pracy.

## Struktura projektu

- `src/robot` - zadanie 1 i 2.
- `src/sklep` - zadanie 3.
- `src/konstruktor` - omówienie zagdanienia konstruktora.

`Konstruktor` to specjalna metoda wywoływana automatycznie podczas tworzenia nowego obiektu (użycie słowa `new`).
Nazwa musi być identyczna jak nazwa klasy. Służy do nadania wartości początkowych obiektowi. Przeciążanie oznacza, że
możemy mieć kilka konstruktorów w jednej klasie (np. jeden ustawia tylko wiek, a drugi imię i wiek), o ile różnią się 
listą parametrów.

- `src/thisword` - słowo kluczowe `this`.

Słowo `this` w Javie jest referencją (wskaźnikiem) do bieżącego obiektu, 
w którym aktualnie znajduje się program. Używając `this`, informujemy, że dana metoda lub pole należy do klasy.
Ponadto, gdy parametr konstruktora nazywa się tak samo jak pole klasy, poprzez 'this' rozwiązujemy
konflik nazw.
- `src/sklepNowy` - zadanie 3 na nowo.
- `src/car` - zadanie 4.
