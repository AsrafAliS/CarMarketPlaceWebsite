// Function to toggle additional brand icons
function toggleBrandIconsOfcompany() {
    var additionalIcons = document.getElementById('additionalIconsOfcompany');
    if (additionalIcons.style.display === "none") {
        additionalIcons.style.display = "flex"; // Change to "inline-block" if you prefer
        document.getElementById('viewMoreButtonOfcompany').innerText = "View Less";
    } else {
        additionalIcons.style.display = "none";
        document.getElementById('viewMoreButtonOfcompany').innerText = "View More";
    }
}

// JavaScript for triggering the animation when the element comes into view
window.addEventListener('scroll', function() {
    var sectionHeading = document.querySelector('.section-heading-ofcompany');
    var bounding = sectionHeading.getBoundingClientRect();

    if (
        bounding.top >= 0 &&
        bounding.bottom <= (window.innerHeight || document.documentElement.clientHeight)
    ) {
        // Element is in view
        sectionHeading.classList.add('show');
    } else {
        // Element is out of view
        sectionHeading.classList.remove('show');
    }
});

window.addEventListener('scroll', function() {
    var partnershipIcons = document.querySelector('.partnership-icons-ofcompany');
    var bounding = partnershipIcons.getBoundingClientRect();

    if (
        bounding.top >= 0 &&
        bounding.bottom <= (window.innerHeight || document.documentElement.clientHeight)
    ) {
        // Partnership icons are in view
        partnershipIcons.classList.add('show');
    } else {
        // Partnership icons are out of view
        partnershipIcons.classList.remove('show');
    }
});

document.addEventListener("DOMContentLoaded", function() {
    const blackSlide = document.querySelector('.black-slide-ofcompany');
    const slideWidth = 20; // Width as a percentage of container width
    const container = document.querySelector('.container-ofcompany');
    const containerTop = container.offsetTop; // Get the top position of the container
    const buffer = 50; // Adjust this value as needed

    blackSlide.style.width = '0%'; // Set initial width to 0%
    let animationTriggered = false;

    // Function to trigger animation when user scrolls up to the container
    function triggerAnimation() {
        if (!animationTriggered && window.scrollY >= (containerTop - buffer)) {
            blackSlide.style.width = slideWidth + '%'; // Set width to desired percentage
            animationTriggered = true;
        }
    }

    // Listen for scroll events
    window.addEventListener('scroll', triggerAnimation);
});








document.addEventListener('DOMContentLoaded', function () {
  const smoothScrollLinks = document.querySelectorAll('a[href^="#"]');
  
  for (const smoothScrollLink of smoothScrollLinks) {
    smoothScrollLink.addEventListener('click', function (event) {
      event.preventDefault();
      
      const targetId = this.getAttribute('href');
      const targetElement = document.querySelector(targetId);
      
      if (targetElement) {
        const offsetTop = targetElement.offsetTop;
        window.scrollTo({
          top: offsetTop,
          behavior: 'smooth'
        });
      }
    });
  }
});


