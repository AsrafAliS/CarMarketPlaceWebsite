
        // Existing JavaScript code
        var options = {
            accessibility: true,
            prevNextButtons: true,
            pageDots: true,
            setGallerySize: false,
            arrowShape: {
                x0: 10,
                x1: 60,
                y1: 50,
                x2: 60,
                y2: 45,
                x3: 15
            }
        };

        var carousel = document.querySelector('[data-carousel]');
        var slides = document.getElementsByClassName('carousel-cell');
        var flkty = new Flickity(carousel, options);

        flkty.on('scroll', function () {
            flkty.slides.forEach(function (slide, i) {
                var image = slides[i];
                var x = (slide.target + flkty.x) * -1 / 3;
                image.style.backgroundPosition = x + 'px';
            });
        });


      
/* script for the home images for the buttons popup*/
function openForm(formName) {
    var popupForm = document.getElementById('popupForm' + formName);
    popupForm.style.display = 'block';
} 


  
  
   // JavaScript for handling form submission and animation
    const form = document.getElementById('subscription-form');
    const subscribeText = document.getElementById('custom-subscribe-text');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission behavior

        // Perform any additional validation if needed

        // Display the message with animation
        subscribeText.classList.add('fade-in');
        subscribeText.innerHTML = "<h2>You've joined! <br> We'll send you the latest updates.</h2>";
    });
  

        
