# Semestrální práce na BI-TJV 2022/2023
## E-Shop
Má semestrální práce bude mít formu jednoduchého e-shopu.

## Client-side implementace
Vytvořím jednoduchý front-end za pomocí Angularu a Bootstrapu.
Bude zobrazovat do gridu produkty které si může uživatel zakoupit, umožní možná filtrování podle ceny.
Dále bude k dispozici admin panel, který se po přihlášení uživatele se správnvými privilegii zpřístupní a umožní uživatelům přidávat kredity, za které mohou nakupovat.

## Business operace
Uživatel může vytvořit objednávku a "zakoupit" si nějáký produkt. Na straně serveru je potom zapotřebí vybrat správný sklad, odebrat z něj produkt, odebrat uživateli kredity z účtu v hodnotě zakoupeného produktu a vytvořit objednávku.

## Komplexní dotaz navíc
Při tvorbě objednávky bych chtěl implementovat aby server odhadnul čas doručení. Client-side si vezme od uživatele kam má "doručit" tu objednávku. Server potom vybere nejbližší sklady které obsahují produkty které si uživatel objednal, spojí je leteckou čarou a spočítá čas doručení, pravděpodobně za pomocí BFS/Dijkstry. Předpokládejme že to bude hyper-moderní eshop co doručuje za pomoci dronů.

## Data model
![data model]](/data-model.png "data model")
