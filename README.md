# Currency Converter

## Project Description

This project implements a currency converter using Java. It communicates with an API to convert currencies and displays the results via the console.

## Requirements

The currency converter must:

- Convert from the currency of Argentina to Dollar
- Convert from the currency of Brazil to Dollar
- Convert from the currency of Colombia to Dollar

It should also support inverse conversion:

- Convert from Dollar to the currency of Argentina
- Convert from Dollar to the currency of Brazil
- Convert from British Pounds to the currency of Colombia

## Usage
1. Clone this repository to your local machine.
2. register at `https://www.exchangerate-api.com/`
3. Write the password that arrived in your email in this code:
   ```Java
     final String url = "https://v6.exchangerate-api.com/v6/"YOUR_API_KEY"/" + original + "/" + toConvert + "/" + amount;

