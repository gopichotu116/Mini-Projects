document.addEventListener("DOMContentLoaded", function () {
    // Ensure the DOM is fully loaded before attaching event listeners

    const form = document.getElementById("converter-form");
    form.addEventListener("submit", function (event) {
        event.preventDefault();
        convertCurrency();
    });
});

function convertCurrency() {
    const fromCurrency = document.getElementById("fromCurrency").value;
    const toCurrency = document.getElementById("toCurrency").value;
    const amount = parseFloat(document.getElementById("amount").value);

    if (isNaN(amount)) {
        alert("Please enter a valid number for the amount.");
        return;
    }

    // Make an AJAX request to the server (in a real-world scenario, you would use a server-side language)
    // For simplicity, we'll use the CurrencyConverter class from the Java code directly in this example
    const convertedAmount = currencyConverter.convert(fromCurrency, toCurrency, amount);

    // Display the result
    const resultElement = document.getElementById("result");
    resultElement.textContent = `${amount} ${fromCurrency} is equal to ${convertedAmount.toFixed(3)} ${toCurrency}.`;
}

// This is a simplified representation of the CurrencyConverter class from the Java code
const currencyConverter = {
    convert: function (fromCurrency, toCurrency, amount) {
        const exchangeRates = {
            "USD": 1.0,
            "EUR": 0.92,
            "GBP": 0.78,
            "INR": 83.11
            // Add more exchange rates as needed
        };

        const fromRate = exchangeRates[fromCurrency];
        const toRate = exchangeRates[toCurrency];

        if (fromRate === undefined || toRate === undefined) {
            throw new Error("Invalid currency codes.");
        }

        return amount * (toRate / fromRate);
    }
};
