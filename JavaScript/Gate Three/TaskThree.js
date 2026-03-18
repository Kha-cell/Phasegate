
function countChars(str) {
  let result = '';
  let currentChar = str[0].toLowerCase();
  let count = 1;

  for (let i = 1; i <= str.length; i++) {
    if (i === str.length || str[i].toLowerCase() !== currentChar) {
      result += str[i-1].toUpperCase() + count + ' ';
      if (i < str.length) {
        currentChar = str[i].toLowerCase();
        count = 1;
      }
    } else {
      count++;
    }
  }

  return result.trim();
}