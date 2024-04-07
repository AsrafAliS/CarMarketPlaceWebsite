function scrollToSection(sectionId) {
    const section = document.getElementById(sectionId);
    if (section) {
        section.scrollIntoView({ behavior: 'smooth' });
    }
}



function toggleDetails(sectionId) {
    var section = document.getElementById(sectionId);
    section.classList.toggle("details-visible");
}

function toggleDetails(sectionId) {
    var section = document.getElementById(sectionId);
    section.classList.toggle("details-visible");
}

function openCarForm() {
    document.getElementById("carFormPopup").style.display = "block";
}

function closeCarForm() {
    document.getElementById("carFormPopup").style.display = "none";
}

document.getElementById("basicEquipmentBtn").addEventListener("click", function() {
    openCarForm();
});



function openForm() {
    document.getElementById("formPopupSection2").classList.add("show");
}

function closeForm() {
    document.getElementById("formPopupSection2").classList.remove("show");
}

/* section 3 */


// Function to copy the link
function copyLink() {
    const copyText = document.querySelector('.copy-link input');
    copyText.select();
    document.execCommand('copy');
    alert('Link copied to clipboard!');
}



/* for the buttons */

// Get references to the buttons
var testDriveBtn = document.getElementById('testDriveBtn');
var buyOnlineBtn = document.getElementById('buyOnlineBtn');

// Add event listeners to the buttons
testDriveBtn.addEventListener('click', function() {
    // Redirect to the test drive page
    window.location.href = 'https://bmwindia.co.in/offers/testdrive/?bmw_leadsource=ConfiguratorCTAorganic'; // Replace 'test-drive-page.html' with the actual URL of your test drive page
});

buyOnlineBtn.addEventListener('click', function() {
    // Redirect to the buy online page
    window.location.href = 'https://shop.bmw.in/#/stock-locator/config/bk04rl8s'; // Replace 'buy-online-page.html' with the actual URL of your buy online page
});


