# Clean Code Principles in SDP-House

1. **Meaningful, Intention-Revealing Names:** Use clear and descriptive names for classes and methods (e.g., `LuxuryHouseFactory`, `BrickRoof`, `HouseCreator`) instead of generic labels.
2. **Single Responsibility Principle (SRP):** Separated the responsibility of product creation (factories) from product behavior and structure (`House` and `Roof` hierarchies).
3. **Small Methods, Doing One Thing:** Factory methods (e.g., `createHouse()`) focus strictly on instantiating and returning the requested object without mixing unrelated business logic.
4. **No Magic Numbers / Strings:** House types and family configurations are handled through explicit class hierarchies and object types rather than error-prone hardcoded strings.
5. **Validated Construction:** Throw clear exceptions (e.g., `IllegalArgumentException`) when an invalid or unknown house type is requested, preventing silent failures.