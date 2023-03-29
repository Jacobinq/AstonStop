var dropdown = document.querySelectorAll('nav li');
for (var i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener('mouseover', function() {
    this.querySelector('.dropdown').style.display = 'block';
  });
  dropdown[i].addEventListener('mouseout', function() {
    this.querySelector('.dropdown')})}
