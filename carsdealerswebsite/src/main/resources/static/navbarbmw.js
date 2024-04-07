function toggleMenu() {
    var menu = document.getElementById("menu");
    if (menu.style.left === "0px") {
      menu.style.left = "-250px"; // Slide out the menu
    } else {
      menu.style.left = "0px"; // Slide in the menu
    }
  }
  