document.addEventListener("DOMContentLoaded", function() {
    const container = document.querySelector('.containerofachiev');
    const blackSlide = document.querySelector('.black-slide');
    const containerTop = container.offsetTop; // Get the top position of the container
    const buffer = 50; // Adjust this value as needed

    // Function to trigger animation when the element comes into view
    function triggerAnimation() {
        if (!blackSlide.classList.contains('show') && window.scrollY >= (containerTop - buffer)) {
            blackSlide.classList.add('show');
        } else if (blackSlide.classList.contains('show') && window.scrollY < (containerTop - buffer)) {
            blackSlide.classList.remove('show');
        }
    }

    // Listen for scroll events
    window.addEventListener('scroll', triggerAnimation);
});
