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

Unicode Support in Java

**Sualeh Fatehi**


## Unicode with Java

![bg right opacity:.5](rosetta-stone.jpg "Rosetta Stone")


## Java Support For Unicode

| Java Version | Unicode Version |
| --- | --- |
| JDK 1.0 | Unicode 1.1 |
| JDK 1.1, 1.2 | Unicode 2.0 |
| J2SE 5.0 * | Unicode 4.0 |
| Java SE 8 | Unicode 6.2 |
| Java SE 11 | Unicode 10.0 |
| Java SE 17 | Unicode 13.0 |

\* Supplementary characters assigned in Unicode 3.1


## What is a Java `char`?

![bg right opacity:.5](rosetta-stone.jpg "Rosetta Stone")


## What is a Java `char`?

- Java `char` is 16 bits
- The only unsigned primitive data type
    (Java 8 allows unsigned operations on `int` and `long`)
- Numeric value is a code point on the Basic Multilingual Plane


## Java Tries to Cope

But, Unicode code points

- cannot be represented by 16 bits
- need at least 5 + 16 = 21 bits


## Java Tries to Cope

So,

- For compatibility with Java 1.0, a `char` is still 16 bits
- Java uses **surrogate pairs** for characters outside the BMP
- Java 5 APIs allow for `int` code points instead of surrogate pairs


## Java Unicode Character Literals

```java
char ch1 = 'a';
char ch2 = '東'; // (Not an ASCII character!)
```

However,
```java
char ch3 = '𐐀'; // (Not a BMP character!)
```
is a syntax error, since 'DESERET CAPITAL LETTER LONG I' - 𐐀 needs surrogate pairs.


## Java Unicode Character Literals

- `\uHHHH` - where H is a case-insensitive hexadecimal character
- Only supports the Basic Multilingual Plane
- Supplementary characters are written as **surrogate pairs**

```java
char ch5 = '\u00EA'; // ‘ê’
String str1 = "a\u00ea\u00f1\u00fcc"; // “aêñüc”
String str2 = "A\u00EA\u00F1\u00FCC"; // “AêñüC”
```


## Java Unicode Code Point Literals

- `0xHHHHHH` - where H is a case-insensitive hexadecimal character
- Specify code plane with code point
- No surrogate pairs needed
- Not all Java APIs support `int` code points


## Java Unicode Code Point Literals

```java
// 'DESERET CAPITAL LETTER LONG I' - 𐐀
int cp = 0x010400; 
String str = new StringBuffer()
                 .appendCodePoint(cp)
                 .toString();
```

**Result:**

`str.length()` is 2
`str.codePointCount()` is 1


## Compact Strings

- Before Java 9, strings were internally `char[]`
- Java now represents strings internally as `byte[]`
- External APIs are unchanged
- Two encodings are supported internally
  - UTF-16 uses one or two bytes per character
  - Latin-1 uses one byte per character


## Java and Unicode

```java
String greekWord = "ΣΚΎΛΟΣ"; // dog
String greekLower = greekWord.toLowerCase();
```

**Result:**
`greekLower` is "σκύλος"
(Notice that the first and last letter are both sigma)


## Java and Unicode

```java
String germanWord = "straße"; // street
String germanUpper = germanWord.toUpperCase();
```

**Result:**
`germanUpper` is "STRASSE"
(Notice that the string lengths are different)


## Java Integer Parsing

```java
String hindiNumber = "१२३४५६७८९०";
int number = Integer.parseInt(hindiNumber);
```

**Result:**

`number` is 1234567890


## Java Regular Expressions

```java
String hindiNumber = "१२३४५६७८९०";
Pattern.compile("[0-9]*") // bad match
       .matcher(hindiNumber).matches();
Pattern.compile("\\p{Nd}*") // good match
       .matcher(hindiNumber).matches();
```

**Result:**
First match is false but second match is true


## Java Patterns

```java
Pattern pattern = Pattern.compile("σκύλος",
    Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

pattern.matcher("ΣΚΎΛΟΣ").matches();
```

**Result:**
Match is true


## Use the Character Class

```java
int cp; // some value assigned...
if (Character.isLetter(cp))
// ...
```

**_INSTEAD OF_**
```java
char ch; // some value assigned...
if ((ch >= 'a' && ch <= 'z') ||
    (ch >= 'A' && ch <= 'Z'))
// ...
```


## Use the Character Class

```java
int cp; // some value assigned...
if (Character.isDigit(cp))
// ...
```

**_INSTEAD OF_**
```java
char ch; // some value assigned...
if (ch >= '0' && ch <= '9')
// ...
```


## Use the Character Class: But Carefully?

```java
// 'LATIN SMALL LETTER SHARP S' - ß
char germanChar = 'ß'; 
char germanCharUpper = Character
                       .toUpperCase(germanChar);
```

**Result:**
`germanCharUpper` is 'ß' (but we expect "SS")
(No exception is thrown, and no conversion is done!)


## Use `int` Instead of `char` in Java

Many `Character` static methods take `int` code points

- `boolean isDigit(int codePoint)`
- `int toLowerCase(int codePoint)`

As do some `String` methods like

- `int indexOf(int ch)`
- `new String(int[] codePoints, int offset, int count)`


## Iterate Over Code Points

Iterate over code points using `String.codePoints()` streams

```java
"text".codePoints().forEach(System.out::print)
```
```java
"text".codePoints().toArray()
```


## Surrogates and Code Points

`Character` static methods allow conversions from surrogate pairs to code points

- `char[] toChars(int codePoint)`
- `boolean isSurrogatePair(char high, char low)`
- `int codePointAt(char[] a, int index)`


## Beware of Breakage

- Some `String` methods, such as `substring(...)` and `length()` do not understand surrogates
- `StringBuilder` `delete(...)` method may not work as intended


## Normalize Text

- Normalize text for comparison and sorting
- Java supports all the Unicode normalized forms
- Use the Normalizer class

For example, the normalized decomposition of "schön" is "scho\u0308n"

U+0308 is a 'COMBINING DIAERESIS', or ◌̈


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](qr-code.png "QR Code")

