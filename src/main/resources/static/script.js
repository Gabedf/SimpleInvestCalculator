document.getElementById("investmentForm").addEventListener("submit", async function(e) {
    e.preventDefault();

    const initialValue = document.getElementById("initialValue").value;
    const contributionValue = document.getElementById("contributionValue").value;
    const rate = document.getElementById("rate").value / 100; // convert % to decimal
    const time = document.getElementById("time").value;

    try {
        // call your endpoint (mapped to "/")
        const response = await fetch(`/?initialValue=${initialValue}&contributionValue=${contributionValue}&rate=${rate}&time=${time}`);
        if (!response.ok) throw new Error("Request failed");

        const result = await response.text();

        // format result as currency (US dollars)
        const formatted = new Intl.NumberFormat('en-US', {
            style: 'currency',
            currency: 'USD'
        }).format(result);

        const resultDiv = document.getElementById("result");
        resultDiv.style.display = "block";
        resultDiv.innerText = `Final amount: ${formatted}`;
    } catch (err) {
        alert("Error: " + err.message);
    }
});
