// JavaScript to handle scroll events
const navbar = document.getElementById('navbar');

// Listen for scroll events and add or remove 'scrolled' class
window.addEventListener('scroll', function() {
  if (window.scrollY > 50) {
    navbar.classList.add('scrolled');
  } else {
    navbar.classList.remove('scrolled');
  }
});

// JavaScript to handle hover events (for dynamic hover effect)
const navLinks = document.querySelectorAll('#navbar ul li a');

navLinks.forEach(link => {
  link.addEventListener('mouseenter', function() {
    link.style.color = '#ff6347'; // Change color on hover
  });

  link.addEventListener('mouseleave', function() {
    link.style.color = ''; // Reset to original color when hover ends
  });
});
