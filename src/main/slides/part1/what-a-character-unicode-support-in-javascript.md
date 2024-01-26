---
marp: true
draft: true
theme: uncover
headingDivider: 2
paginate: true
style: |
  section {
    text-align: left;
  }
  ul, ol, li {
    margin-left: 0;
  }
  h2 {
    font-size: 1.5rem;
    color: #0000DD;
  }
  pre {
    font-size: 1.0rem;
  }
_class:
 - lead
 - invert
---

# What a Character

Unicode Support in JavaScript

**Sualeh Fatehi**


## Unicode with JavaScript

![bg right opacity:.5](../common/rosetta-stone.jpg "Rosetta Stone")


## JavaScript Characters

- Internally, a character in JavaScript is 16 bits
- JavaScript uses **surrogate pairs** for characters outside the BMP
- JavaScript APIs allow for integer code points instead of surrogate pairs


## Unicode Character Literals

```javascript
ch1 = 'a'
ch2 = '東' // (Not an ASCII character!)
ch3 = '𐐀' // (Not a BMP character!)
```


## Unicode Character Literals

- `\uHHHH` - where H is a case-insensitive hexadecimal character
- Only supports the Basic Multilingual Plane
- Supplementary characters are represented as **surrogate pairs**

```javascript
ch5 = '\u00EA'; // ‘ê’
str1 = "a\u00ea\u00f1\u00fcc"; // “aêñüc”
str2 = "A\u00EA\u00F1\u00FCC"; // “AêñüC”
```


## Unicode Character Literals

- Supplementary characters are written as **surrogate pairs**

```javascript
// Character outside the BMP
str3 = "\uD801\uDC00"; // ‘𐐀’
```

**Result:**

length `str3.length` is 2
code points `Array.from(str3).length)` is 1


## Unicode Code Point Literals

- `0xHHHHHH` - where H is a case-insensitive hexadecimal character
- Specify code plane with code point
- No surrogate pairs needed


## Unicode Code Point Literals

```javascript
// Character outside the BMP
cp1 = 0x010400; // 𐐀
str4 = String.fromCodePoint(cp1);
```

**Result:**

length `str4.length` is 2
code points `Array.from(str4).length)` is 1


## Escape Sequences

Built-in escape sequences

![w:700](escape-sequences.png "Escape Sequences")


## Unicode Cases

```javascript
greekWord = "ΣΚΎΛΟΣ"; // dog
greekLower = greekWord.toLowerCase();
```

**Result:**
`greekLower` is "σκύλος"
(Notice that the first and last letter are both sigma)


## Unicode Cases

```javascript
germanWord = "straße"; // street
germanUpper = germanWord.toUpperCase();
```

**Result:**
`germanUpper` is "STRASSE"
(Notice that the string lengths are different)


## Unicode Integer Parsing

```javascript
hindiNumber = "१२३४५६७८९०";
number = parseInt(hindiNumber);
```

**Result:**

`number` is 1234567890


## Patterns for Unicode Numbers

```javascript
hindiNumber = "१२३४५६७८९०";
digit = /[0-9]+/
matches = digit.test(hindiNumber)
```

**Result:**
Regex does not match a string of Unicode numbers


## Patterns for Unicode Numbers

```javascript
hindiNumber = "१२३४५६७८९०";
standard_digit = /\d+/
matches = standard_digit.test(hindiNumber)
```

**Result:**
Regex does not match a string of Unicode numbers


## Patterns for Unicode Numbers

```javascript
hindiNumber = "१२३४५६७८९०";
unicode_digit = /\p{Nd}+/u
matches = unicode_digit.test(hindiNumber)
```

**Result:**
Matches on patterns with Unicode character properties


## Patterns for Unicode Categories

JavaScript supports pattern matching on Unicode character properties using the "\p{}" syntax.


## Case Insensitive Patterns

```javascript
pattern = /σκύλος/iu
matches = pattern.test("ΣΚΎΛΟΣ");
```

**Result:**
`matches` is true


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](../common/qr-code.png "QR Code")

